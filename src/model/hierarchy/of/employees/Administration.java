package model.hierarchy.of.employees;

import model.company.Remove;

public abstract class Administration extends Employee implements Remove{

	// ----------------------------------------------
	// поля, свойства необходимые Administration
	// ----------------------------------------------
	private int login;
	
	private int password;

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
}
