package model.hierarchy.of.employees;

public abstract class Employee {
	// ----------------------------------------------
	// поля, свойства необходимые RelatedSpecialties
	// ----------------------------------------------
	private String firstName;

	private String surName;

	private String patronymic;

	private String dataOfDirth; 

	private String dateOfEmployment; // дата трудоустройства
	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getDataOfDirth() {
		return dataOfDirth;
	}

	public void setDataOfDirth(String dataOfDirth) {
		this.dataOfDirth = dataOfDirth;
	}

	public String getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

}
