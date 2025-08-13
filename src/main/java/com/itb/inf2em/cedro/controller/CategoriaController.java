package com.itb.inf2em.cedro.controller;

import com.itb.inf2em.cedro.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    private List<Categoria> categorias = new ArrayList<Categoria>();

    @GetMapping

    public List<Categoria> findAllcategorias() {

        Categoria c1 = new Categoria();
        c1.setNome("Vícios");
        c1.setDescricao("Os vícios são comportamentos ou hábitos que se tornam compulsivos, levando à perda de controle sobre o uso de uma substância ou a uma atividade, resultando em consequências negativas para a saúde física e mental.");


        categorias.add(c1);

        Categoria c2 = new Categoria();
        c2.setNome("Problemas Mentais");
        c2.setDescricao("Os problemas mentais, ou transtornos mentais, são condições que afetam o pensamento, o humor e o comportamento, podendo interferir na vida diária e na saúde emocional.");


        categorias.add(c2);

        return categorias;
    }

}