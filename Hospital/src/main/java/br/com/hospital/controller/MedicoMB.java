package br.com.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.hospital.business.MedicoBO;
import br.com.hospital.business.MunicipioBO;
import br.com.hospital.business.UnidadeFederativaBO;
import br.com.hospital.pojo.Medico;
import br.com.hospital.pojo.Municipio;
import br.com.hospital.pojo.Pessoa;
import br.com.hospital.pojo.TipoAcesso;
import br.com.hospital.pojo.UnidadeFederativa;


@ManagedBean
@RequestScoped
public class MedicoMB {
	
	private Pessoa pessoa;
        private TipoAcesso tipoAcesso;       
        private UnidadeFederativa unidadeFederativa;
        private Municipio municipio;
        private List<Municipio> municipios;
        private List<UnidadeFederativa> unidadeFederativas;
        private List<SelectItem> comboUf;
        private List<SelectItem> comboMunicipio;
        private UnidadeFederativaBO unidadeFederativaBO;
        private MunicipioBO municipioBO;
        private List<Medico> medicos;
        private MedicoBO medicoBO;
	
	@PostConstruct
	public void inicio(){
            pessoa = new Pessoa();
            tipoAcesso = new TipoAcesso();           
            municipio = new Municipio();
            unidadeFederativa = new UnidadeFederativa();
            unidadeFederativas = new ArrayList();
            municipios = new ArrayList();
            unidadeFederativaBO = new UnidadeFederativaBO();
            municipioBO = new MunicipioBO();
            listarUf();
            listarCidade();
            medicos = medicoBO.listar();
	}
        
        public void salvar(){
            
        }
        
        public void listarUf() {
        unidadeFederativas = unidadeFederativaBO.listar();
        comboUf = new ArrayList<SelectItem>();
        SelectItem si = new SelectItem();
        si.setLabel("Selecione");
        si.setValue("0");
        comboUf.add(si);
        for (UnidadeFederativa unidades : unidadeFederativas) {
            si = new SelectItem();
            si.setLabel(unidades.getUnfeNmUnidade());
            si.setValue(unidades.getUnfeIdUnidade());
            comboUf.add(si);
        }
    }

    public void listarCidade() {
        System.out.println("Acessou"+ unidadeFederativa.getUnfeIdUnidade());
        municipios = municipioBO.listarPorNome("from Municipio", unidadeFederativa.getUnfeIdUnidade().toString());
        comboMunicipio = new ArrayList<SelectItem>();
        SelectItem si = new SelectItem();
        si.setLabel("Selecione");
        si.setValue("0");
        comboMunicipio.add(si);
            if(municipios != null){
                 for (Municipio municipio : municipios) {
                si = new SelectItem();
                si.setLabel(municipio.getMuniNmMunicipio());
                si.setValue(municipio.getMuniIdMunicipio());
                comboMunicipio.add(si);
            }
            
        }
       
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoAcesso getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(TipoAcesso tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
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

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public List<UnidadeFederativa> getUnidadeFederativas() {
        return unidadeFederativas;
    }

    public void setUnidadeFederativas(List<UnidadeFederativa> unidadeFederativas) {
        this.unidadeFederativas = unidadeFederativas;
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

    public UnidadeFederativaBO getUnidadeFederativaBO() {
        return unidadeFederativaBO;
    }

    public void setUnidadeFederativaBO(UnidadeFederativaBO unidadeFederativaBO) {
        this.unidadeFederativaBO = unidadeFederativaBO;
    }

    public MunicipioBO getMunicipioBO() {
        return municipioBO;
    }

    public void setMunicipioBO(MunicipioBO municipioBO) {
        this.municipioBO = municipioBO;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
    
    
    
    
    
    
    
        
        
}