package model.hierarchy.of.employees;

import java.io.Serializable;

public class Working extends Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1757061524842546861L;

	// ----------------------------------------------
	// поля, свойства необходимые Working
	// ----------------------------------------------
	private Integer id; // таб номер

	private String profession; // профессия

	private int numberPhone; // номер телефона
	
	// ----------------------------------------------
	// конструктор
	// ----------------------------------------------
	public Working(Integer id) {
		this.id = id;
	}
	
	

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}
	
}
