package com.example.mysql.SpringMysql;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.mysql.SpringMysql")
public class SpringMysqlApplication implements CommandLineRunner{

	@Resource
	StorageService storageService;
	
	@Autowired
	private PessoaRepository repository;
	
	@Autowired
	private StreamRepository streamRepo;
	     
	@Autowired
	private StudentRepository studentRepo;
	 
		
	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		storageService.deleteAll();
		storageService.init();
		
		
		repository.deleteAll();

		// save a couple of Pessoa
		repository.save(new Pessoa("Neil Armstrong","armstrong@gmail.com"));
		
		repository.save(new Pessoa("Edwin Aldrin","aldrin@gmail.com"));

		repository.save(new Pessoa("Michael Collins","collins@gmail.com"));

		// fetch all Pessoa
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Pessoa pessoa : repository.findAll()) {
			System.out.println(pessoa);
		}
		System.out.println();

		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}
		
		
		
		deleteData();
		
		saveData();
		
		
	}
	
	
	
private void saveData(){
    	
        Stream science = new Stream("Science");
        Stream arts = new Stream("Arts");
        Stream commerce = new Stream("Commerce");
      
        streamRepo.save(science);
        streamRepo.save(arts);
        streamRepo.save(commerce);
        
        studentRepo.save(new Student("Newton", science)) ;
        studentRepo.save(new Student("Vidyasagar",arts)) ;
        studentRepo.save(new Student("Amartya", commerce)) ;
       
}

private void deleteData(){
	
    streamRepo.deleteAll();
    studentRepo.deleteAll();
   
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
