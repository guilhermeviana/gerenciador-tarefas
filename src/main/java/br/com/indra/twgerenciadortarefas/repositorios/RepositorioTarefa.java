/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.indra.twgerenciadortarefas.repositorios;

import br.com.indra.twgerenciadortarefas.modelos.Tarefa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author glviana
 */
public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {
    
    @Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
    List<Tarefa> carregaTarefasPorUsuario(@Param("emailUsuario") String email);
    
}
