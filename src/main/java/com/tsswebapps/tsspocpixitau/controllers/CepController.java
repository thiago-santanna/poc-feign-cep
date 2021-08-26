package com.tsswebapps.tsspocpixitau.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsswebapps.tsspocpixitau.modal.Logradouro;
import com.tsswebapps.tsspocpixitau.recursos.CepService;

@RestController
@RequestMapping("/logradouro")
public class CepController {
	 @Autowired
	    private CepService cepService;

	    @GetMapping("/cep/{numcep}")
	    public ResponseEntity<Logradouro> getCep(@PathVariable String numcep) {

	    	Logradouro endereco = cepService.buscaEnderecoPorCep(numcep);

	        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	    }
}
