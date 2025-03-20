package com.springboot.curso_arquitetura_springboot.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo) throws IllegalAccessException {
        if(existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalAccessException("Já existe um TODO com esta descrição!");
        }
    }

    private boolean existeTodoComDescricao(String descricao){
        return repository.existByDescricao(descricao);
    }
}
