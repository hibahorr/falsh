package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yes.entity.Livreur;
import com.yes.service.LivreurService;

@RestController
public class LivreurController {

	
	@Autowired
	private LivreurService service;
	
	@PostMapping("/addLivreur")
	public Livreur addLivreur (@RequestBody Livreur livreur ) {
		return service.saveLivreur(livreur);
	}
	/*@PostMapping("/addLivreur")
	public List<Livreur> addLivreurs (@RequestBody List<Livreur> livreurs) {
		return service.saveLivreurs(livreurs);
	}*/
	
	@GetMapping("/Livreurs")
	public List<Livreur> findAllLivreurs(){
		return service.getLivreurs();
	}
	@GetMapping("/Livreur/{id}")
	public Livreur findLivreurById(@PathVariable int id) {
		return service.getLivreurById(id);
	}
	
	/*@GetMapping("/Livreur/{name}")
	public Livreur findLivreurByName(@PathVariable String name) {
		return service.getLivreurByName(name);
	}*/
	
	@PutMapping("/updatelivreur")
	public void updateLivreur (@RequestBody Livreur livreur ) {
		service.updateLivreur(livreur);
		
		//return service.updateLivreur(livreur);
	}
	@DeleteMapping("/deletelivreur/{id}")
	public String deleteLivreur(@PathVariable int id) {
		return service.deleteLivreur(id);
	}
}

