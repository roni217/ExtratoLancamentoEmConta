package com.lad.extratos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lad.extratos.domain.ControleLancamento;
import com.lad.extratos.repositories.ControleLancamentoRepository;


@Service
public class ControleLancamentoServices {
	
	@Autowired
	private ControleLancamentoRepository repo;
	
	public ControleLancamento insert(ControleLancamento obj) {
		obj.setId(null);
		return repo.save(obj);

	}
	
}
