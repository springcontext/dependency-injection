package com.cpinelli.dependencyinjection.service;

import com.cpinelli.dependencyinjection.model.Pizza;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PizzaService {

    private List<Pizza> pizzas = new ArrayList<>();

    public Pizza createPizza(Pizza pizza) {
        this.pizzas.add(pizza);

        return pizza;
    }

    public List<Pizza> getPizzas() {
        return this.pizzas;
    }
}
