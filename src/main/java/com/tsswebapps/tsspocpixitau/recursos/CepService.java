package com.tsswebapps.tsspocpixitau.recursos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tsswebapps.tsspocpixitau.modal.Logradouro;

@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface CepService {
	@GetMapping("{cep}/json")
    Logradouro buscaEnderecoPorCep(@PathVariable("cep") String cep);
}
