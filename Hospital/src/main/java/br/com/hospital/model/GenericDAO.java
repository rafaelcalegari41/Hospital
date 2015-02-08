package br.com.hospital.model;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.com.hospital.util.HibernateUtil;

public class GenericDAO<T, ID extends Serializable> {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	private Session session;
	private Class<?> object = getObject();

	public boolean save(T entity) {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(entity);
			session.flush();
			transaction.commit();
			return true;
		} catch (Exception erro) {
			transaction.rollback();
			return false;
		} finally {
			session.close();
		}
	}

	public boolean update(T entity) {	
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(entity);
			session.flush();
			transaction.commit();
			return true;
		} catch (Exception erro) {
			transaction.rollback();
			return false;
		} finally {
			session.close();
		}
	}

	public boolean delete(T entity) {	
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(entity);
			session.flush();
			transaction.commit();
			return true;
		} catch (Exception erro) {
			transaction.rollback();
			return false;
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public T findById(ID id) {
		T instance = null;	
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			instance = (T) session.load(object, id);			
			session.flush();
			transaction.commit();			
		} catch (Exception erro) {
			transaction.rollback();			
		} finally {
			session.close();
		}

		return instance;
	}
	
	public List<T> findByName(String parametro, String valor) {
		List<?> list = null;		
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			//Criteria criteria = session.createCriteria(object);
                        Query query = session.createQuery(parametro);
			//Criteria criteria = session..createCriteria(parametro);
                        //criteria.add(Restrictions.eq(parametro, valor));
			list = query.list();
			session.flush();
			transaction.commit();
		} catch (Exception erro) {
                        System.out.println(erro);
			transaction.rollback();
		} finally {
			session.close();
		}

		return (List<T>) list;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		List<?> list = null;	
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			Query query = session.createQuery("from " + object.getName());
			list = query.list();
			transaction.commit();
		} catch (Exception erro) {
                        System.out.println(erro);
			transaction.rollback();
		} finally {			
			session.close();
		}
		
		return (List<T>) list;
	}

	private Class<?> getObject() {
		object = (Class<?>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		return object;
	}
}