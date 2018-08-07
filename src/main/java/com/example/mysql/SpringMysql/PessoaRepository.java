package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface PessoaRepository extends MongoRepository<Pessoa, String>{
	
//	 @Autowired
//	 private MongoTemplate mongoTemplate;
//	 
//	 public Pessoa addPessoa(Pessoa pessoa) {
//	        mongoTemplate.save(pessoa);
//	        return  pessoa;
//	    }
//
//	    public Pessoa findById(int id) {
//	        Pessoa pessoa = mongoTemplate.findById(id, Pessoa.class);
//	        return pessoa;
//	    }
//
//	    public List<Pessoa> findAll() {
//	        List<Pessoa> pessoas = mongoTemplate.findAll(Pessoa.class);
//	        return pessoas;
//	}
	


}
