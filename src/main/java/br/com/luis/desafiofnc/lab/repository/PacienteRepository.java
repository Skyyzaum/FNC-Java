package br.com.luis.desafiofnc.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luis.desafiofnc.lab.modelo.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
//	Paciente save(Paciente paciente);
}
