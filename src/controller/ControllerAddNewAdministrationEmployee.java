package controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import main.Runner;
import model.company.Company;
import model.hierarchy.of.employees.Administration;
import model.hierarchy.of.employees.Employee;
import model.hierarchy.of.employees.Master;
import model.hierarchy.of.employees.Principal;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;

public class ControllerAddNewAdministrationEmployee {
	// ----------------------------------------------
	// поля, свойства необходимые ControllerAddNewAdministrationEmployee
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(ControllerAddNewAdministrationEmployee.class);
	private static final String MESSAGE_INVALID_INPUT_DATA_LOGIN_AND_PASSWORD = "Некорректно или не полностью заполненны поля ввода логина или пароля";
	private static final String MESSAGE_INVALID_INPUT_DATA_PASSWORD = "Пароли не совпадают";
	private static final String MESSAGE_INVALID_INPUT_DATA_LOGIN = "Аккаунт под таким логином уже существует";


	private String login;
	private String password;
	private String passwordVerification;

	private static final String FILE_BLACK_LIST = "File black list";
	private static final String FILE_WORKING_STAFF_LIST = "File workingStaff list";
	/**
	 * Контроллер хранит внешнее представление для изменения
	 * (AddEmployeeAdministration)
	 */
	private AddEmployeeAdministration addEmployeeAdministration;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AdministrativeInput)
	 */
	private ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword;

	// ----------------------------------------------
	// конструктор ControllerAddNewAdministrationEmployee
	// ----------------------------------------------

	/*
	 * public ControllerAddNewAdministrationEmployee() {
	 * LOG.debug("запущен конструктор в ControllerAddNewAdministrationEmployee");
	 * 
	 * }
	 */

