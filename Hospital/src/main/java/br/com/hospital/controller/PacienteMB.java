package br.com.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.hospital.business.MunicipioBO;
import br.com.hospital.business.PessoaBO;
import br.com.hospital.business.TipoPlanoSaudeBO;
import br.com.hospital.business.UnidadeFederativaBO;
import br.com.hospital.pojo.Municipio;
import br.com.hospital.pojo.Paciente;
import br.com.hospital.pojo.Pessoa;
import br.com.hospital.pojo.TipoPlanoSaude;
import br.com.hospital.pojo.UnidadeFederativa;


@ManagedBean
@RequestScoped
public class PacienteMB {
	
	private Pessoa pessoa;
	private Paciente paciente;
	private UnidadeFederativa unidadeFederativa;
	private Municipio municipio;
	private TipoPlanoSaude tipoPlanoSaude;
	private List<TipoPlanoSaude> tiposPlanoSaude;
	private List<Municipio> municipios;
	private List<UnidadeFederativa> unidadeFederativas;
	private List<Pessoa> pacientes;
	private List<SelectItem> comboTipoPlanoSaude;
	private List<SelectItem> comboUf;
	private List<SelectItem> comboMunicipio;	
	
	private Integer idPlanoSaude;	
	private PessoaBO pessoaBO;
	private TipoPlanoSaudeBO tipoPlanoSaudeBO;
	private UnidadeFederativaBO unidadeFederativaBO;
	private MunicipioBO municipioBO;
	
	@PostConstruct
	public void inicio(){
		pessoa = new Pessoa();
		paciente = new Paciente();
		municipio = new Municipio();
		unidadeFederativa = new UnidadeFederativa();
		tipoPlanoSaude = new TipoPlanoSaude();
		pessoaBO = new PessoaBO();
		tipoPlanoSaudeBO = new TipoPlanoSaudeBO();
		unidadeFederativaBO = new UnidadeFederativaBO();
		municipioBO = new MunicipioBO();
		tiposPlanoSaude = new ArrayList();
		unidadeFederativas = new ArrayList();
		municipios = new ArrayList();
		listarTipoPlanoSaude();
		listarUf();
		listarCidade();
		pacientes = listar();
	}
	
	public void salvar(Pessoa pessoa){
		if(pessoaBO.salvar(pessoa))
			System.out.println("Salvo com sucesso!");
	}
	
	public void atualizar(Pessoa pessoa){
		if(pessoaBO.atualizar(pessoa))
			System.out.println("Atualizado com sucesso!");
	}
	
	public void deletar(Pessoa pessoa){
		if(pessoaBO.deletar(pessoa))
			System.out.println("Deletado com sucesso!");
	}
	
	public List<Pessoa> listar(){
		return pessoaBO.listar();
	}
	
	public void listarTipoPlanoSaude(){   		
		tiposPlanoSaude = tipoPlanoSaudeBO.listar();
		comboTipoPlanoSaude = new ArrayList<SelectItem>(); 
        SelectItem si = new SelectItem();
        si.setLabel("Selecione");
        si.setValue("0");        
        comboTipoPlanoSaude.add(si);        
        for(TipoPlanoSaude planos : tiposPlanoSaude){
        	si = new SelectItem();
            si.setLabel(planos.getTipsNmNome());
            si.setValue(planos.getTipsIdTipo());
            comboTipoPlanoSaude.add(si);
        }
    }	
	
	public void listarUf(){   		
		unidadeFederativas = unidadeFederativaBO.listar();
        comboUf = new ArrayList<SelectItem>(); 
        SelectItem si = new SelectItem();
        si.setLabel("Selecione");
        si.setValue("0");        
        comboUf.add(si);        
        for(UnidadeFederativa unidades : unidadeFederativas){
        	si = new SelectItem();
            si.setLabel(unidades.getUnfeNmUnidade());
            si.setValue(unidades.getUnfeIdUnidade());
            comboUf.add(si);
        }
    }	
	
	public void listarCidade(){	
		System.out.println("Acessou");
		municipios = municipioBO.listarPorNome("unidadeFederativaUnfeIdUnidade", unidadeFederativa.getUnfeIdUnidade());
        comboMunicipio = new ArrayList<SelectItem>(); 
        SelectItem si = new SelectItem();
        si.setLabel("Selecione");
        si.setValue("0");        
        comboMunicipio.add(si);        
        for(Municipio municipio : municipios){
        	si = new SelectItem();
            si.setLabel(municipio.getMuniNmMunicipio());
            si.setValue(municipio.getMuniIdMunicipio());
            comboMunicipio.add(si);
        }
    }

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public List<SelectItem> getComboTipoPlanoSaude() {
		return comboTipoPlanoSaude;
	}

	public void setComboTipoPlanoSaude(List<SelectItem> comboTipoPlanoSaude) {
		this.comboTipoPlanoSaude = comboTipoPlanoSaude;
	}

	public List<SelectItem> getComboUf() {
		return comboUf;
	}

	public void setComboUf(List<SelectItem> comboUf) {
		this.comboUf = comboUf;
	}

	public List<SelectItem> getComboMunicipio() {
		return comboMunicipio;
	}

	public void setComboMunicipio(List<SelectItem> comboMunicipio) {
		this.comboMunicipio = comboMunicipio;
	}

	public Integer getIdPlanoSaude() {
		return idPlanoSaude;
	}

	public void setIdPlanoSaude(Integer idPlanoSaude) {
		this.idPlanoSaude = idPlanoSaude;
	}

	public List<Pessoa> getPacientes() {
		return pacientes;
	}

	public void setPacienntes(List<Pessoa> pacientes) {
		this.pacientes = pacientes;
	}	
	
	
}
