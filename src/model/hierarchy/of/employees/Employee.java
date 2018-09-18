package model.hierarchy.of.employees;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import model.company.Company;

public abstract class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7694467475014524085L;

	// ----------------------------------------------
	// поля, свойства необходимые RelatedSpecialties
	// ----------------------------------------------
	private String firstName;

	private String surName;

	private String patronymic; 

	private Date dateOfEmployment; // дата трудоустройства
	
	private String position;		//должность
	
	public String fullName(Employee employee) {
		StringBuffer strB = new StringBuffer();
				strB.append(employee.getSurName());
				strB.append(" ");
				strB.append(employee.getFirstName()); 
				strB.append(" ");
				strB.append(employee.getPatronymic());	
		return strB.toString();
	}
	
	
	
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(Date dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

}
