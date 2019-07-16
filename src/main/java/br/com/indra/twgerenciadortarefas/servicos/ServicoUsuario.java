/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.indra.twgerenciadortarefas.servicos;

import br.com.indra.twgerenciadortarefas.modelos.Usuario;
import br.com.indra.twgerenciadortarefas.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author glviana
 */

@Service
public class ServicoUsuario {
    
    @Autowired
    private RepositorioUsuario repositorioUsuario;
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    public Usuario encontrarPorEmail(String email){
        return repositorioUsuario.findByEmail(email);
    }
    
    public void salvar (Usuario usuario){
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        repositorioUsuario.save(usuario);
    }
    
}
