package controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import service.MyDatabase;

@Controller
public class MiPrimerControlador {
	@Autowired
	private MyDatabase service;

	public MyDatabase getService() {
		return service;
	}

	public void setService(MyDatabase service) {
		this.service = service;
	}

	@GetMapping("/hello")
	public String hola() {
		service.insert();
		return "fin";
	}

	@GetMapping("/")
	public String bienvenida() {
		return "index";
	}
	/*
	 * @GetMapping("/error") public String error() { return "error"; }
	 */
}
