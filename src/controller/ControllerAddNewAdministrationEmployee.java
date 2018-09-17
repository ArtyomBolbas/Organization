package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import main.Runner;
import model.hierarchy.of.employees.Employee;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;

public class ControllerAddNewAdministrationEmployee {
	// ----------------------------------------------
	// поля, свойства необходимые Controller
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(Runner.class);
	private static final String MESSAGE_INVALID_INPUT_DATA_PASSWORD = "Некорректно введен логин или пароль";

	private Employee employee;

	/**
	 * Контроллер хранит внешнее представление для изменения
	 * (AddEmployeeAdministration)
	 */
	private AddEmployeeAdministration addEmployeeAdministration;

	// ----------------------------------------------
	// конструктор ControllerAddNewAdministrationEmployee
	// ----------------------------------------------

	public ControllerAddNewAdministrationEmployee() {

	}

	public ControllerAddNewAdministrationEmployee(AddEmployeeAdministration addEmployeeAdministration) {
		LOG.debug("запущен конструктор в ControllerAddNewAdministrationEmployee");
		this.addEmployeeAdministration = addEmployeeAdministration;
	}

	public ControllerAddNewAdministrationEmployee(Employee employee) {
		LOG.debug("запущен конструктор в ControllerAddNewAdministrationEmployee");
		this.employee = employee;
	}

	// ----------------------------------------------
	// Метод start() - стратует процес добавлени сотрудника администрвации
	// ----------------------------------------------
	public void start(Employee employee) {
		LOG.debug("запущен метод - start(); (Метод start() - стратует процес добавлени сотрудника администрвации), в классе -  ControllerAddNewAdministrationEmployee");
		addEmployeeAdministration.setVisible(true);
		addEmployeeAdministration.getButtonNext().addActionListener(clickEvent -> checkedPassword(addEmployeeAdministration, employee));
	}

	// ----------------------------------------------
	// Метод отвечающий за проверку корректности логина и пароля
	// ----------------------------------------------
	private void checkedPassword(JFrame args, Employee emp) {
		LOG.debug("запущен метод - checkedPassword(); (Метод отвечающий за проверку корректности логина и пароля), в классе -  ControllerAddNewAdministrationEmployee");
		if (args instanceof AddEmployeeAdministration) {
			String login = ((AddEmployeeAdministration) args).getTextFieldLogin().getText();
			String password = ((AddEmployeeAdministration) args).getTextFieldPassword().getText();
			String passwordVerification = ((AddEmployeeAdministration) args).getTextFieldPasswordVerification()
					.getText();
			if (login.equals("") || password.equals("") || passwordVerification.equals("")) {
				JOptionPane.showMessageDialog(addEmployeeAdministration, MESSAGE_INVALID_INPUT_DATA_PASSWORD);
			} else if (!password.equals(passwordVerification)) {
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
		LOG.debug("запущен метод - addData(); (Метод отвечающий за добавление данных о Сотруднике(администраци)), в классе -  ControllerAddNewAdministrationEmployee");

		emp.setFirstName(addEmployeeAdministration.getTextFieldFirstName().getText());
		
	}

}
