package com.springboot.curso_arquitetura_springboot.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService service;

    // CONSTRUTOR DA CLASSE TodoController
    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
        try {
            return this.service.salvar(todo);
        } catch (IllegalAccessException e) {
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }

    }

    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);

        service.atualizarStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity buscar(@PathVariable("id") Integer id){
        return service.buscarPorId(id);
    }
}
