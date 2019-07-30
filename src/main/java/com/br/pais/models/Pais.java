package com.br.pais.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Pais implements Serializable{
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Campo codigo iso é obrigatorio")
	private String codigoIso;
	
	@NotBlank(message = "Campo nome é obrigatorio")
	private String nome;
	
	@Min(value = 1, message = "Campo  população deve ter pelo menos 1 ")
	private int populacao;
	
	@DecimalMin(value = "1.0",message = "Campo  população deve ter pelo menos 1 ")
	private double dimensao;
	

	public Pais() {
		super();
	}

	public Pais(String codigoIso, String nome, double dimensao) {
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.dimensao = dimensao;
	}

	public Pais(String codigoIso, String nome, int populacao, double dimensao) {
		this.codigoIso = codigoIso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
	}

	public String getCodigoIso() {
		return codigoIso;
	}

	public void setCodigoIso(String codigoIso) {
		this.codigoIso = codigoIso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public String comparaPaises(Pais pais) {
		if (this.getCodigoIso().equalsIgnoreCase(pais.getCodigoIso())) {
			return "Os paises são iguais";

		} else {
			return "Os paises são diferentes";
		}
	}

	public double calculaDensidade(int poulacao, double dimensao) {
		double densidade = poulacao / dimensao;
		return densidade;
	}

	public String toString() {
		String modelo = "\n";
		modelo += "\nCodigo do Pais -> " + this.getCodigoIso();
		modelo += "\nNome do Pais -> " + this.getNome();
		modelo += "\nPopulação do Pais -> " + this.getPopulacao();
		modelo += "\nTamanho do pais ->" + this.getDimensao() + "\n";

		return modelo;
	}
	

}
