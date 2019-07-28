package br.com.luis.desafiofnc.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luis.desafiofnc.lab.modelo.Exame;

public interface ExameRepository extends JpaRepository<Exame, Long> {

}
