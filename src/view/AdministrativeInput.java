package view;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
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

public class AdministrativeInput extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2948641507507758302L;
	// ----------------------------------------------
	// поля, свойства необходимые AdministrativeInput
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(AdministrativeInput.class);
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_BASIC_HEIGHT = 200;
	
	private static final String LOGIN_NAME_BUTTON = "login";
	private static final String CANCEL_NAME_BUTTON = "cancel";

	private static final String LOGIN_NAME_LABEL = "login";
	private static final String PASSWORD_NAME_LABEL = "password";

	//private static final String MESSAGE_DIALOG_TITLE = "Information";

	//private static final String WRONG_LOGIN_OR_PASSWORD = "Неверный логин или пароль";

	//private static final String MESSAGE_TEXT_AND_PASSWORD_FIELD = "";

	//private static final String LOGIN_FOR_LOGIN = "admin";
	//private static final String PASSWORD_FOR_PASSWORD = "password";
	
	private JButton buttonLogin;
	private JButton buttonCancel;

	private JLabel loginLabel;
	private JLabel passwordLabel;

	private JTextField loginTextField;
	private JPasswordField passwordField;
	
	// ----------------------------------------------
	// конструктор AdministrativeInput
	// ----------------------------------------------
	public AdministrativeInput() {
		LOG.debug("запущен конструктор в AdministrativeInput");
		initAdministrativeInput();
	}
	
	// ----------------------------------------------
	// метод "настроек" внешнего вида
	// ----------------------------------------------
	private void initAdministrativeInput() {
		LOG.debug("запущен метод - initAdministrativeInput(); (метод \"настроек\" внешнего вида), в классе -  AdministrativeInput");
		add(initPanelAdministrativeInput());

		setSize(FRAME_WIDTH, FRAME_BASIC_HEIGHT);
		
		setTitle("Authorization in the system");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		pack();
	}
	
	// ----------------------------------------------
	// метод в котором добавляются и компануются эл-ты
	// ----------------------------------------------
	private JPanel initPanelAdministrativeInput() {
		LOG.debug("запущен метод - initAdministrativeInput(); (метод в котором добавляются и компануются эл-ты), в классе -  AdministrativeInput");
		// Создаем "главную" панель на которой будут размещаться все остальные
		JPanel panelAdministrativeInput = new JPanel();
		panelAdministrativeInput.setLayout(new BorderLayout());
		//

		// Создаем панель на которой будут размещаться лейбы и области ввода информации
		JPanel panelLabelAndTextField = new JPanel();
		panelLabelAndTextField.setLayout(new GridBagLayout());
		//

		// Создаем панель на которой будут размещаться кнопки
		JPanel panelButton = new JPanel();
		panelButton.setLayout(new FlowLayout());
		//

		// Эл-ты присутствующие в окне главного меню
		buttonLogin = new JButton(LOGIN_NAME_BUTTON);
		buttonCancel = new JButton(CANCEL_NAME_BUTTON);

		loginLabel = new JLabel(LOGIN_NAME_LABEL);
		passwordLabel = new JLabel(PASSWORD_NAME_LABEL);

		loginTextField = new JTextField(15);
		passwordField = new JPasswordField(15);
		//

		// Добавляем панель на главную панель
		panelAdministrativeInput.add(panelLabelAndTextField, BorderLayout.NORTH);
		panelAdministrativeInput.add(panelButton, BorderLayout.SOUTH);
		//

		// Эл-ты панели на которой будут размещаться лейбы и области ввода информации
		panelLabelAndTextField.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

		panelLabelAndTextField.add(loginTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

		panelLabelAndTextField.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));

		panelLabelAndTextField.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
		//

		// Эл-ты панели на которой будут размещаться кнопки
		panelButton.add(buttonLogin);
		panelButton.add(buttonCancel);
		//

		return panelAdministrativeInput;
	}


	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public JButton getButtonLogin() {
		return buttonLogin;
	}

	public void setButtonLogin(JButton buttonLogin) {
		this.buttonLogin = buttonLogin;
	}

	public JButton getButtonCancel() {
		return buttonCancel;
	}

	public void setButtonCancel(JButton buttonCancel) {
		this.buttonCancel = buttonCancel;
	}

	public JTextField getLoginTextField() {
		return loginTextField;
	}

	public void setLoginTextField(JTextField loginTextField) {
		this.loginTextField = loginTextField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
}
