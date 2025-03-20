package com.springboot.curso_arquitetura_springboot;

import com.springboot.curso_arquitetura_springboot.todos.TodoEntity;
import com.springboot.curso_arquitetura_springboot.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// SINGLETON
@Lazy
@Component
@Scope("singleton") // todos os usuários iram utilizar uma unica instancia da classe
//@Scope("request") // mais utilizado para aplicação WEB.
//@Scope("session") // objeto vai estar aberto enquando o usuário estiver logado no momento
//@Scope("application") // somente para aplicações web na sessao de todos os usuarios
public class BeanGerenciado {

    private String idUsuarioLogado;

    @Autowired
    private AppProperties properties;

    @Autowired
    private TodoValidator validator;

    @Autowired
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
        properties.getVariavel();
    }

    public void utilizar() throws IllegalAccessException {
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
