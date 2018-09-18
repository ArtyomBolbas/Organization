package model.hierarchy.of.employees;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import main.Runner;
import model.company.AddObject;
import model.company.Arrange;
import model.company.Company;
import model.company.LayOff;
import model.company.MoveWorkers;

public final class Principal extends Managing implements Arrange, LayOff, AddObject, MoveWorkers, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6270888505637143374L;
	
	// ----------------------------------------------
	// поля, свойства необходимые Principal
	// ----------------------------------------------
	public static final Principal PRINCIPAL = new Principal();
	
	
	private final static Logger LOG = Logger.getLogger(Principal.class);
	
	// ----------------------------------------------
	// конструктор Principal
	// ----------------------------------------------
	private Principal() {
		//LOG.debug("запущен конструктор в Principal");
		
	}
	
	
	
	
	// ----------------------------------------------
	// реализации методов с подписанных интерфейосв
	// ----------------------------------------------
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arrange() {
		// TODO Auto-generated method stub
		
	}
	
	public String fullName(Employee employee) {
/*		List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
		StringBuffer strB = new StringBuffer();
		for (Employee employee1: workingStaff) {
			if (employee1 instanceof Principal) {*/
		StringBuffer strB = new StringBuffer();
				strB.append(employee.getSurName());
				strB.append(" ");
				strB.append(employee.getFirstName()); 
				strB.append(" ");
				strB.append(employee.getPatronymic());
		/*	}
		}*/
		return strB.toString();
	}
	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	
	public static Logger getLog() {
		return LOG;
	}
	
}
