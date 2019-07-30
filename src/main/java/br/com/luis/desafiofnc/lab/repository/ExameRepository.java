package br.com.luis.desafiofnc.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luis.desafiofnc.lab.modelo.Exame;

public interface ExameRepository extends JpaRepository<Exame, Long> {
	List<Exame> findAll();
	
//	Exame save (Exame exame);
}
