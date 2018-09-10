package model.hierarchy.of.employees;

import model.company.Coefficient;
import model.company.Report;

public abstract class Leaders extends Administration implements Report, Coefficient{

	// ----------------------------------------------
	// поля, свойства необходимые Leaders
	// ----------------------------------------------
	private Master master;			//мастер
	
	private Foreman foreman;		//прораб

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	public Foreman getForeman() {
		return foreman;
	}

	public void setForeman(Foreman foreman) {
		this.foreman = foreman;
	}
	
}
