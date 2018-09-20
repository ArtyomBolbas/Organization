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
		// 
		// ---------------------------------
	
		
		
		
		
		// ---------------------------------
		// Создаем внешний вид
		// ---------------------------------
		AdministrativeInput administrativeInput = new AdministrativeInput();
		
		AddEmployeeAdministration addEmployeeAdministration = new AddEmployeeAdministration();
		
		ManagingWindow managingWindow = new ManagingWindow();
		
		// ---------------------------------
		// Создаем контроллер 
		// ---------------------------------
		ControllerManagingWindow controllerManagingWindow = new ControllerManagingWindow();
		
		ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword = new ControllerVerifyLoginAndPassword(administrativeInput, managingWindow, controllerManagingWindow);
		
		ControllerAddNewAdministrationEmployee controllerAddNewAdministrationEmployee = new ControllerAddNewAdministrationEmployee();
		
		ControllerStart controllerStart = new ControllerStart(); 
		controllerStart.setAdministrativeInput(administrativeInput);
		controllerStart.setControllerAddNewAdministrationEmployee(controllerAddNewAdministrationEmployee);
		controllerStart.setControllerVerifyLoginAndPassword(controllerVerifyLoginAndPassword);
		
		
		controllerAddNewAdministrationEmployee.setAddEmployeeAdministration(addEmployeeAdministration);
		controllerAddNewAdministrationEmployee.setControllerVerifyLoginAndPassword(controllerVerifyLoginAndPassword);
		
		
		controllerManagingWindow.setManagingWindow(managingWindow);
		controllerManagingWindow.setControllerAddNewAdministrationEmployee(controllerAddNewAdministrationEmployee);
		
		controllerStart.startController();
	}

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------

	
}
