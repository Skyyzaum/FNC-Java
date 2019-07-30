package br.com.luis.desafiofnc.lab.modelo;

//import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.CascadeType;
//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String cpf;
	
//	@Column(name = "exame")
//	@OneToMany(mappedBy="exame", fetch=FetchType.EAGER)
//	@Fetch(FetchMode.JOIN)
//	@Cascade(CascadeType.ALL)
//	private ArrayList<Exame> exames;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

//	public ArrayList<Exame> getExames() {
//		return exames;
//	}
//
//	public void setExames(ArrayList<Exame> exames) {
//		this.exames = exames;
//	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf +"]";
	}
}
