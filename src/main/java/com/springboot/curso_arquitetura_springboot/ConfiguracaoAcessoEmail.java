package com.springboot.curso_arquitetura_springboot;

import com.springboot.curso_arquitetura_springboot.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

    @Bean
    public MailSender mailSender(){
        return null;
    }
}
