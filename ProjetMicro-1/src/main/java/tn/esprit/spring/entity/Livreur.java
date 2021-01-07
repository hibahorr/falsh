package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Livreur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private int age;
	private int phone;
	private String gender;
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public  String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	public int getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	public String getSurname() {
		// TODO Auto-generated method stub
		return surname;
	}
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender=gender;
	}
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}
	public void setPhone(int phone) {
		// TODO Auto-generated method stub
		this.phone=phone;
	}
	public void setSurname(String surname) {
		// TODO Auto-generated method stub
		this.surname=surname;
	}

}

