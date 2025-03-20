package com.springboot.curso_arquitetura_springboot;


// buscando variavel de ambiente do yml

import org.springframework.beans.factory.annotation.Value;

public class ExemploValueYml {

    @Value("${app.config.variavel}")
    private String variavel;

    public void imprimirVariavelYml(){
        System.out.println(variavel);
    }
}
