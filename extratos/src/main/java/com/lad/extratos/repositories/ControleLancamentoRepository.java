package com.lad.extratos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lad.extratos.domain.ControleLancamento;

@Repository
public interface ControleLancamentoRepository extends JpaRepository<ControleLancamento, Integer> {

}
