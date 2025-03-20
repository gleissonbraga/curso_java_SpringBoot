package com.springboot.curso_arquitetura_springboot.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    // CONSTRUTOR DA CLASSE TodoService
    public TodoService(TodoRepository todoRepository, TodoValidator validator, MailSender mailSender) {
        this.repository = todoRepository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo) throws IllegalAccessException {
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);

        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "não concluido";

        mailSender.enviar("Todo " + todo.getDescricao() + " foi atualizado para " + status);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
