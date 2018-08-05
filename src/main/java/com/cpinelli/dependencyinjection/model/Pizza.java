package com.cpinelli.dependencyinjection.model;

import java.util.Set;

public class Pizza {

    private String crust;

    private Set<Garnish> garnishes;

    public Pizza() {

    }

    public Pizza(String crust, Set<Garnish> garnishes) {
        this.crust = crust;
        this.garnishes = garnishes;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public Set<Garnish> getGarnishes() {
        return garnishes;
    }

    public void setGarnishes(Set<Garnish> garnishes) {
        this.garnishes = garnishes;
    }
}
