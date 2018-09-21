package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import main.Runner;
import model.hierarchy.of.employees.Principal;

public class ManagingWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3729587581448311406L;
	// ----------------------------------------------
	// поля, свойства необходимые ManagingWindow
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(ManagingWindow.class);

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 600;

	private static final String WINDOW_TITLE = "Management";

	private static final String TAKE_TO_WORK = "Устроить на работу";
	private static final String TO_LAY_OF_WORK = "Уволить с работы";
	private static final String REMOVE = "Отстранить от работы";
	private static final String ADD_OBJECT = "Добавить объект";
	private static final String MOVE_AN_EMPLOYEE = "Переместить сотрудника на объект";
	private static final String LIST_OF_EMPLOYEE = "Список сотрудников";
	private static final String LIST_OF_DISMISSED_EMPLOYEES = "Список отстранненых сотрудников";
	private static final String BLACK_LIST = "Черный список";
	private static final String OBJECTS = "Список объектов";
	private static final String EDIT_PROFILE = "Редактировать профиль";

	private static final String INFORMATION_ABOUT_COMPANY = "Информация о компании:";
	private static final String INFORMATION_ABOUT_EMPLOYEE = "Информация о сотруднике:";
	private static final String COMPANY = "Название компании:";
	private static final String COMPANY_MANAGER = "Управляющий компанией:";
	private static final String NAME_EMPLOYEE = "Фамилия Имя Отчество:";
	private static final String POSITION_EMPLOYEE = "Должность:";
	
	private Font fontLabelMain;
	private Font fontLabel;

	
	private JLabel labelNameEmployee;
	private JLabel labelPositionEmployee;
	private JLabel labelInformationAboutEmployee;
	private JLabel labelFullNameEmployee;
	private JLabel labelPosition;
	
	private JLabel labelCompany;
	private JLabel labelCompanyManager;
	private JLabel labelInformationAboutCompany;
	private JLabel labelNameCompany;
	private JLabel labelNamePrincipal;

	private JButton buttonTakeToWork;
	private JButton buttonToLayOffWork;
	private JButton buttonRemove;
	private JButton buttonAddObject;
	private JButton buttonMoveAnEmployee;
	private JButton buttonListOfEmployees;
	private JButton buttonListOfDismissedEmployees;
	private JButton buttonBlackList;
	private JButton buttonObjects;
	private JButton buttonEditProfile;
	
	private JPanel panelRightMiddle;

	// ----------------------------------------------
	// конструктор ManagingWindow
	// ----------------------------------------------
	public ManagingWindow() {
		LOG.debug("запущен конструктор в ManagingWindow");
		initManagingWindow();
	}

	// ----------------------------------------------
	// метод "настроек" внешнего вида
	// ----------------------------------------------
	private void initManagingWindow() {
		LOG.debug(
				"запущен метод - initManagingWindow(); (метод \"настроек\" внешнего вида), в классе -  ManagingWindow");
		add(initPanelManagingWindow());

		setTitle(WINDOW_TITLE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
		pack();

	}

	// ----------------------------------------------
	// метод в котором добавляются и компануются эл-ты
	// ----------------------------------------------
	private JPanel initPanelManagingWindow() {
		LOG.debug(
				"запущен метод - initPanelManagingWindow(); (метод в котором добавляются и компануются эл-ты), в классе -  ManagingWindow");
		// самая главная панель
		JPanel panelMainMenu = new JPanel();
		panelMainMenu.setLayout(new BorderLayout());
		panelMainMenu.setBackground(Color.LIGHT_GRAY);

		// верхняя панель
		JPanel panelTop = new JPanel();
		panelTop.setLayout(new BorderLayout());

		JPanel panelLeftTop = new JPanel();
		panelLeftTop.setLayout(new BorderLayout());
		panelLeftTop.setPreferredSize(new Dimension(400, 75));
		
		JPanel panelLeftTopTop = new JPanel();
		
		JPanel panelLeftTopMiddle = new JPanel();
		panelLeftTopMiddle.setLayout(new GridLayout(2, 2));

		JPanel panelRightTop = new JPanel();
		panelRightTop.setLayout(new BorderLayout());
		panelRightTop.setPreferredSize(new Dimension(400, 75));
		
		JPanel panelRightTopTop = new JPanel();
		
		JPanel panelRightTopMiddle = new JPanel();
		panelRightTopMiddle.setLayout(new GridLayout(2, 2));

		// средняя компоновочная панель
		JPanel panelMiddle = new JPanel();
		panelMiddle.setLayout(new BorderLayout());

		// левая средняя панель
		JPanel panelLeftMiddle = new JPanel();
		panelLeftMiddle.setLayout(new GridLayout(10, 1));

		// правая средняя панель
		panelRightMiddle = new JPanel();

		// нижняя панель
		JPanel panelBottom = new JPanel();

		/*
		 * ИНИЦИАЛИЗАЦИЯ И РАЗМЕЩЕНИЕ КОМПОНЕНТОВ
		 */
		fontLabelMain = new Font("Verbana", Font.ITALIC, 20);
		fontLabel = new Font("Verbana", Font.ITALIC, 16);

		labelNameEmployee = new JLabel(NAME_EMPLOYEE);
		labelNameEmployee.setFont(fontLabel);
		labelPositionEmployee = new JLabel(POSITION_EMPLOYEE);
		labelPositionEmployee.setFont(fontLabel);
		labelInformationAboutEmployee = new JLabel(INFORMATION_ABOUT_EMPLOYEE);
		labelInformationAboutEmployee.setFont(fontLabelMain);
		labelFullNameEmployee = new JLabel();
		labelFullNameEmployee.setFont(fontLabel);
		labelPosition = new JLabel();
		labelPosition.setFont(fontLabel);
		
		
		labelCompany = new JLabel(COMPANY);
		labelCompany.setFont(fontLabel);
		labelCompanyManager = new JLabel(COMPANY_MANAGER);
		labelCompanyManager.setFont(fontLabel);
		labelInformationAboutCompany = new JLabel(INFORMATION_ABOUT_COMPANY);
		labelInformationAboutCompany.setFont(fontLabelMain);
		labelNameCompany = new JLabel();
		labelNameCompany.setFont(fontLabel);
		labelNamePrincipal = new JLabel();
		labelNamePrincipal.setFont(fontLabel);

		buttonTakeToWork = new JButton(TAKE_TO_WORK);
		buttonToLayOffWork = new JButton(TO_LAY_OF_WORK);
		buttonRemove = new JButton(REMOVE);
		buttonAddObject = new JButton(ADD_OBJECT);
		buttonMoveAnEmployee = new JButton(MOVE_AN_EMPLOYEE);
		buttonListOfEmployees = new JButton(LIST_OF_EMPLOYEE);
		buttonListOfDismissedEmployees = new JButton(LIST_OF_DISMISSED_EMPLOYEES);
		buttonBlackList = new JButton(BLACK_LIST);
		buttonObjects = new JButton(OBJECTS);
		buttonEditProfile = new JButton(EDIT_PROFILE);

		panelLeftTopTop.add(labelInformationAboutCompany);
		
		panelLeftTopMiddle.add(labelCompany);
		panelLeftTopMiddle.add(labelNameCompany);
		panelLeftTopMiddle.add(labelCompanyManager);
		panelLeftTopMiddle.add(labelNamePrincipal);

		panelRightTopTop.add(labelInformationAboutEmployee);
		
		panelRightTopMiddle.add(labelNameEmployee);
		panelRightTopMiddle.add(labelFullNameEmployee);
		panelRightTopMiddle.add(labelPositionEmployee);
		panelRightTopMiddle.add(labelPosition);
		
		panelLeftMiddle.add(buttonTakeToWork);
		panelLeftMiddle.add(buttonToLayOffWork);
		panelLeftMiddle.add(buttonRemove);
		panelLeftMiddle.add(buttonAddObject);
		panelLeftMiddle.add(buttonMoveAnEmployee);
		panelLeftMiddle.add(buttonListOfEmployees);
		panelLeftMiddle.add(buttonListOfDismissedEmployees);
		panelLeftMiddle.add(buttonBlackList);
		panelLeftMiddle.add(buttonObjects);
		panelLeftMiddle.add(buttonEditProfile);

		/*
		 * РАЗМЕЩЕНИЕМ ПАНЕЛЕЙ
		 */
		panelRightTop.add(panelRightTopTop, BorderLayout.NORTH);
		panelRightTop.add(panelRightTopMiddle, BorderLayout.CENTER);
		
		panelLeftTop.add(panelLeftTopTop, BorderLayout.NORTH);
		panelLeftTop.add(panelLeftTopMiddle, BorderLayout.CENTER);
		
		panelTop.add(panelLeftTop, BorderLayout.WEST);
		panelTop.add(panelRightTop, BorderLayout.EAST);

		panelMiddle.add(panelLeftMiddle, BorderLayout.WEST);
		panelMiddle.add(panelRightMiddle, BorderLayout.EAST);

		panelMainMenu.add(panelTop, BorderLayout.NORTH);
		panelMainMenu.add(panelMiddle, BorderLayout.CENTER);
		panelMainMenu.add(panelBottom, BorderLayout.SOUTH);

		return panelMainMenu;
	}

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public JLabel getLabelNameCompany() {
		return labelNameCompany;
	}

	public void setLabelNameCompany(JLabel labelNameCompany) {
		this.labelNameCompany = labelNameCompany;
	}

	public JLabel getLabelNamePrincipal() {
		return labelNamePrincipal;
	}

	public void setLabelNamePrincipal(JLabel labelNamePrincipal) {
		this.labelNamePrincipal = labelNamePrincipal;
	}

	public JButton getButtonTakeToWork() {
		return buttonTakeToWork;
	}

	public void setButtonTakeToWork(JButton buttonTakeToWork) {
		this.buttonTakeToWork = buttonTakeToWork;
	}

	public JButton getButtonToLayOffWork() {
		return buttonToLayOffWork;
	}

	public void setButtonToLayOffWork(JButton buttonToLayOffWork) {
		this.buttonToLayOffWork = buttonToLayOffWork;
	}

	public JButton getButtonRemove() {
		return buttonRemove;
	}

	public void setButtonRemove(JButton buttonRemove) {
		this.buttonRemove = buttonRemove;
	}

	public JButton getButtonAddObject() {
		return buttonAddObject;
	}

	public void setButtonAddObject(JButton buttonAddObject) {
		this.buttonAddObject = buttonAddObject;
	}

	public JButton getButtonMoveAnEmployee() {
		return buttonMoveAnEmployee;
	}

	public void setButtonMoveAnEmployee(JButton buttonMoveAnEmployee) {
		this.buttonMoveAnEmployee = buttonMoveAnEmployee;
	}

	public JButton getButtonListOfEmployees() {
		return buttonListOfEmployees;
	}

	public void setButtonListOfEmployees(JButton buttonListOfEmployees) {
		this.buttonListOfEmployees = buttonListOfEmployees;
	}

	public JButton getButtonListOfDismissedEmployees() {
		return buttonListOfDismissedEmployees;
	}

	public void setButtonListOfDismissedEmployees(JButton buttonListOfDismissedEmployees) {
		this.buttonListOfDismissedEmployees = buttonListOfDismissedEmployees;
	}

	public JButton getButtonBlackList() {
		return buttonBlackList;
	}

	public void setButtonBlackList(JButton buttonBlackList) {
		this.buttonBlackList = buttonBlackList;
	}

	public JButton getButtonObjects() {
		return buttonObjects;
	}

	public void setButtonObjects(JButton buttonObjects) {
		this.buttonObjects = buttonObjects;
	}

	public JButton getButtonEditProfile() {
		return buttonEditProfile;
	}

	public void setButtonEditProfile(JButton buttonEditProfile) {
		this.buttonEditProfile = buttonEditProfile;
	}

	public JLabel getLabelInformationAboutEmployee() {
		return labelInformationAboutEmployee;
	}

	public void setLabelInformationAboutEmployee(JLabel labelInformationAboutEmployee) {
		this.labelInformationAboutEmployee = labelInformationAboutEmployee;
	}

	public JLabel getLabelFullNameEmployee() {
		return labelFullNameEmployee;
	}

	public void setLabelFullNameEmployee(JLabel labelFullNameEmployee) {
		this.labelFullNameEmployee = labelFullNameEmployee;
	}

	public JLabel getLabelPosition() {
		return labelPosition;
	}

	public void setLabelPosition(JLabel labelPosition) {
		this.labelPosition = labelPosition;
	}

	public JLabel getLabelInformationAboutCompany() {
		return labelInformationAboutCompany;
	}

	public void setLabelInformationAboutCompany(JLabel labelInformationAboutCompany) {
		this.labelInformationAboutCompany = labelInformationAboutCompany;
	}

	public JPanel getPanelRightMiddle() {
		return panelRightMiddle;
	}

	public void setPanelRightMiddle(JPanel panelRightMiddle) {
		this.panelRightMiddle = panelRightMiddle;
	}
	
}
