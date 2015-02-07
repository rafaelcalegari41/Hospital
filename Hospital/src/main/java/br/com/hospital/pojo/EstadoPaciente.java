package br.com.hospital.pojo;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado_paciente")
public class EstadoPaciente implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer espaIdEstado;
	private String espaNmEstado;

	public EstadoPaciente() {
	}

	public EstadoPaciente(String espaNmEstado) {
		this.espaNmEstado = espaNmEstado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ESPA_ID_ESTADO", unique = true, nullable = false)
	public Integer getEspaIdEstado() {
		return this.espaIdEstado;
	}

	public void setEspaIdEstado(Integer espaIdEstado) {
		this.espaIdEstado = espaIdEstado;
	}

	@Column(name = "ESPA_NM_ESTADO", length = 100)
	public String getEspaNmEstado() {
		return this.espaNmEstado;
	}

	public void setEspaNmEstado(String espaNmEstado) {
		this.espaNmEstado = espaNmEstado;
	}

}
