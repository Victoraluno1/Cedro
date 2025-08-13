package com.itb.inf2em.cedro.model.entity;

public class Categoria {

    private long id;
    private String nome;
    private String descricao;
    private boolean codstatus;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao () {
        return descricao;
    }

    public Boolean getCodStatus() {
        return codstatus;
    }

    public void setcodstatus(Boolean codstatus) {
        this.codstatus = codstatus;
    }
}
