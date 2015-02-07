package br.com.hospital.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atendente")
public class Atendente implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Pessoa pessoa;
    private String senha;

    public Atendente() {
    }

    public Atendente(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Id
    @Column(name = "ATEN_ID_PESSOA", unique = true, nullable = false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Column(name = "ATEN_TX_SENHA", unique = true, nullable = false)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
