package com.treinamento.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.treinamento.stefanini.projeto.enums.SituacaoEnum;

@Entity
public class CamisetaCor implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CamisetaCorPK id;

	@ManyToOne
	@JoinColumn(name = "CA_NU", referencedColumnName = "CA_NU", insertable = false, updatable = false)
	private Camiseta camiseta;

	@ManyToOne
	@JoinColumn(name = "CO_NU", referencedColumnName = "CO_NU", insertable = false, updatable = false)
	private Cor cor;

	@Column(name = "CC_SIT")
	@Enumerated(EnumType.STRING)
	private SituacaoEnum situacao;

	public CamisetaCor() {
		super();
	}

	public CamisetaCor(Camiseta camiseta, Cor cor, SituacaoEnum situacao) {
		super();
		this.id = new CamisetaCorPK(camiseta.getId(), cor.getId());
		this.camiseta = camiseta;
		this.cor = cor;
		this.situacao = situacao;
	}

	public CamisetaCorPK getId() {
		return id;
	}

	public void setId(CamisetaCorPK id) {
		this.id = id;
	}

	public Camiseta getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public SituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}

}