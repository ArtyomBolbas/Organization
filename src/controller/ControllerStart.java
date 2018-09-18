package controller;

import java.io.File;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;


import main.Runner;
import model.company.Company;
import model.hierarchy.of.employees.Employee;
import model.hierarchy.of.employees.Principal;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;

public class ControllerStart {
	// ----------------------------------------------
	// поля, свойства необходимые ControllerStart     
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(ControllerStart.class);
	
	private static final String MESSAGE_ATTENTION = "Внимание";
	private static final String MESSAGE_ABOUT_POSITION = "Директор";
	
	private Date date;
	
	private File fileWorkingStaff;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AdministrativeInput)
	 */
	private AdministrativeInput administrativeInput;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (ControllerAddNewAdministrationEmployee)
	 */
	private ControllerAddNewAdministrationEmployee controllerAddNewAdministrationEmployee;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (ControllerAddNewAdministrationEmployee)
	 */
	private ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword;
	
	// ----------------------------------------------
	// конструктор ControllerStart
	// ----------------------------------------------
	public ControllerStart(AdministrativeInput administrativeInput, ControllerAddNewAdministrationEmployee controllerAddNewAdministrationEmployee, ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword) {
		LOG.debug("запущен конструктор в ControllerStart");
		this.administrativeInput = administrativeInput;
		this.controllerAddNewAdministrationEmployee = controllerAddNewAdministrationEmployee;
		this.controllerVerifyLoginAndPassword = controllerVerifyLoginAndPassword;
	}
	 
	// ----------------------------------------------
	// Метод отвечающий за вариант запуска программы
	// ----------------------------------------------
	public void startController() {
		LOG.debug("запущен метод - startController(); (Метод отвечающий за вариант запуска программы), в классе -  ControllerStart");
		fileWorkingStaff = Company.getMycompany().getFileWorkingStaff();
		if (fileWorkingStaff.length() > 0) {
			controllerVerifyLoginAndPassword.verify();	
		} else {
			initControllerAddPrincipal();
		}
	}
	
	
	// ----------------------------------------------
	// Метод отвечающий за нажитие на buttonNext в окне добавления директора 
	// ----------------------------------------------
	private void initControllerAddPrincipal() {
		LOG.debug("запущен метод - initControllerAddPrincipal(); (Метод отвечающий за нажитие на buttonNext в окне добавления директора ), в классе -  ControllerStart");
		Principal principal = Principal.PRINCIPAL;
		date = new Date();
		principal.setPosition(MESSAGE_ABOUT_POSITION);
		principal.setDateOfEmployment(date);
		controllerAddNewAdministrationEmployee.start(principal);
	}

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	
	
	
	
}
