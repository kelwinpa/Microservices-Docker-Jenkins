package com.demo.demo.interfaces;

import java.util.List;

import com.demo.demo.entity.Client;

public interface ClientInterface {

	public void saveClient(Client client);
	public List<Client> getAllClient();
	public List<Client> getClientBySex(String sex);
	
}
