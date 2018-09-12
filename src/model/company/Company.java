package model.company;

import java.util.Set;


import org.apache.log4j.Logger;

import main.Runner;
import model.hierarchy.of.employees.Employee;

public class Company {
	// ----------------------------------------------
	// поля, свойства необходимые Company
	// ----------------------------------------------
	
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	private String nameCompany;
	
	//private Set<Employee> blackList;

	//private Map<Employee> workingStaff; // работающие сотрудники

	//private Set<Employee> firedEmployees; // уволенные сотрудники
	
	//private static final String  = ""
	
	// ----------------------------------------------
	// конструктор Principal
	// ----------------------------------------------
	
	
	

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public static Logger getLog() {
		return LOG;
	}

}
