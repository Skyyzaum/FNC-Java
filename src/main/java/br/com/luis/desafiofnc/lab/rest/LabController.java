package br.com.luis.desafiofnc.lab.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luis.desafiofnc.lab.modelo.Exame;
import br.com.luis.desafiofnc.lab.modelo.Paciente;
import br.com.luis.desafiofnc.lab.modelo.Procedimento;
import br.com.luis.desafiofnc.lab.repository.ExameRepository;
import br.com.luis.desafiofnc.lab.repository.PacienteRepository;
import br.com.luis.desafiofnc.lab.repository.ProcedimentoRepository;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LabController {

	@Autowired
	private ExameRepository repositoryExame;
	@Autowired
	private PacienteRepository repositoryPaciente ;
	@Autowired
	private ProcedimentoRepository repositoryProcedimento;
	
	@GetMapping("/exames")
	public List<Exame> listarExames(){
		return this.repositoryExame.findAll();
	}
	
	@PostMapping("/salvar-exames")
	public void salvarExame(@RequestBody Exame exame) {
		this.repositoryExame.save(exame);
	}
	
	@PostMapping("/salvar-paciente")
	public void salvarPaciente(@RequestBody Paciente paciente) {
		this.repositoryPaciente.save(paciente);
	}
	
	@PostMapping("/salvar-procedimento")
	public void salvarProcedimento(@RequestBody Procedimento procedimento) {
		this.repositoryProcedimento.save(procedimento);
	}
//	@PostMapping
//	public Optional<Exame> salvarExame(@RequestBody Exame exame) {
//		Exame e = this.repositoryExame.save(exame);
//		return this.repositoryExame.findById(e.getId());
//	}

}
