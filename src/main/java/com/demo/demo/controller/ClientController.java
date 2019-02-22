package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entity.Client;
import com.demo.demo.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping(value = "/saveClient")
	public void saveClient(@RequestParam String name, @RequestParam String lastname, @RequestParam String sex) {

		Client client = new Client(name, lastname, sex);
		clientService.saveClient(client);

	}

	@GetMapping(value = "/getAllClient")
	public List<Client> getAllClient() {

		return clientService.getAllClient();
	}

	@GetMapping(value = "/getClientBySex")
	public List<Client> getAllClientBySex(@RequestParam String sex) {

		return clientService.getClientBySex(sex);
	}

}
