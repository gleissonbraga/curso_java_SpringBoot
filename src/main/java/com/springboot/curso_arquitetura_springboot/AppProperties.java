package com.springboot.curso_arquitetura_springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppProperties {
    private String variavel;
    private Integer valor;

    public String getVariavel() {
        return variavel;
    }

    public void setVariave(String variavel) {
        this.variavel = variavel;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
