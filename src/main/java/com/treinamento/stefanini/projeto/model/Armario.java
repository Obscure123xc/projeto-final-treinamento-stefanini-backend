package com.treinamento.stefanini.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.treinamento.stefanini.projeto.enums.SituacaoEnum;

@Entity
public class Armario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SQ_ARM_NU", sequenceName = "SQ_ARM_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ARM_NU")
	@Column(name = "ARM_NU")
	private Long id;

	@Column(name = "ARM_NO")
	private String nome;

	@Column(name = "ARM_SIT")
	@Enumerated(EnumType.STRING)
	private SituacaoEnum situacao;

	@OneToMany(mappedBy = "armario")
	private List<Camiseta> camisetas;

	public Armario() {
		super();
	}

	public Armario(Long id, String nome, SituacaoEnum situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
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

	public SituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}
	
	public List<Camiseta> getCamisetas() {
		return camisetas;
	}

	public void setCamisetas(List<Camiseta> camisetas) {
		this.camisetas = camisetas;
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
		Armario other = (Armario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}