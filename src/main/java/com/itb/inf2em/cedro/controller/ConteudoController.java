package com.itb.inf2em.cedro.controller;

import com.itb.inf2em.cedro.model.entity.Conteudo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/conteudo")
public class ConteudoController {

    private List<Conteudo> produtos = new ArrayList<Conteudo>();

    @GetMapping
    public List<Conteudo> findAllprodutos() {

        Conteudo p1 = new Conteudo();
        p1.setNome("Como surge uma dependência química e quando procurar ajuda?");
        p1.setDescricao("A dependência de substâncias psicoativas é um problema complexo, que não tem apenas uma causa.\n" +
                "\n" +
                "Fatores genéticos podem influenciar e aumentar a propensão de uma pessoa desenvolver uma dependência, mas outros fatores como os biológicos, os psicológicos e os sociais também desempenham um papel importante tanto no desenvolvimento quanto no tratamento de uma adição.\n" +
                "\n" +
                "A dependência não tem nada a ver com caráter. É uma doença que ocasiona desvios comportamentais sérios, que não seriam realizados pela pessoa em seu estado de sobriedade.\n" +
                "\n" +
                "Tratar uma dependência é difícil, exige paciência e, muitas vezes, é uma batalha que será travada pela vida inteira. Pelo SUS, os usuários devem buscar preferencialmente os Centros de Atenção Psicossocial Álcool e Drogas (CAPS AD) e as Unidades Básicas de Saúde (UBS), que são portas de entrada para a RAPS (Rede de Atenção Psicossocial), responsável pelo encaminhamento e tratamento de pessoas com dependência.");
        p1.setTipo("Vídeo");
        p1.setId(1L);
        p1.setVisualizacoes(1000);

        produtos.add(p1);

        Conteudo p2 = new Conteudo();
        p2.setNome("Seu cérebro precisa de uma pausa: natureza e ócio sem celular aliviam o estresse e aumentam a produtividade");
        p2.setDescricao("Estudos mostram que momentos de 'tédio' em ambientes verdes, longe do smartphone, reduzem a atividade de áreas do cérebro associadas ao estresse, recuperam a atenção e impulsionam a produtividade, conforme a Teoria da Restauração da Atenção");
        p2.setTipo("Noticia");
        p2.setId(2L);
        p2.setVisualizacoes(250);

        produtos.add(p2);

        return produtos;
    }

}
