package model.hierarchy.of.employees;

import java.io.Serializable;

import model.company.Coefficient;
import model.company.Report;

public abstract class Leaders extends Administration implements Report, Coefficient, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1189238247342339274L;

	// ----------------------------------------------
	// поля, свойства необходимые Leaders
	// ----------------------------------------------
	private Master[] masters;			//мастера
	
	private Foreman[] foremans;		//прорабы

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public Master[] getMasters() {
		return masters;
	}

	public void setMasters(Master[] masters) {
		this.masters = masters;
	}

	public Foreman[] getForemans() {
		return foremans;
	}

	public void setForemans(Foreman[] foremans) {
		this.foremans = foremans;
	}
	
}
