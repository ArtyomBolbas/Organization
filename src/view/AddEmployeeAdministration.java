package view;


import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import main.Runner;

public class AddEmployeeAdministration extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4185498232497993145L;
	
	// ----------------------------------------------
	// поля, свойства необходимые AddPrincipal
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 600;
	
	private static final String WINDOW_TITLE = "Adding an employee";
	private static final String FIRST_NAME = "Имя";
	private static final String SURNAME = "Фамилия";
	private static final String PATRONYMIC = "Отчество";
	private static final String POSITION = "Должность";
	private static final String DATE_OF_EMPLOYMENT = "Дата трудоустройства";
	private static final String LOGIN = "Логин"; 
	private static final String PASSWORD = "Пароль";
	private static final String PASSWORD_VERIFICATION = "Повторить пароль";
	private static final String FURTHER = "Далее";
	
	//private static final String STRING_PRINCIPAL = "Директор";
	
	//private JPanel mainMenuPanel;
	
	private Font fontLabelMain;
	private Font fontLabel;

	private JLabel labelFirstName;
	private JLabel labelSurName;
	private JLabel labelPatronymic;
	private JLabel labelPosition;
	private JLabel labelDateOfEmployment;
	private JLabel labelLogin;
	private JLabel labelPassword;
	private JLabel labelPasswordVerification;
	
	private JTextField textFieldFirstName;
	private JTextField textFieldSurName;
	private JTextField textFieldPatronymic;
	private JTextField textFieldPosition;
	private JTextField textFieldDateOfEmployment;
	private JTextField textFieldLogin;
	private JPasswordField textFieldPassword;
	private JPasswordField textFieldPasswordVerification;
	
	
	private JButton buttonNext;
	
	// ----------------------------------------------
	// конструктор AddPrincipal
	// ----------------------------------------------
	public AddEmployeeAdministration() {
		LOG.debug("запущен конструктор в AddPrincipal");
		initAddEmployeeAdministration();
	}

	// ----------------------------------------------
	// метод "настроек" внешнего вида
	// ----------------------------------------------
	private void initAddEmployeeAdministration() {
		LOG.debug("запущен метод - initAddEmployeeAdministration(); (метод \"настроек\" внешнего вида), в классе -  AddEmployeeAdministration");
		add(initPanelinitAddEmployeeAdministration());
		
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
	private JPanel initPanelinitAddEmployeeAdministration() {
		LOG.debug("запущен метод - initPanelinitAddEmployeeAdministration(); (метод в котором добавляются и компануются эл-ты), в классе -  AddEmployeeAdministration");

		JPanel mainMenuPanel = new JPanel();
		mainMenuPanel.setLayout(new GridBagLayout());
		
		fontLabelMain = new Font("Verbana", Font.ITALIC, 20);
		fontLabel = new Font("Verbana", Font.ITALIC, 16);
		
		labelFirstName = new JLabel(FIRST_NAME);
		labelFirstName.setFont(fontLabelMain);
		labelSurName = new JLabel(SURNAME);
		labelSurName.setFont(fontLabelMain); 
		labelPatronymic = new JLabel(PATRONYMIC);
		labelPatronymic.setFont(fontLabelMain); 
		labelPosition = new JLabel(POSITION);
		labelPosition.setFont(fontLabelMain); 
		labelDateOfEmployment = new JLabel(DATE_OF_EMPLOYMENT);
		labelDateOfEmployment.setFont(fontLabelMain); 
		labelLogin = new JLabel(LOGIN);
		labelLogin.setFont(fontLabelMain); 
		labelPassword = new JLabel(PASSWORD);
		labelPassword.setFont(fontLabelMain);
		labelPasswordVerification = new JLabel(PASSWORD_VERIFICATION);
		labelPasswordVerification.setFont(fontLabelMain);
		
		textFieldFirstName = new JTextField(30);
		textFieldFirstName.setFont(fontLabel);
		textFieldSurName = new JTextField(30);
		textFieldSurName.setFont(fontLabel);
		textFieldPatronymic = new JTextField(30);
		textFieldPatronymic.setFont(fontLabel);
		textFieldPosition = new JTextField(30);
		textFieldPosition.setFont(fontLabel);
		//textFieldPosition.setEditable(false);
		textFieldDateOfEmployment = new JTextField(30);
		textFieldDateOfEmployment.setFont(fontLabel);
		textFieldLogin = new JTextField(30);
		textFieldLogin.setFont(fontLabel);
		textFieldPassword = new JPasswordField(30);
		textFieldPassword.setFont(fontLabel);
		textFieldPasswordVerification = new JPasswordField(30);
		textFieldPasswordVerification.setFont(fontLabel);
		
		buttonNext = new JButton(FURTHER);
		
		
		mainMenuPanel.add(labelFirstName, new GridBagConstraints(0, 0, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldFirstName, new GridBagConstraints(1, 0, 2, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelSurName, new GridBagConstraints(0, 1, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldSurName, new GridBagConstraints(1, 1, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelPatronymic, new GridBagConstraints(0, 2, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldPatronymic, new GridBagConstraints(1, 2, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelPosition, new GridBagConstraints(0, 3, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldPosition, new GridBagConstraints(1, 3, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelDateOfEmployment, new GridBagConstraints(0, 4, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldDateOfEmployment, new GridBagConstraints(1, 4, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelLogin, new GridBagConstraints(0, 5, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldLogin, new GridBagConstraints(1, 5, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelPassword, new GridBagConstraints(0, 6, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldPassword, new GridBagConstraints(1, 6, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(labelPasswordVerification, new GridBagConstraints(0, 7, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(textFieldPasswordVerification, new GridBagConstraints(1, 7, 2, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		mainMenuPanel.add(buttonNext, new GridBagConstraints(1, 8, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(1, 1, 1, 1), 0, 0));
		
		return mainMenuPanel;
	}

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}

	public void setTextFieldFirstName(JTextField textFieldFirstName) {
		this.textFieldFirstName = textFieldFirstName;
	}

	public JTextField getTextFieldSurName() {
		return textFieldSurName;
	}

	public void setTextFieldSurName(JTextField textFieldSurName) {
		this.textFieldSurName = textFieldSurName;
	}

	public JTextField getTextFieldPatronymic() {
		return textFieldPatronymic;
	}

	public void setTextFieldPatronymic(JTextField textFieldPatronymic) {
		this.textFieldPatronymic = textFieldPatronymic;
	}

	public JTextField getTextFieldPosition() {
		return textFieldPosition;
	}

	public void setTextFieldPosition(JTextField textFieldPosition) {
		this.textFieldPosition = textFieldPosition;
	}

	public JTextField getTextFieldDateOfEmployment() {
		return textFieldDateOfEmployment;
	}

	public void setTextFieldDateOfEmployment(JTextField textFieldDateOfEmployment) {
		this.textFieldDateOfEmployment = textFieldDateOfEmployment;
	}

	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}

	public void setTextFieldLogin(JTextField textFieldLogin) {
		this.textFieldLogin = textFieldLogin;
	}

	public JPasswordField getTextFieldPassword() {
		return textFieldPassword;
	}

	public void setTextFieldPassword(JPasswordField textFieldPassword) {
		this.textFieldPassword = textFieldPassword;
	}

	public JPasswordField getTextFieldPasswordVerification() {
		return textFieldPasswordVerification;
	}

	public void setTextFieldPasswordVerification(JPasswordField textFieldPasswordVerification) {
		this.textFieldPasswordVerification = textFieldPasswordVerification;
	}

	public JButton getButtonNext() {
		return buttonNext;
	}

	public void setButtonNext(JButton buttonNext) {
		this.buttonNext = buttonNext;
	}
	
	// ----------------------------------------------
	// переопределение hashCode и equals
	// ----------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((textFieldDateOfEmployment == null) ? 0 : textFieldDateOfEmployment.hashCode());
		result = prime * result + ((textFieldFirstName == null) ? 0 : textFieldFirstName.hashCode());
		result = prime * result + ((textFieldLogin == null) ? 0 : textFieldLogin.hashCode());
		result = prime * result + ((textFieldPassword == null) ? 0 : textFieldPassword.hashCode());
		result = prime * result
				+ ((textFieldPasswordVerification == null) ? 0 : textFieldPasswordVerification.hashCode());
		result = prime * result + ((textFieldPatronymic == null) ? 0 : textFieldPatronymic.hashCode());
		result = prime * result + ((textFieldPosition == null) ? 0 : textFieldPosition.hashCode());
		result = prime * result + ((textFieldSurName == null) ? 0 : textFieldSurName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddEmployeeAdministration other = (AddEmployeeAdministration) obj;
		if (textFieldDateOfEmployment == null) {
			if (other.textFieldDateOfEmployment != null)
				return false;
		} else if (!textFieldDateOfEmployment.equals(other.textFieldDateOfEmployment))
			return false;
		if (textFieldFirstName == null) {
			if (other.textFieldFirstName != null)
				return false;
		} else if (!textFieldFirstName.equals(other.textFieldFirstName))
			return false;
		if (textFieldLogin == null) {
			if (other.textFieldLogin != null)
				return false;
		} else if (!textFieldLogin.equals(other.textFieldLogin))
			return false;
		if (textFieldPassword == null) {
			if (other.textFieldPassword != null)
				return false;
		} else if (!textFieldPassword.equals(other.textFieldPassword))
			return false;
		if (textFieldPasswordVerification == null) {
			if (other.textFieldPasswordVerification != null)
				return false;
		} else if (!textFieldPasswordVerification.equals(other.textFieldPasswordVerification))
			return false;
		if (textFieldPatronymic == null) {
			if (other.textFieldPatronymic != null)
				return false;
		} else if (!textFieldPatronymic.equals(other.textFieldPatronymic))
			return false;
		if (textFieldPosition == null) {
			if (other.textFieldPosition != null)
				return false;
		} else if (!textFieldPosition.equals(other.textFieldPosition))
			return false;
		if (textFieldSurName == null) {
			if (other.textFieldSurName != null)
				return false;
		} else if (!textFieldSurName.equals(other.textFieldSurName))
			return false;
		return true;
	}
	
}
