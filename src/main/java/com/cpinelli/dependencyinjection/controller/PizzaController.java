package com.cpinelli.dependencyinjection.controller;

import com.cpinelli.dependencyinjection.model.Pizza;
import com.cpinelli.dependencyinjection.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pizza> getAllPizzas() {
        return this.pizzaService.getPizzas();
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pizza createPizza(@RequestBody Pizza pizza) {
        return this.pizzaService.createPizza(pizza);
    }
}

