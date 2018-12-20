package com.lad.extratos;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lad.extratos.domain.ControleLancamento;
import com.lad.extratos.domain.DomicilioBancario;
import com.lad.extratos.domain.LancamentoContaCorrente;
import com.lad.extratos.repositories.ControleLancamentoRepository;



@SpringBootApplication
public class ExtratosApplication implements CommandLineRunner {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExtratosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		DomicilioBancario banc1 = new DomicilioBancario(null, 123, 1, "00000000065470");
		
		LancamentoContaCorrente lancamentoContaCorrente = new LancamentoContaCorrente(null, 636054, "Pago", "Regular", banc1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		ControleLancamento lan = new ControleLancamento(null, sdf.parse("30/09/2017 10:32"), sdf.parse("30/09/2017 10:32"), 1, "LA-56", "1", "BANCO ABCDE", 1, "12996721", "123", new BigDecimal(123), null, null);
		
		controleLancamentoRepository.saveAll(Arrays.asList(lan));
		
		//repository
	}

//	qtdLancamentos
//	qtdRemessas
//	valorLancamentos
//	listaControleLancamento[
/*
	 {
		"lancamentoContaCorrenteCliente": {
		  "numeroRemessaBanco": 64320236054,
		  "nomeSituacaoRemessa": "Pago",
		  "dadosDomicilioBancario": {
			"codigoBanco": 123,
			"numeroAgencia": 1,
			"numeroContaCorrente": "00000000065470",
		  },
		  "nomeTipoOperacao": "regular"
		},
		"dataEfetivaLancamento": "03/06/2016",
		"dataLancamentoContaCorrenteCliente": "03/06/2016",
		"numeroEvento": 42236790,
		"descricaoGrupoPagamento": "LA-56",
		"codigoIdentificadorUnico": "1",
		"nomeBanco": "BANCO ABCD S.A.             ",
		"quantidadeLancamentoRemessa": 22,
		"numeroRaizCNPJ": "12996721",
		"numeroSufixoCNPJ": "1597",
		"valorLancamentoRemessa": 11499.1,
		"dateLancamentoContaCorrenteCliente": 1464922800000,
		"dateEfetivaLancamento": 1464922800000
	  }

	
	 ]
		*/ 	
	
//	---paginado
	
	
}

