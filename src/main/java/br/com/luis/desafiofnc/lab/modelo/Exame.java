package br.com.luis.desafiofnc.lab.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exame")
public class Exame implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data_coleta")
	private Date dataColeta;
	
	@Column(name = "data_entrega")
	private Date dataEntrega;
	
	@Column(name = "procedimento")
	private String procedimento;
	
	@Column(name = "paciente")
	private String Paciente;

 	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataColeta() {
		return dataColeta;
	}

	public void setDataColeta(Date dataColeta) {
		this.dataColeta = dataColeta;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getPaciente() {
		return Paciente;
	}

	public void setPaciente(String paciente) {
		Paciente = paciente;
	}

	@Override
	public String toString() {
		return "Exame [id=" + id + ", dataColeta=" + dataColeta + ", dataEntrega=" + dataEntrega + ", procedimento="
				+ procedimento + ", Paciente=" + Paciente + "]";
	}
	

}
