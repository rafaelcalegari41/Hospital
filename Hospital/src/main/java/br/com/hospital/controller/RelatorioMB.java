package br.com.hospital.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import br.com.hospital.pojo.Paciente;

@ManagedBean
@RequestScoped
public class RelatorioMB {
	
	private static Connection conexao = null;
	private Paciente paciente;
	
	@PostConstruct
	public void inicio(){
		paciente = new Paciente();
	}
	
	
	
	public void gerarRelatorioAtendimento(){		
		Map<String, Object> parametros = new HashMap<String, Object>();		
		parametros.put("nome", "");	
		parametros.put(JRParameter.REPORT_LOCALE, new Locale("pt","BR")); 
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
		response.setContentType("application/pdf");
		response.setHeader("Content-disposition", "inline; filename=\"atendimento.pdf\"");
		
		try {
			ServletContext scontext = (ServletContext) facesContext.getExternalContext().getContext();
			JasperPrint impressoraJasper = JasperFillManager.fillReport(scontext.getRealPath("/WEB-INF/relatorios/atendimento_paciente.jasper"), 
					parametros, conexao);
			ServletOutputStream streamDeSaida = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(impressoraJasper,streamDeSaida);
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		facesContext.responseComplete();
		facesContext.renderResponse();
	}
	
	
	
	public RelatorioMB(){
		try {			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital",
					                        "root", 
					                        "nando");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if(conexao == null)
			new RelatorioMB();
		return conexao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}	
	
	

}
