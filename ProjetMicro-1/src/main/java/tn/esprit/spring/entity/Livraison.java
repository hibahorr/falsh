package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Livraison {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String lieu;
	private String libelle;
	private int phone;

	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getLibelle() {
		// TODO Auto-generated method stub
		return libelle;
	}
		public int getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	public String getLieu() {
		// TODO Auto-generated method stub
		return lieu;
	}
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
		public void setAge(String libelle) {
		// TODO Auto-generated method stub
		this.libelle=libelle;
	}
	public void setPhone(int phone) {
		// TODO Auto-generated method stub
		this.phone=phone;
	}
	public void setSurname(String lieu) {
		// TODO Auto-generated method stub
		this.lieu=lieu;
	}

}

