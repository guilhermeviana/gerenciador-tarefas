/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.indra.twgerenciadortarefas.repositorios;

import br.com.indra.twgerenciadortarefas.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author glviana
 */
public interface RepositorioUsuario extends JpaRepository <Usuario, Long> {
   
    Usuario findByEmail(String email);
}
