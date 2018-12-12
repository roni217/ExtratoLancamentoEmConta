package com.lad.extratos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LancamentoContaCorrente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer remessaBanco;
	private Integer situacaoRemessa;// TODO: fazer enum
	
	private DomicilioBancario domicilioBancario;
	private Integer nometipoOperacao;// TODO: fazer enum

	
	public LancamentoContaCorrente(Integer id, Integer remessaBanco, Integer situacaoRemessa,
			DomicilioBancario domicilioBancario, Integer nometipoOperacao) {
		super();
		this.id = id;
		this.remessaBanco = remessaBanco;
		this.situacaoRemessa = situacaoRemessa;
		this.domicilioBancario = domicilioBancario;
		this.nometipoOperacao = nometipoOperacao;
	}

	public DomicilioBancario getDomicilioBancario() {
		return domicilioBancario;
	}

	public void setDomicilioBancario(DomicilioBancario domicilioBancario) {
		this.domicilioBancario = domicilioBancario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRemessaBanco() {
		return remessaBanco;
	}

	public void setRemessaBanco(Integer remessaBanco) {
		this.remessaBanco = remessaBanco;
	}

	public Integer getSituacaoRemessa() {
		return situacaoRemessa;
	}

	public void setSituacaoRemessa(Integer situacaoRemessa) {
		this.situacaoRemessa = situacaoRemessa;
	}

	public Integer getNometipoOperacao() {
		return nometipoOperacao;
	}

	public void setNometipoOperacao(Integer nometipoOperacao) {
		this.nometipoOperacao = nometipoOperacao;
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
		LancamentoContaCorrente other = (LancamentoContaCorrente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
