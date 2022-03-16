package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PruebaController {

    Logger log = LoggerFactory.getLogger(PruebaController.class);

    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("Manzana","kiwi","banana");
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        Usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNombre("Lucas");
        usuario1.setApellido("Moy");
        usuario1.setMail("lucasmoy@hotmail.com");
        usuario1.setTelefono("234234");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Manolo");
        usuario2.setApellido("Lopez");
        usuario2.setMail("mlo@hotmail.com");
        usuario2.setTelefono("2342341212");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Maria");
        usuario3.setApellido("Gomez");
        usuario3.setMail("mgo@hotmail.com");
        usuario3.setTelefono("2342343");

        List<Usuario> usuarios = List.of(usuario1,usuario2,usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setMail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234");
        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setMail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario borrarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setMail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234");
        return usuario;
    }
}
