package tn.esprit.spring.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Livraison;
import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.repository.LivraisonRepository;
import tn.esprit.spring.repository.LivreurRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivraisonService {

	
	@Autowired
	private LivraisonRepository repository;
		
	public Livraison saveLivraison(Livraison livraison) {
		// TODO Auto-generated method stub
		return repository.save(livraison);
	}

	/*public List<Livraison> saveLivraisons(List<Livraison> livraisons) {
		// TODO Auto-generated method stub
		return repository.saveAll(livraisons);
	}*/

	public List<Livraison> getLivraisons() {
		// TODO Auto-generated method stub
		return (List)repository.findAll();
	}

	public Livraison getLivraisonById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	/*public Livraison getLivraisonByName(String name) {
		// TODO Auto-generated method stub
		return repository.findLivraisonByName(name);
	}*/

	public void updateLivraison(Livraison livraison) {
		/*Livraison x=getLivraisonById(livraison.getId());
	Livreur existingLivreur=repository.findById(livreur.getId()).orElse(null);
		x.setName(x.getName());
				x.setAge(x.getAge());
				x.setGender(x.getGender());
				x.setPhone(x.getPhone());
				x.setSurname(x.getSurname());
				entityManager.flush();*/
		
		repository.save(livraison);
		        
	}
		

	public String deleteLivraison(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Livreur removed!!"+id;
	}
}
	