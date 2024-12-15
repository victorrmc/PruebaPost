/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.victor.PruebaPost;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author victo
 */
@Getter @Setter
public class Cliente {
    private int id;
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + ", surname=" + surname + '}';
    }

    public Cliente() {
    }

    public Cliente(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    
}
