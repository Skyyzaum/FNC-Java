package br.com.luis.desafiofnc.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luis.desafiofnc.lab.modelo.Procedimento;

public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

}
