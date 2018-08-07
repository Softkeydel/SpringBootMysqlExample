package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;


    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }
       
    public Pessoa findById(String id) {
    	return pessoaRepository.findById(id).get();
    }
    
    public Pessoa addPessoa(Pessoa pessoa) {
    	return pessoaRepository.insert(pessoa);
    }

}
