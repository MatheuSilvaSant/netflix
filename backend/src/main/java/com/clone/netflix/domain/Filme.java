package com.clone.netflix.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_filme")
public class Filme implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Date DataLancamento;
	
	
	@ManyToMany
	@JoinTable(
				name = "tb_filme_categoria",
				joinColumns = @JoinColumn(name="id_filme"),
				inverseJoinColumns = @JoinColumn(name="id_categoria")
			)
	private List<Categoria> categorias = new ArrayList<>();

	
	public Filme() {}
	

	public Filme(Long id, String nome, String descricao, Date dataLancamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		DataLancamento = dataLancamento;
	}


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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataLancamento() {
		return DataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		DataLancamento = dataLancamento;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
