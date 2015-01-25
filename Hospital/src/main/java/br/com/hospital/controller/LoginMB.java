package br.com.hospital.controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@ManagedBean
@RequestScoped
public class LoginMB {
	
	public String login() throws ServletException, IOException{
		ExternalContext contexto = FacesContext.getCurrentInstance().getExternalContext();
		RequestDispatcher expedir = ((ServletRequest) contexto.getRequest()).getRequestDispatcher("/j_spring_security_check");
		expedir.forward((ServletRequest) contexto.getRequest(), (ServletResponse) contexto.getResponse());
		FacesContext.getCurrentInstance().responseComplete();		
		return null;	
	}

}
