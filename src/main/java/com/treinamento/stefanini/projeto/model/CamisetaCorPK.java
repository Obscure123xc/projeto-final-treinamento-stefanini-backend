package com.treinamento.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CamisetaCorPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "CA_NU")
	private Long idCamiseta;

	@Column(name = "CO_NU")
	private Long idCor;

	public CamisetaCorPK() {
		super();
	}

	public CamisetaCorPK(Long idCamiseta, Long idCor) {
		super();
		this.idCamiseta = idCamiseta;
		this.idCor = idCor;
	}

	public Long getIdCamiseta() {
		return idCamiseta;
	}

	public void setIdCamiseta(Long idCamiseta) {
		this.idCamiseta = idCamiseta;
	}

	public Long getIdCor() {
		return idCor;
	}

	public void setIdCor(Long idCor) {
		this.idCor = idCor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCamiseta == null) ? 0 : idCamiseta.hashCode());
		result = prime * result + ((idCor == null) ? 0 : idCor.hashCode());
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
		CamisetaCorPK other = (CamisetaCorPK) obj;
		if (idCamiseta == null) {
			if (other.idCamiseta != null)
				return false;
		} else if (!idCamiseta.equals(other.idCamiseta))
			return false;
		if (idCor == null) {
			if (other.idCor != null)
				return false;
		} else if (!idCor.equals(other.idCor))
			return false;
		return true;
	}

}