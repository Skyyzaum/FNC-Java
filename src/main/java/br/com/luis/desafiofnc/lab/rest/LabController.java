package br.com.luis.desafiofnc.lab.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luis.desafiofnc.lab.modelo.Exame;
import br.com.luis.desafiofnc.lab.repository.ExameRepository;

@RestController
@RequestMapping("/api")
public class LabController {

	@Autowired
	private ExameRepository repositoryExame;
	
	@GetMapping("/exames")
	public List<Exame> listarExames(){
		return this.repositoryExame.findAll();
	}
	
	@PostMapping("/savar-exame")
	public void salvarExame(@RequestBody Exame exame) {
		this.repositoryExame.save(exame);
	}
	
//	@PostMapping
//	public Optional<Exame> salvarExame(@RequestBody Exame exame) {
//		Exame e = this.repositoryExame.save(exame);
//		return this.repositoryExame.findById(e.getId());
//	}

}
