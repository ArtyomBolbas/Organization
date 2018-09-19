package controller;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import model.company.Company;
import model.hierarchy.of.employees.Administration;
import model.hierarchy.of.employees.Employee;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;
import view.ManagingWindow;

public class ControllerVerifyLoginAndPassword {
	// ----------------------------------------------
	// поля, свойства необходимые ControllerVerifyLoginAndPassword     
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(ControllerVerifyLoginAndPassword.class);
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AdministrativeInput)
	 */
	private AdministrativeInput administrativeInput;
	
	
	/**
	 * Контроллер хранит внешнее представление для изменения (ManagingWindow)
	 */
	private ManagingWindow managingWindow;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (ControllerManagingWindow)
	 */
	private ControllerManagingWindow controllerManagingWindow;
	
	// ----------------------------------------------
	// конструктор ControllerVerifyLoginAndPassword
	// ----------------------------------------------
	public ControllerVerifyLoginAndPassword(AdministrativeInput administrativeInput, ManagingWindow managingWindow, ControllerManagingWindow controllerManagingWindow) {
		LOG.debug("запущен конструктор в ControllerVerifyLoginAndPassword");
		this.administrativeInput = administrativeInput;
		this.managingWindow = managingWindow;
		this.controllerManagingWindow = controllerManagingWindow;
	}
	
	// ----------------------------------------------
	// Метод оккрывает окошко для ввода login and password
	// ----------------------------------------------
	public void verify() {
		LOG.debug("запущен метод - verify(); (Метод оккрывает окошко для ввода login and password), в классе -  ControllerVerifyLoginAndPassword");
		administrativeInput.setVisible(true);
		administrativeInput.getButtonLogin().addActionListener(clickEvent -> checkedLogin());
		administrativeInput.getButtonCancel().addActionListener(clickEvent -> checkCancel());
		
	}

	// ----------------------------------------------
	// Метод проверяет login and password введенный пользователем
	// ----------------------------------------------
	private void checkedLogin() {
		LOG.debug("запущен метод - checkedLogin(); (Метод проверяет login and password введенный пользователем), в классе -  ControllerVerifyLoginAndPassword");
		String login = administrativeInput.getLoginTextField().getText();
		String password = administrativeInput.getPasswordField().getText();
		
		List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
		for (Employee employee: workingStaff) {
			if (employee instanceof Administration) {
				if (login.equals(((Administration) employee).getLogin())) {
					if (password.equals(((Administration) employee).getPassword())) {
						administrativeInput.setVisible(false);
						controllerManagingWindow.initControllerManagingWindow(employee);
						managingWindow.setVisible(true);
					}
				}
			}
		}
	}

	// ----------------------------------------------
	// Метод отменяющий данные введеные пользователем
	// ----------------------------------------------
	private void checkCancel() {
		LOG.debug("запущен метод - checkCancel(); (Метод отменяющий данные введеные пользователем), в классе -  ControllerVerifyLoginAndPassword");
		administrativeInput.getLoginTextField().setText(null);
		administrativeInput.getPasswordField().setText(null);
	}
	
	
}
