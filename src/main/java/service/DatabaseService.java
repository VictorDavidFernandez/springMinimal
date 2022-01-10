package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.H2repo;

@Service
public class DatabaseService implements MyDatabase {

	@Autowired
	H2repo repo;

	@Override
	public void insert() {
		System.out.println("simulando el metodo insertar");
		repo.insertar();
	}
}
