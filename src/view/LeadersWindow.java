package view;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import main.Runner;

public class LeadersWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2417538062604731403L;

	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 600;
	
	private static final String WINDOW_TITLE = "Leaders";
	
	private static final String REPORT = "Вести табель";
	private static final String COEFFICIENT = "Выставлять коэффициент";
	private static final String REMOVE = "Отстранить от работы";
	private static final String LIST_OF_EMPLOYEE = "Список сотрудников";
	private static final String LIST_OF_DISMISSED_EMPLOYEES = "Список отстранненых сотрудников";
	private static final String BLACK_LIST = "Черный список";
	private static final String OBJECTS = "Список объектов";
	
	private static final String EDIT_PROFILE = "Редактировать профиль";
	
	
	
	// ----------------------------------------------
	// конструктор LeadersWindow
	// ----------------------------------------------
	public LeadersWindow() {
		LOG.debug("запущен конструктор в LeadersWindow");
		initLeadersWindow();
	}

	// ----------------------------------------------
	// метод "настроек" внешнего вида
	// ----------------------------------------------
	private void initLeadersWindow() {
		LOG.debug("запущен метод - initLeadersWindow(); (метод \"настроек\" внешнего вида), в классе -  LeadersWindow");
		
		add(initPanelLeadersWindow());
		
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
	private JPanel initPanelLeadersWindow() {
		LOG.debug("запущен метод - initPanelLeadersWindow(); (метод в котором добавляются и компануются эл-ты), в классе -  LeadersWindow");
		return null;
	}
	
}
