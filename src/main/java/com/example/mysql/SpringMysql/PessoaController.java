package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PessoaController {
	
	
	 @Autowired
	    private PessoaService pessoaService;

	    @RequestMapping("pessoa")
	    @ResponseBody
	    public String home() {
	        return "Hello World!";
	    }

	  
	    @RequestMapping(value="/pessoa/add", method= RequestMethod.POST)	
	    public @ResponseBody Pessoa addPessoa(@RequestBody Pessoa pessoa) {
	        return pessoaService.addPessoa(pessoa);
	    }

	    @RequestMapping("/pessoa/findById/{pessoaId}")
	    public @ResponseBody Pessoa findPersonById(@PathVariable("pessoaId") String pessoaId) {
	        return pessoaService.findById(pessoaId);
	    }

	    @RequestMapping("/pessoa/all")
	    public @ResponseBody List findAll() {
	        return pessoaService.findAll();
	}
	
	

}
