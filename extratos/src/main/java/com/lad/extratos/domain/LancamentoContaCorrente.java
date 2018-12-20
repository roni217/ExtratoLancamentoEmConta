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
	private String situacaoRemessa;// TODO: fazer enum
	
	private DomicilioBancario domicilioBancario;
	private String nometipoOperacao;// TODO: fazer enum

	
	public LancamentoContaCorrente(Integer id, Integer remessaBanco, String situacaoRemessa, String nometipoOperacao, DomicilioBancario domicilioBancario) {
		super();
		this.id = id;
		this.remessaBanco = remessaBanco;
		this.situacaoRemessa = situacaoRemessa;
		this.nometipoOperacao = nometipoOperacao;
		this.domicilioBancario = domicilioBancario;
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

	public String getSituacaoRemessa() {
		return situacaoRemessa;
	}

	public void setSituacaoRemessa(String situacaoRemessa) {
		this.situacaoRemessa = situacaoRemessa;
	}

	public String getNometipoOperacao() {
		return nometipoOperacao;
	}

	public void setNometipoOperacao(String nometipoOperacao) {
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
