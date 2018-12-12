package com.lad.extratos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lad.extratos.domain.DomicilioBancario;

@Repository
public interface BancoRepository extends JpaRepository<DomicilioBancario, Integer> {

}
