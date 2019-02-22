package com.demo.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.demo.entity.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

	public List<Client> findAllBySex(String sex);
}
