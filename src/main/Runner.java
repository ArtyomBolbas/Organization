package main;

import java.util.ArrayList;

import java.util.List;

import org.apache.log4j.Logger;

import controller.ControllerAddNewAdministrationEmployee;
import controller.ControllerManagingWindow;
import controller.ControllerStart;
import controller.ControllerVerifyLoginAndPassword;
import model.company.Company;
import model.hierarchy.of.employees.Employee;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;
import view.ManagingWindow;

public class Runner {

	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	
	
	public static void main(String[] args) {
		LOG.debug("запущен метод - main(String[] args); (Главный метод приложения), в классе -  Runner");
		Company.setNameCompany("JSC Mogilevtehmontage");
		
		
		// ---------------------------------
		// Списки работников: работающих, черный списов и список объектов
		// ---------------------------------
		List <Employee> workingStaff = new ArrayList<Employee>();
		
		
		
		
		// ---------------------------------
		// Создаем внешний вид
		// ---------------------------------
		AdministrativeInput administrativeInput = new AdministrativeInput();
		
		AddEmployeeAdministration addEmployeeAdministration = new AddEmployeeAdministration();
		
		ManagingWindow managingWindow = new ManagingWindow();
		
		// ---------------------------------
		// Создаем контроллер 
		// ---------------------------------
		ControllerManagingWindow controllerManagingWindow = new ControllerManagingWindow(managingWindow, addEmployeeAdministration);
		ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword = new ControllerVerifyLoginAndPassword(administrativeInput, managingWindow, controllerManagingWindow);
		ControllerAddNewAdministrationEmployee controllerAddNewAdministrationEmployee = new ControllerAddNewAdministrationEmployee(addEmployeeAdministration, controllerVerifyLoginAndPassword);
		ControllerManagingWindow controllerManagingWindow = new ControllerManagingWindow(managingWindow, addEmployeeAdministration, controllerAddNewAdministrationEmployee);
		ControllerStart controllerStart = new ControllerStart(administrativeInput, controllerAddNewAdministrationEmployee, controllerVerifyLoginAndPassword); 
		controllerStart.startController();
	}

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public static Logger getLog() {
		return LOG;
	}
	
}
