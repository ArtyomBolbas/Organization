package model;

import java.util.Set;

public class Company {
	// ----------------------------------------------
	// поля, свойства необходимые Company
	// ----------------------------------------------
	private String nameCompany;

	private Set<Employee> workingStaff; // работающие сотрудники

	private Set<Employee> firedEmployees; // уволенные сотрудники

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public Set<Employee> getWorkingStaff() {
		return workingStaff;
	}

	public void setWorkingStaff(Set<Employee> workingStaff) {
		this.workingStaff = workingStaff;
	}

	public Set<Employee> getFiredEmployees() {
		return firedEmployees;
	}

	public void setFiredEmployees(Set<Employee> firedEmployees) {
		this.firedEmployees = firedEmployees;
	}

}
