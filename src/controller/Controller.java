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

public class Controller {
	// ----------------------------------------------
	// поля, свойства необходимые Controller     Invalid input data password...
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	private static final String MESSAGE_ATTENTION = "Внимание";
	private static final String MESSAGE_INVALID_INPUT_DATA_PASSWORD = "Некорректно введен логин или пароль";
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AdministrativeInput)
	 */
	private AdministrativeInput administrativeInput;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AddPrincipal)
	 */
	private AddEmployeeAdministration addEmployeeAdministration;
	
	// ----------------------------------------------
	// конструктор Controller
	// ----------------------------------------------
	public Controller(AdministrativeInput administrativeInput, AddEmployeeAdministration addEmployeeAdministration) {
		LOG.debug("запущен конструктор в Controller");
		this.administrativeInput = administrativeInput;
		this.addEmployeeAdministration = addEmployeeAdministration;
	}
	 
	// ----------------------------------------------
	// Метод отвечающий за вариант запуска программы
	// ----------------------------------------------
	public void startController() {
		LOG.debug("запущен метод - startController(); (Метод отвечающий за вариант запуска программы), в классе -  Controller");
		int size = Company.getMycompany().getSizefileWorkingStaff();
		if (size < 0) {
			administrativeInput.setVisible(true);
			initControllerAdministrativeInput();
			
			
		} else {
			addEmployeeAdministration.setVisible(true);
			initControllerAddPrincipal();
		}
	}
	
	
	// ----------------------------------------------
	// Метод отвечающий за команды кнопок в АДМИНИМСТРАТИВНОМ ОКОШКЕ
	// ----------------------------------------------
	private void initControllerAdministrativeInput() {
		LOG.debug("запущен метод - initControllerAdministrativeInput(); (Метод отвечающий за команды кнопок в АДМИНИМСТРАТИВНОМ ОКОШКЕ), в классе -  Controller");
		administrativeInput.getButtonLogin().addActionListener(clickEvent -> checkedLogin());
		administrativeInput.getButtonCancel().addActionListener(clickEvent -> checkCancel());
	}
	// ----------------------------------------------
	// Метод проверяет login введенный пользователем
	// ----------------------------------------------
	private void checkedLogin() {
		LOG.debug("запущен метод - checkedLogin(); (Метод проверяет login введенный пользователем), в классе -  Controller");
		
	}
	
	// ----------------------------------------------
	// Метод отменяющий данные введеные пользователем
	// ----------------------------------------------
	private void checkCancel() {
		LOG.debug("запущен метод - checkCancel(); (Метод отменяющий данные введеные пользователем), в классе -  Controller");

	}
	
	// ----------------------------------------------
	// Метод отвечающий за нажитие на buttonNext в окне добавления директора 
	// ----------------------------------------------
	private void initControllerAddPrincipal() {
		LOG.debug("запущен метод - initControllerAddPrincipal(); (Метод отвечающий за нажитие на buttonNext в окне добавления директора ), в классе -  Controller");
		Principal principal = Principal.PRINCIPAL;
		if (principal instanceof Employee) {
			addEmployeeAdministration.getButtonNext().addActionListener(clickEvent -> checkedPassword(addEmployeeAdministration, principal));
		}
	}

	// ----------------------------------------------
	// Метод отвечающий за проверку корректности логина и пароля
	// ----------------------------------------------
	private void checkedPassword(JFrame args, Employee emp) {
		LOG.debug("запущен метод - checkedPassword(); (Метод отвечающий за проверку корректности логина и пароля), в классе -  Controller");
		if (args instanceof AddEmployeeAdministration){
			String login = ((AddEmployeeAdministration) args).getTextFieldLogin().getText();
			String password = ((AddEmployeeAdministration) args).getTextFieldPassword().getText();
			String passwordVerification =  ((AddEmployeeAdministration) args).getTextFieldPasswordVerification().getText();
			if (login.equals("") || password.equals("") || passwordVerification.equals("")) {
				JOptionPane.showMessageDialog(addEmployeeAdministration, MESSAGE_INVALID_INPUT_DATA_PASSWORD);
			} else if(!password.equals(passwordVerification)) {
				JOptionPane.showMessageDialog(addEmployeeAdministration, MESSAGE_INVALID_INPUT_DATA_PASSWORD);
			} else {
				addData(emp);
			}	
		}
	}
	// ----------------------------------------------
	// Метод отвечающий за добавление данных о Сотруднике(администраци)
	// ----------------------------------------------
	private void addData(Employee emp) {
		LOG.debug("запущен метод - addData(); (Метод отвечающий за добавление данных о Сотруднике(администраци)), в классе -  Controller");

		emp.setFirstName(addEmployeeAdministration.getTextFieldFirstName().getText());
		
	}
	

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	
	
	
	
}
