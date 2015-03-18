package br.com.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.hospital.business.MunicipioBO;
import br.com.hospital.business.PacienteBO;
import br.com.hospital.business.PessoaBO;
import br.com.hospital.business.PlanoSaudeBO;
import br.com.hospital.business.TipoPlanoSaudeBO;
import br.com.hospital.business.UnidadeFederativaBO;
import br.com.hospital.pojo.Municipio;
import br.com.hospital.pojo.Paciente;
import br.com.hospital.pojo.Pessoa;
import br.com.hospital.pojo.PlanoDeSaude;
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
    private PlanoDeSaude planoSaude;
    private List<TipoPlanoSaude> tiposPlanoSaude;
    private List<PlanoDeSaude> planosSaude;
    private List<Municipio> municipios;
    private List<UnidadeFederativa> unidadeFederativas;
    private List<Paciente> pacientes;
    private List<SelectItem> comboTipoPlanoSaude;
    private List<SelectItem> comboUf;
    private List<SelectItem> comboMunicipio;
    private List<SelectItem> comboPlanoSaude;

    private Integer idPlanoSaude;
    private PessoaBO pessoaBO;
    private PacienteBO pacienteBO;
    private TipoPlanoSaudeBO tipoPlanoSaudeBO;
    private PlanoSaudeBO planoSaudeBO;
    private UnidadeFederativaBO unidadeFederativaBO;
    private MunicipioBO municipioBO;

    @PostConstruct
    public void inicio() {
        pessoa = new Pessoa();
        paciente = new Paciente();
        municipio = new Municipio();
        unidadeFederativa = new UnidadeFederativa();
        tipoPlanoSaude = new TipoPlanoSaude();
        planoSaude = new PlanoDeSaude();
        pessoaBO = new PessoaBO();
        tipoPlanoSaudeBO = new TipoPlanoSaudeBO();
        unidadeFederativaBO = new UnidadeFederativaBO();
        municipioBO = new MunicipioBO();
        planoSaudeBO = new PlanoSaudeBO();
        pacienteBO = new PacienteBO();
        tiposPlanoSaude = new ArrayList();
        unidadeFederativas = new ArrayList();
        municipios = new ArrayList();
        planosSaude = new ArrayList();
        listarTipoPlanoSaude();
        listarUf();
        listarCidade();
        listarPlanoSaude();
        pacientes = pacienteBO.listar();
    }

    public void salvar(Pessoa pessoa) {
        if (pessoaBO.salvar(pessoa)) {
            System.out.println("Salvo com sucesso!");
        }
    }

    public void atualizar(Pessoa pessoa) {
        if (pessoaBO.atualizar(pessoa)) {
            System.out.println("Atualizado com sucesso!");
        }
    }

    public void deletar(Pessoa pessoa) {
        if (pessoaBO.deletar(pessoa)) {
            System.out.println("Deletado com sucesso!");
        }
    }

   
    
    public void listarPlanoSaude() {
//        planosSaude = planoSaudeBO.listar();
//        comboPlanoSaude = new ArrayList<SelectItem>();
//        SelectItem si = new SelectItem();
//        si.setLabel("Selecione");
//        si.setValue("0");
//        comboPlanoSaude.add(si);
//        for (PlanoDeSaude planoSaude : planosSaude) {
//            si = new SelectItem();
//            si.setLabel(planoSaude.getPessoa().getPessNmNome());
//            si.setValue(planoSaude.getPldsIdPessoa());
//            comboPlanoSaude.add(si);
//        }
    }

    public void listarTipoPlanoSaude() {
//        tiposPlanoSaude = tipoPlanoSaudeBO.listar();
//        comboTipoPlanoSaude = new ArrayList<SelectItem>();
//        SelectItem si = new SelectItem();
//        si.setLabel("Selecione");
//        si.setValue("0");
//        comboTipoPlanoSaude.add(si);
//        for (TipoPlanoSaude planos : tiposPlanoSaude) {
//            si = new SelectItem();
//            si.setLabel(planos.getTipsNmNome());
//            si.setValue(planos.getTipsIdTipo());
//            comboTipoPlanoSaude.add(si);
//        }
    }

    public void listarUf() {
//        unidadeFederativas = unidadeFederativaBO.listar();
//        comboUf = new ArrayList<SelectItem>();
//        SelectItem si = new SelectItem();
//        si.setLabel("Selecione");
//        si.setValue("0");
//        comboUf.add(si);
//        for (UnidadeFederativa unidades : unidadeFederativas) {
//            si = new SelectItem();
//            si.setLabel(unidades.getUnfeNmUnidade());
//            si.setValue(unidades.getUnfeIdUnidade());
//            comboUf.add(si);
//        }
    }

    public void listarCidade() {
//        municipios = municipioBO.listarPorNome("from Municipio where unidadeFederativa.unfeIdUnidade = "+unidadeFederativa.getUnfeIdUnidade(),"");
//        comboMunicipio = new ArrayList<SelectItem>();
//        SelectItem si = new SelectItem();
//        si.setLabel("Selecione");
//        si.setValue("0");
//        comboMunicipio.add(si);
//            if(municipios != null){
//                 for (Municipio municipio : municipios) {
//                si = new SelectItem();
//                si.setLabel(municipio.getMuniNmMunicipio());
//                si.setValue(municipio.getMuniIdMunicipio());
//                comboMunicipio.add(si);
//            }
//        }
    }
    
    public void pesquisar(){
    	pacientes = pacienteBO.listarPorNome("from Paciente where pessoa.pessNmNome like '%"+pessoa.getPessNmNome()+"%' ");
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

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacienntes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

	public TipoPlanoSaude getTipoPlanoSaude() {
		return tipoPlanoSaude;
	}

	public void setTipoPlanoSaude(TipoPlanoSaude tipoPlanoSaude) {
		this.tipoPlanoSaude = tipoPlanoSaude;
	}

	public PlanoDeSaude getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(PlanoDeSaude planoSaude) {
		this.planoSaude = planoSaude;
	}

	public List<TipoPlanoSaude> getTiposPlanoSaude() {
		return tiposPlanoSaude;
	}

	public void setTiposPlanoSaude(List<TipoPlanoSaude> tiposPlanoSaude) {
		this.tiposPlanoSaude = tiposPlanoSaude;
	}

	public List<PlanoDeSaude> getPlanosSaude() {
		return planosSaude;
	}

	public void setPlanosSaude(List<PlanoDeSaude> planosSaude) {
		this.planosSaude = planosSaude;
	}

	public List<UnidadeFederativa> getUnidadeFederativas() {
		return unidadeFederativas;
	}

	public void setUnidadeFederativas(List<UnidadeFederativa> unidadeFederativas) {
		this.unidadeFederativas = unidadeFederativas;
	}

	public List<SelectItem> getComboPlanoSaude() {
		return comboPlanoSaude;
	}

	public void setComboPlanoSaude(List<SelectItem> comboPlanoSaude) {
		this.comboPlanoSaude = comboPlanoSaude;
	}

	public PessoaBO getPessoaBO() {
		return pessoaBO;
	}

	public void setPessoaBO(PessoaBO pessoaBO) {
		this.pessoaBO = pessoaBO;
	}

	public TipoPlanoSaudeBO getTipoPlanoSaudeBO() {
		return tipoPlanoSaudeBO;
	}

	public void setTipoPlanoSaudeBO(TipoPlanoSaudeBO tipoPlanoSaudeBO) {
		this.tipoPlanoSaudeBO = tipoPlanoSaudeBO;
	}

	public PlanoSaudeBO getPlanoSaudeBO() {
		return planoSaudeBO;
	}

	public void setPlanoSaudeBO(PlanoSaudeBO planoSaudeBO) {
		this.planoSaudeBO = planoSaudeBO;
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

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
    
    

}
