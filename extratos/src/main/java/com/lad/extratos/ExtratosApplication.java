package com.lad.extratos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lad.extratos.domain.DomicilioBancario;

@SpringBootApplication
public class ExtratosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExtratosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DomicilioBancario banc1 = new DomicilioBancario(null, 123, 1, "00000000065470");
		
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

