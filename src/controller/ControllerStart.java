package controller;

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
	// поля, свойства необходимые Controller     
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	private static final String MESSAGE_ATTENTION = "Внимание";
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AdministrativeInput)
	 */
	private AdministrativeInput administrativeInput;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (ControllerAddNewAdministrationEmployee)
	 */
	private ControllerAddNewAdministrationEmployee addNewAdministrationEmployee;
	
	// ----------------------------------------------
	// конструктор ControllerStart
	// ----------------------------------------------
	public ControllerStart(AdministrativeInput administrativeInput, ControllerAddNewAdministrationEmployee addNewAdministrationEmployee) {
		LOG.debug("запущен конструктор в ControllerStart");
		this.administrativeInput = administrativeInput;
		this.addNewAdministrationEmployee = addNewAdministrationEmployee;
	}
	 
	// ----------------------------------------------
	// Метод отвечающий за вариант запуска программы
	// ----------------------------------------------
	public void startController() {
		LOG.debug("запущен метод - startController(); (Метод отвечающий за вариант запуска программы), в классе -  ControllerStart");
		int size = Company.getMycompany().getSizefileWorkingStaff();
		if (size < 0) {
			administrativeInput.setVisible(true);
			initControllerAdministrativeInput();	
		} else {
			initControllerAddPrincipal();
		}
	}
	
	
	// ----------------------------------------------
	// Метод отвечающий за команды кнопок в АДМИНИМСТРАТИВНОМ ОКОШКЕ
	// ----------------------------------------------
	private void initControllerAdministrativeInput() {
		LOG.debug("запущен метод - initControllerAdministrativeInput(); (Метод отвечающий за команды кнопок в АДМИНИМСТРАТИВНОМ ОКОШКЕ), в классе -  ControllerStart");
		administrativeInput.getButtonLogin().addActionListener(clickEvent -> checkedLogin());
		administrativeInput.getButtonCancel().addActionListener(clickEvent -> checkCancel());
	}
	// ----------------------------------------------
	// Метод проверяет login введенный пользователем
	// ----------------------------------------------
	private void checkedLogin() {
		LOG.debug("запущен метод - checkedLogin(); (Метод проверяет login введенный пользователем), в классе -  ControllerStart");
		
	}
	
	// ----------------------------------------------
	// Метод отменяющий данные введеные пользователем
	// ----------------------------------------------
	private void checkCancel() {
		LOG.debug("запущен метод - checkCancel(); (Метод отменяющий данные введеные пользователем), в классе -  ControllerStart");
		System.exit(0);
	}
	
	// ----------------------------------------------
	// Метод отвечающий за нажитие на buttonNext в окне добавления директора 
	// ----------------------------------------------
	private void initControllerAddPrincipal() {
		LOG.debug("запущен метод - initControllerAddPrincipal(); (Метод отвечающий за нажитие на buttonNext в окне добавления директора ), в классе -  ControllerStart");
		addNewAdministrationEmployee = new ControllerAddNewAdministrationEmployee();
		Principal principal = Principal.PRINCIPAL;
		addNewAdministrationEmployee.start(principal);
	}

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	
	
	
	
}
