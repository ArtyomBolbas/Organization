package controller;

import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import model.company.Company;
import model.hierarchy.of.employees.Administration;
import model.hierarchy.of.employees.ChiefEnginner;
import model.hierarchy.of.employees.Employee;
import model.hierarchy.of.employees.Foreman;
import model.hierarchy.of.employees.Master;
import model.hierarchy.of.employees.Principal;
import view.AddEmployeeAdministration;
import view.AdministrativeInput;
import view.ListsEmployee;
import view.ManagingWindow;

public class ControllerManagingWindow {
	// ----------------------------------------------
	// поля, свойства необходимые ControllerManagingWindow
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(ControllerManagingWindow.class);

	private final static String MESSAGE_ON_THE_RECEPTION_TO_WORK = "Прием на работу";

	private static final String MESSAGE_SELECTING_THE_STAFF_CATEGORY = "Выбирите категорию сотрудника:";
	private static final String EMPLOYEE_ADMINISTRATION = "Сотрудник администрации";
	private static final String EMPLOYEE_WORKING = "Сотрудник рабочей специальности";
	private static final String[] ARRAYS_SELECTING_THE_STAFF_CATEGORY = { EMPLOYEE_ADMINISTRATION, EMPLOYEE_WORKING };

	private static final String MESSAGE_SELECTION_OF_THE_EMPLOYEE = "Выбирите сотрудника для трудоустройства";
	private static final String MESSAGE_MASTER = "МАСТЕР";
	private static final String MESSAGE_FOREMAN = "ПРОРАБ";
	private static final String MESSAGE_CHIEF_ENGINEER = "НАЧ. УЧАСТКА";
	private static final String[] ARRAYS_SELECTION_OF_THE_EMPLOYEE_ADMINISTRATION = { MESSAGE_MASTER, MESSAGE_FOREMAN,
			MESSAGE_CHIEF_ENGINEER };

	private static final String MESSAGE_WELDER = "Сварщик";
	private static final String MESSAGE_INSTALLER = "Монтажник";
	private static final String[] ARRSYS_SELECTION_OF_THE_EMPLOYEE_WORKING = { MESSAGE_WELDER, MESSAGE_INSTALLER };
	
	private static final String POSITION_MASTER = "Мастер";
	private static final String POSITION_FOREMAN = "Прораб";
	private static final String POSITION_CHIEF_ENGINEER = "Нач. участка";
	
	private Date date = new Date();
	

	/**
	 * Контроллер хранит внешнее представление для изменения (ManagingWindow)
	 */
	private ManagingWindow managingWindow;
	
	private List<Employee> workingSraff;

	/**
	 * Контроллер хранит внешнее представление для изменения (ControllerAddNewAdministrationEmployee)
	 */
	private ControllerAddNewAdministrationEmployee controllerAddNewAdministrationEmployee;
	// ----------------------------------------------
	// конструктор ControllerManagingWindow
	// ----------------------------------------------
	public ControllerManagingWindow() {
		LOG.debug("запущен конструктор в ControllerManagingWindow");
		//this.managingWindow = managingWindow;
		//this.addEmployeeAdministration = addEmployeeAdministration;
	}

	// ----------------------------------------------
	// Метод добавляет информицию о компании и дbректоре
	// ----------------------------------------------
	public void initControllerManagingWindow(Employee employee) {
		LOG.debug("запущен метод - initControllerManagingWindow(); (Метод добавляет информицию о компании и дbректоре), в классе -  ControllerManagingWindow");

		managingWindow.getLabelNameCompany().setText(Company.myCompany.getNameCompany());
		List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
		for (Employee employee1 : workingStaff) {
			if (employee1 instanceof Principal) {
				managingWindow.getLabelNamePrincipal().setText(Principal.PRINCIPAL.fullName(employee1));
			}
		}
		managingWindow.getLabelFullNameEmployee().setText(employee.fullName(employee));
		managingWindow.getLabelPosition().setText(employee.getPosition());

		managingWindow.getButtonTakeToWork().addActionListener(click -> takeToWork());
		managingWindow.getButtonListOfEmployees().addActionListener(click -> listOfEmployees());
		
	}


