package model;

import java.util.List;

public class Employee {
	// ----------------------------------------------
	// поля, свойства необходимые RelatedSpecialties
	// ----------------------------------------------
	private String firstName;

	private String surName;

	private String patronymic;

	private DateOfBirth dataOfDirth; 

	private int personalNumber;

	private String positionHeld; // занимаемая должность

	private int category; // категория или разряд

	private boolean dateOfEmployment; // дата трудоустройства

	private String phoneNumber;

	private List<RelatedSpecialties> relatedSpecialties; // список смежных специальностей

	private boolean layOff; // уволить

	private String loginEmployee;

	private String passwordEmployee;

	private boolean holiday;

	
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

	public DateOfBirth getDataOfDirth() {
		return dataOfDirth;
	}

	public void setDataOfDirth(DateOfBirth dataOfDirth) {
		this.dataOfDirth = dataOfDirth;
	}

	public int getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(int personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getPositionHeld() {
		return positionHeld;
	}

	public void setPositionHeld(String positionHeld) {
		this.positionHeld = positionHeld;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public boolean isDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(boolean dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<RelatedSpecialties> getRelatedSpecialties() {
		return relatedSpecialties;
	}

	public void setRelatedSpecialties(List<RelatedSpecialties> relatedSpecialties) {
		this.relatedSpecialties = relatedSpecialties;
	}

	public boolean isLayOff() {
		return layOff;
	}

	public void setLayOff(boolean layOff) {
		this.layOff = layOff;
	}

	public String getLoginEmployee() {
		return loginEmployee;
	}

	public void setLoginEmployee(String loginEmployee) {
		this.loginEmployee = loginEmployee;
	}

	public String getPasswordEmployee() {
		return passwordEmployee;
	}

	public void setPasswordEmployee(String passwordEmployee) {
		this.passwordEmployee = passwordEmployee;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

}
