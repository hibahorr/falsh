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

import com.yes.entity.Livraison;
import com.yes.entity.Livreur;
import com.yes.service.LivraisonService;

@RestController
public class LivraisonController {

	
	@Autowired
	private LivraisonService service;
	
	@PostMapping("/addLivraison")
	public Livraison addLivraison (@RequestBody Livraison livraison ) {
		return service.saveLivraison(livraison);
	}
	/*@PostMapping("/addLivreur")
	public List<Livraison> addLivraisons (@RequestBody List<Livraison> livraisons) {
		return service.saveLivraisons(livraisons);
	}*/
	
	@GetMapping("/Livraisons")
	public List<Livraison> findAllLivraisons(){
		return service.getLivraisons();
	}
	@GetMapping("/Livraison/{id}")
	public Livraison findLivraisonById(@PathVariable int id) {
		return service.getLivraisonById(id);
	}
	
	/*@GetMapping("/Livreur/{name}")
	public Livraison findLivraisonByName(@PathVariable String name) {
		return service.getLivraisonByName(name);
	}*/
	
	@PutMapping("/update")
	public void  updateLivraison (@RequestBody Livraison livraison ) {
		service.updateLivraison(livraison);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteLivraison(@PathVariable int id) {
		return service.deleteLivraison(id);
	}
}