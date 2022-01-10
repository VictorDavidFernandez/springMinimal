package repository;

import org.springframework.stereotype.Service;

@Service
public class H2repo {

	public void insertar() {
		System.out.println("Guardando en H2");
	}
}
