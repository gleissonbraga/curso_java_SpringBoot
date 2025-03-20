package com.springboot.curso_arquitetura_springboot.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Enviado email: " + mensagem);
    }
}
