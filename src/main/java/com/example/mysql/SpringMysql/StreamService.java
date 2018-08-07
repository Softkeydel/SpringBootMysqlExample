package com.example.mysql.SpringMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StreamService { 
	
	@Autowired
	private StreamRepository repo;
	
	public List<Stream> getAllstreams(){
		return repo.findAll();
	}

	public Stream addStream(Stream stream) {
		// TODO Auto-generated method stub
		return repo.save(stream);
	}

}
