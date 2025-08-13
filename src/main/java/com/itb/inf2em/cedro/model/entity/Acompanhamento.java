package com.itb.inf2em.cedro.model.entity;

import java.time.LocalDateTime;

public class Acompanhamento {

    private Long id;
    private String tipo;
    private LocalDateTime data_hora_inicio_sessao;
    private LocalDateTime data_hora_fim_sessao;
    private boolean codstatus;
    private String status;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData_hora_inicio_sessao() {
        return data_hora_inicio_sessao;
    }

    public void setData_hora_inicio_sessao(LocalDateTime data_hora_inicio_sessao) {
        this.data_hora_inicio_sessao = data_hora_inicio_sessao;
    }

    public LocalDateTime getData_hora_fim_sessao() {
        return data_hora_fim_sessao;
    }

    public void setData_hora_fim_sessao(LocalDateTime data_hora_fim_sessao) {
        this.data_hora_fim_sessao = data_hora_fim_sessao;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