	// ----------------------------------------------
	// Метод добавляет сотрудника (трудоустраивает)
	// ----------------------------------------------
	private void takeToWork() {
		LOG.debug("запущен метод - takeToWork(); (Метод добавляет сотрудника (трудоустраивает)), в классе -  ControllerManagingWindow");

		try {
			String resultEmployee = (String) JOptionPane.showInputDialog(managingWindow,
					MESSAGE_SELECTING_THE_STAFF_CATEGORY, MESSAGE_ON_THE_RECEPTION_TO_WORK,
					JOptionPane.QUESTION_MESSAGE, null, ARRAYS_SELECTING_THE_STAFF_CATEGORY,
					ARRAYS_SELECTING_THE_STAFF_CATEGORY);
			if (resultEmployee.equals(EMPLOYEE_ADMINISTRATION)) {
				
				String resultAdministration = (String) JOptionPane.showInputDialog(managingWindow,
						MESSAGE_SELECTION_OF_THE_EMPLOYEE, MESSAGE_ON_THE_RECEPTION_TO_WORK,
						JOptionPane.QUESTION_MESSAGE, null, ARRAYS_SELECTION_OF_THE_EMPLOYEE_ADMINISTRATION,
						ARRAYS_SELECTION_OF_THE_EMPLOYEE_ADMINISTRATION);
				if (resultAdministration.equals(MESSAGE_MASTER)) {
					Employee master = new Master();
					master.setPosition(POSITION_MASTER);
					master.setDateOfEmployment(date);
					controllerAddNewAdministrationEmployee.start(master);
					
				} else if(resultAdministration.equals(MESSAGE_FOREMAN)) {
					Employee foreman = new Foreman();
					foreman.setPosition(POSITION_FOREMAN);
					foreman.setDateOfEmployment(date);
					controllerAddNewAdministrationEmployee.start(foreman);
				} else if (resultAdministration.equals(MESSAGE_CHIEF_ENGINEER)) {
					Employee chiefEnginner = new ChiefEnginner();
					chiefEnginner.setPosition(POSITION_CHIEF_ENGINEER);
					chiefEnginner.setDateOfEmployment(date);
					controllerAddNewAdministrationEmployee.start(chiefEnginner);
				}
			} else if (resultEmployee.equals(EMPLOYEE_WORKING)) {

				String resultWorking = (String) JOptionPane.showInputDialog(managingWindow,
						MESSAGE_SELECTION_OF_THE_EMPLOYEE, MESSAGE_ON_THE_RECEPTION_TO_WORK,
						JOptionPane.QUESTION_MESSAGE, null, ARRSYS_SELECTION_OF_THE_EMPLOYEE_WORKING,
						ARRSYS_SELECTION_OF_THE_EMPLOYEE_WORKING);
			}
		} catch (NullPointerException e) {
			LOG.error("NullPointerException (ошибка падает, в случае если не выбрали сотрудника и нажили: ОТМЕНА" + e);
		}
	}
	/*
	 * int result = JOptionPane.showConfirmDialog( JOptionPaneTest.this,
	 * "Вам это нужно?", TITLE_confirm, JOptionPane.YES_NO_CANCEL_OPTION); // Окна
	 * подтверждения c 2-мя параметрами if (result == JOptionPane.YES_OPTION)
	 * JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вы не отказываетесь?");
	 * else if (result == JOptionPane.NO_OPTION)
	 * JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вы отказались?"); } });
	 * 
	 * JOptionPane.showInputDialog( JOptionPaneTest.this,
	 * "Выберите любимый напиток :", "Выбор напитка", JOptionPane.QUESTION_MESSAGE,
	 * icon, drink, drink[0]); // Диалоговое окно вывода сообщения
	 * JOptionPane.showMessageDialog(JOptionPaneTest.this, result);
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	// ----------------------------------------------
	// Метод показывает актуальныый список сотрудников
	// ----------------------------------------------
	private void listOfEmployees() {
		LOG.debug("запущен метод - listOfEmployees(); (Метод показывает актуальныый список сотрудников), в классе -  ControllerManagingWindow");
		workingSraff = Company.myCompany.getWorkingStaff();
		ListsEmployee panelListEmployee = new ListsEmployee();
	//	managingWindow.getPanelRightMiddle().removeAll();
	//	managingWindow.getPanelRightMiddle().add(panelListEmployee.initPanelListEmployee());
		//managingWindow.getPanelRightMiddle().revalidate();
		
		panelListEmployee.setVisible(true);
		//managingWindow.get
		
	}

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public void setManagingWindow(ManagingWindow managingWindow) {
		this.managingWindow = managingWindow;
	}

	public void setControllerAddNewAdministrationEmployee(
			ControllerAddNewAdministrationEmployee controllerAddNewAdministrationEmployee) {
		this.controllerAddNewAdministrationEmployee = controllerAddNewAdministrationEmployee;
	}

	
	
}
