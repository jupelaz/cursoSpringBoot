package com.cursojava.curso.DAO;

import com.cursojava.curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao{

    private EntityManager em;

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}
