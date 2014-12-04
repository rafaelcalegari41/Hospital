package br.com.hospital.model;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.hospital.util.HibernateUtil;

public class GenericDAO<T, PK> {

	private SessionFactory sessionFactory;
	private Session session;
	private Class<?> clazz;

	public GenericDAO() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
		this.session = sessionFactory.openSession();
	}

	public T getById(PK pk) {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.load(clazz, (Serializable) pk);
			session.flush();
			transaction.commit();
		} catch (Exception erro) {
			transaction.rollback();
		} finally {
			session.close();
		}

		return (T) clazz;
	}

	public void save(T entity) {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(entity);
			session.flush();
			transaction.commit();
		} catch (Exception erro) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void update(T entity) {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(entity);
			session.flush();
			transaction.commit();
		} catch (Exception erro) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void delete(T entity) {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(entity);
			session.flush();
			transaction.commit();
		} catch (Exception erro) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public List<T> findAll() {
		List<?> list = null;
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Query query = session.createQuery("from " + clazz.getName());
			list = query.list();
			transaction.commit();
		} catch (Exception erro) {
			transaction.rollback();
		} finally {
			session.close();
		}
		
		return (List<T>) list;
	}

	private Class<?> getTypeClass() {
		clazz = (Class<?>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
		return clazz;
	}
}