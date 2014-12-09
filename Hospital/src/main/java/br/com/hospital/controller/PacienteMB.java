package br.com.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.hospital.model.MunicipioDAO;
import br.com.hospital.model.PessoaDAO;
import br.com.hospital.model.TipoPlanoSaudeDAO;
import br.com.hospital.model.UnidadeFederativaDAO;
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
	private List<TipoPlanoSaude> tiposPlanoSaude;
	private List<Municipio> municipios;
	private List<UnidadeFederativa> unidadeFederativas;
	private List<SelectItem> comboTipoPlanoSaude;
	private List<SelectItem> comboUf;
	private List<SelectItem> comboMunicipio;	
	private TipoPlanoSaude tipoPlanoSaude;
	private UnidadeFederativa unidadeFederativa;
	private Municipio municipio;
	private Integer idPlanoSaude;
	private PessoaDAO dao = new PessoaDAO();
	private TipoPlanoSaudeDAO daoTipoPlano = new TipoPlanoSaudeDAO();
	private MunicipioDAO municipioDAO = new MunicipioDAO();
	private UnidadeFederativaDAO unidadeFederativaDAO = new UnidadeFederativaDAO();
	
	@PostConstruct
	public void inicio(){
		pessoa = new Pessoa();
		paciente = new Paciente();
		municipio = new Municipio();
		unidadeFederativa = new UnidadeFederativa();
		tipoPlanoSaude = new TipoPlanoSaude();
		tiposPlanoSaude = new ArrayList();
		unidadeFederativas = new ArrayList();
		municipios = new ArrayList();
		listarTipoPlanoSaude();
		listarUf();
		listarCidade();
	}
	
	public void listarTipoPlanoSaude(){   		
		tiposPlanoSaude = daoTipoPlano.findAll();
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
		unidadeFederativas = unidadeFederativaDAO.findAll();
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
		municipios = municipioDAO.findByName("unidadeFederativaUnfeIdUnidade", unidadeFederativa.getUnfeIdUnidade());
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
	
	public void salvar(){
		System.out.println(pessoa.getPessNmNome());
		
		//dao.save(pessoa);
	}
	
	public void atualizar(){
		dao.update(pessoa);
	}
	
	public void deletar(){
		dao.delete(pessoa);
	}
	
	public List<Pessoa> listar(){
		return dao.findAll();
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

	public List<SelectItem> getComboUf() {
		return comboUf;
	}

	public void setComboUf(List<SelectItem> comboUf) {
		this.comboUf = comboUf;
	}
	
	public List<SelectItem> getComboTipoPlanoSaude() {
		return comboTipoPlanoSaude;
	}

	public void setComboTipoPlanoSaude(List<SelectItem> comboTipoPlanoSaude) {
		this.comboTipoPlanoSaude = comboTipoPlanoSaude;
	}

	public TipoPlanoSaude getTipoPlanoSaude() {
		return tipoPlanoSaude;
	}

	public void setTipoPlanoSaude(TipoPlanoSaude tipoPlanoSaude) {
		this.tipoPlanoSaude = tipoPlanoSaude;
	}

	public Integer getIdPlanoSaude() {
		return idPlanoSaude;
	}

	public void setIdPlanoSaude(Integer idPlanoSaude) {
		this.idPlanoSaude = idPlanoSaude;
	}

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public List<SelectItem> getComboMunicipio() {
		return comboMunicipio;
	}

	public void setComboMunicipio(List<SelectItem> comboMunicipio) {
		this.comboMunicipio = comboMunicipio;
	}
	
	
	
	
}
