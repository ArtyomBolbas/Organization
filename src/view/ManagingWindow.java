package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import main.Runner;
import model.hierarchy.of.employees.Principal;

public class ManagingWindow extends JFrame{

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
	
	private Font fontLabelMain;
	private Font fontLabel;
	
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
		LOG.debug("запущен метод - initManagingWindow(); (метод \"настроек\" внешнего вида), в классе -  ManagingWindow");
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
		LOG.debug("запущен метод - initPanelManagingWindow(); (метод в котором добавляются и компануются эл-ты), в классе -  ManagingWindow");
		//самая главная панель
		JPanel panelMainMenu = new JPanel();
		panelMainMenu.setLayout(new BorderLayout());
		panelMainMenu.setBackground(Color.LIGHT_GRAY);
		
		//верхняя панель
		JPanel panelTop = new JPanel();
		panelTop.setLayout(new BorderLayout());
		
		//средняя компоновочная панель
		JPanel panelMiddle = new JPanel();
		panelMiddle.setLayout(new BorderLayout());
		
		//левая средняя панель
		JPanel panelLeftMiddle = new JPanel();
		
		//правая средняя панель
		JPanel panelRightMiddle = new JPanel();
		
		//нижняя панель
		JPanel panelBottom = new JPanel();
		
		/*
		ИНИЦИАЛИЗАЦИЯ И РАЗМЕЩЕНИЕ КОМПОНЕНТОВ
		*/
		fontLabelMain = new Font("Verbana", Font.ITALIC, 20);
		fontLabel = new Font("Verbana", Font.ITALIC, 16);
		
		labelNameCompany = new JLabel();
		labelNamePrincipal = new JLabel();
		
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
		
		panelTop.add(labelNameCompany, BorderLayout.NORTH);
		panelTop.add(labelNamePrincipal, BorderLayout.CENTER);
	
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
		РАЗМЕЩЕНИЕМ ПАНЕЛЕЙ
		*/
		panelMiddle.add(panelLeftMiddle, BorderLayout.WEST);
		panelMiddle.add(panelRightMiddle, BorderLayout.EAST);
		
		panelMainMenu.add(panelTop, BorderLayout.NORTH);
		panelMainMenu.add(panelMiddle, BorderLayout.CENTER);
		panelMainMenu.add(panelBottom, BorderLayout.SOUTH);
		
		return panelMainMenu;
	}
	
	
	
	
	
	
}
