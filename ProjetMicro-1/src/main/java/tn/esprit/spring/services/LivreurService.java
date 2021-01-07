package tn.esprit.spring.services;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.repository.LivreurRepository;

@Service
public class LivreurService {
	

	@Autowired
	private LivreurRepository repository;
	
	public Livreur saveLivreur(Livreur livreur) {
		return repository.save(livreur);
	}
	
	/*public List<Livreur> saveLivreurs(List<Livreur> livreurs) {
		return repository.saveAll(livreurs);
	}*/
	
	public List<Livreur> getLivreurs(){
		return (List)repository.findAll();
	}

	public Livreur getLivreurById(int id ){
		return repository.findById(id).orElse(null);
	}
	/*public Livreur getLivreurByName(String name){
		return repository.findLivreurByName(name);
	}*/
	public String deleteLivreur(int id) {
		repository.deleteById(id);
		return "Livreur removed!!"+id;
	}
	public void updateLivreur(Livreur livreur) {
		/*Livreur x=getLivreurById(livreur.getId());
	//	Livreur existingLivreur=repository.findById(livreur.getId()).orElse(null);
		x.setName(x.getName());
				x.setAge(x.getAge());
				x.setGender(x.getGender());
				x.setPhone(x.getPhone());
				x.setSurname(x.getSurname());
				entityManager.flush();*/
		repository.save(livreur);
		        
	}
}

