
package com.victor.PruebaPost.controller;

import com.victor.PruebaPost.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
    @PostMapping
    public void CrearCliente(@RequestBody Cliente cliente){
        
        System.out.println("Cliente creado correctamente");
        System.out.println(cliente.toString());
        
    }
    //devolver lista de clientes en por el body en Json
    @GetMapping("/traer")
    @ResponseBody
    public List<Cliente> TraerClientes(){
        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente(1, "Nombre1", "Apellido1");
        clientes.add(cliente1);

        Cliente cliente2 = new Cliente(2, "Nombre2", "Apellido2");
        clientes.add(cliente2);

        Cliente cliente3 = new Cliente(3, "Nombre3", "Apellido3");
        clientes.add(cliente3);

        Cliente cliente4 = new Cliente(4, "Nombre4", "Apellido4");
        clientes.add(cliente4);
        
        return clientes;
        
    }
    
    //Personalizar las repuesta con status code 404
    @GetMapping("/response")
    ResponseEntity<String>  responseEntity(){
        
        return new ResponseEntity<>("Respuesta personalizada", HttpStatus.NOT_FOUND);
        
    }
}
