package br.com.luis.desafiofnc.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luis.desafiofnc.lab.modelo.Exame;

public interface PacienteRepository extends JpaRepository<Exame, Long> {

}
