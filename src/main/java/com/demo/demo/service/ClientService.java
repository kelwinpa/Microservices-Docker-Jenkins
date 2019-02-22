package com.demo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.entity.Client;
import com.demo.demo.interfaces.ClientInterface;
import com.demo.demo.repository.ClientRepository;



@Service
public class ClientService implements ClientInterface {

	@Autowired
	private ClientRepository clientRepository; 
	
	@Override
	public void saveClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public List<Client> getAllClient() {	
		return clientRepository.findAll();
	}

	@Override
	public List<Client> getClientBySex(String sex) {
		
		return clientRepository.findAllBySex(sex);
	}
	
}