/*	public ControllerAddNewAdministrationEmployee(AddEmployeeAdministration addEmployeeAdministration, 
			ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword) {
		LOG.debug("запущен конструктор в ControllerAddNewAdministrationEmployee; (с парамметрами");
		this.addEmployeeAdministration = addEmployeeAdministration;
		this.controllerVerifyLoginAndPassword = controllerVerifyLoginAndPassword;
	}*/
	
	public ControllerAddNewAdministrationEmployee() {
		LOG.debug("запущен конструктор в ControllerAddNewAdministrationEmployee; (без парамметрами");

	}



	// ----------------------------------------------
	// Метод start() - стратует процес добавлени сотрудника администрвации
	// ----------------------------------------------
	public void start(Employee employee) {
		LOG.debug(
				"запущен метод - start(); (Метод start() - стратует процес добавлени сотрудника администрвации), в классе -  ControllerAddNewAdministrationEmployee");
		addEmployeeAdministration.getPanel().removeAll();
		addEmployeeAdministration.getPanel().add(addEmployeeAdministration.initPanelinitAddEmployeeAdministration());
		addEmployeeAdministration.revalidate();
		addEmployeeAdministration.setVisible(true);
		addEmployeeAdministration.getTextFieldPosition().setText(employee.getPosition());
		addEmployeeAdministration.getTextFieldPosition().setEditable(false);
		addEmployeeAdministration.getTextFieldDateOfEmployment().setText(employee.getDateOfEmployment().toString());
		addEmployeeAdministration.getTextFieldDateOfEmployment().setEditable(false);
		addEmployeeAdministration.getButtonNext()
				.addActionListener(clickEvent -> checkedPassword(addEmployeeAdministration, employee));
	}

	// ----------------------------------------------
	// Метод отвечающий за проверку корректности логина и пароля
	// ----------------------------------------------
	private void checkedPassword(JFrame args, Employee employee) {
		LOG.debug(
				"запущен метод - checkedPassword(); (Метод отвечающий за проверку корректности логина и пароля), в классе -  ControllerAddNewAdministrationEmployee");
		if (args instanceof AddEmployeeAdministration) {
			login = ((AddEmployeeAdministration) args).getTextFieldLogin().getText();
			password = ((AddEmployeeAdministration) args).getTextFieldPassword().getText();
			passwordVerification = ((AddEmployeeAdministration) args).getTextFieldPasswordVerification().getText();
			List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
			LOG.info("в метода checkedPassword() > " + workingStaff.size());
			for (Employee employee1: workingStaff) {
				if (employee instanceof Administration) {
					if (login.equals(((Administration) employee).getLogin())) {
						if (password.equals(((Administration) employee).getPassword())) {
							JOptionPane.showMessageDialog(addEmployeeAdministration, MESSAGE_INVALID_INPUT_DATA_LOGIN);
						}
					}
				}
			}
			if (login.equals("") || password.equals("") || passwordVerification.equals("")) {
				JOptionPane.showMessageDialog(addEmployeeAdministration, MESSAGE_INVALID_INPUT_DATA_LOGIN_AND_PASSWORD);
			} else if (!password.equals(passwordVerification)) {
				JOptionPane.showMessageDialog(addEmployeeAdministration, MESSAGE_INVALID_INPUT_DATA_PASSWORD);
			} else {

				addData(employee);
			}
		}
	}

	// ----------------------------------------------
	// Метод отвечающий за добавление данных о Сотруднике(администраци)
	// ----------------------------------------------
	private void addData(Employee employee) {
		LOG.debug(
				"запущен метод - addData(); (Метод отвечающий за добавление данных о Сотруднике(администраци)), в классе -  ControllerAddNewAdministrationEmployee");
		if (employee instanceof Administration) {
			employee.setFirstName(addEmployeeAdministration.getTextFieldFirstName().getText());
			employee.setSurName(addEmployeeAdministration.getTextFieldSurName().getText());
			employee.setPatronymic(addEmployeeAdministration.getTextFieldPatronymic().getText());
			((Administration) employee).setLogin(addEmployeeAdministration.getTextFieldLogin().getText());
			((Administration) employee).setPassword(addEmployeeAdministration.getTextFieldPassword().getText());
			//saveAdministration(employee);
			Company.myCompany.addEmployeeWorkingStaff(employee);
			addEmployeeAdministration.setVisible(false);
			
			if (employee instanceof Principal) {
				controllerVerifyLoginAndPassword.verify();	
			}
			
		}

	}

	// ----------------------------------------------
	// Метод отвечающий за запись нового сотрудника администрации в файл
	// ----------------------------------------------
	private void saveAdministration(Employee employee) {
		LOG.debug(
				"запущен метод - saveAdministration(); (Метод отвечающий за запись нового сотрудника администрации в файл), в классе -  ControllerAddNewAdministrationEmployee");
		try(FileOutputStream fileOutputStreamForWorkingStaff = new FileOutputStream(FILE_WORKING_STAFF_LIST)){
			try(ObjectOutputStream objectOutputStreamForWorkingStaff = new ObjectOutputStream(fileOutputStreamForWorkingStaff)){
				if (employee instanceof Principal) {
					//Company.myCompany.getWorkingStaff().add(employee);
					List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
					workingStaff.add(employee);
					objectOutputStreamForWorkingStaff.writeObject(workingStaff);
					objectOutputStreamForWorkingStaff.close();
				}
			}
		} catch (FileNotFoundException e) {
			LOG.error("FileNotFoundException - (инициализация: fileInputStream)", e);
		} catch (IOException e) {
			LOG.error("IOException - (Файл еще не создан)", e);
		}
		
/*		if (employee instanceof Principal) {
			//Company.myCompany.getWorkingStaff().add(employee);
			List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
			workingStaff.add(employee);	
			objectOutputStreamForWorkingStaff.writeObject(workingStaff);
			objectOutputStreamForWorkingStaff.close();
		}*/
	
	}

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public void setAddEmployeeAdministration(AddEmployeeAdministration addEmployeeAdministration) {
		this.addEmployeeAdministration = addEmployeeAdministration;
	}
	
	public void setControllerVerifyLoginAndPassword(ControllerVerifyLoginAndPassword controllerVerifyLoginAndPassword) {
		this.controllerVerifyLoginAndPassword = controllerVerifyLoginAndPassword;
	}
}
