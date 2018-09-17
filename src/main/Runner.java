package main;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import controller.ControllerAddNewAdministrationEmployee;
import controller.ControllerStart;
import model.hierarchy.of.employees.Employee;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;

public class Runner {

	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	
	
	public static void main(String[] args) {
		LOG.debug("запущен метод - main(String[] args); (Главный метод приложения), в классе -  Runner");
		
		
		
		// ---------------------------------
		// Списки работников: работающих, черный списов и список объектов
		// ---------------------------------
		List <Employee> workingStaff = new ArrayList<Employee>();
		
		
		
		
		// ---------------------------------
		// Создаем внешний вид
		// ---------------------------------
		AdministrativeInput administrativeInput = new AdministrativeInput();
		
		AddEmployeeAdministration addEmployeeAdministration = new AddEmployeeAdministration();
		
		// ---------------------------------
		// Создаем контроллер 
		// ---------------------------------
		ControllerAddNewAdministrationEmployee addNewAdministrationEmployee = new ControllerAddNewAdministrationEmployee();
		ControllerStart controllerStart = new ControllerStart(administrativeInput, addNewAdministrationEmployee); 
		controllerStart.startController();
	}

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public static Logger getLog() {
		return LOG;
	}
	
}
