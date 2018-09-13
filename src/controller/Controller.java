package controller;

import org.apache.log4j.Logger;

import main.Runner;
import model.company.Company;
import view.AddPrincipal;
import view.AdministrativeInput;

public class Controller {
	// ----------------------------------------------
	// поля, свойства необходимые Controller
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AdministrativeInput)
	 */
	private AdministrativeInput administrativeInput;
	
	/**
	 * Контроллер хранит внешнее представление для изменения (AddPrincipal)
	 */
	private AddPrincipal addPrincipal;
	
	// ----------------------------------------------
	// конструктор Controller
	// ----------------------------------------------
	public Controller(AdministrativeInput administrativeInput, AddPrincipal addPrincipal) {
		LOG.debug("запущен конструктор в Controller");
		this.administrativeInput = administrativeInput;
		this.addPrincipal = addPrincipal;
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
			addPrincipal.setVisible(true);
			initControllerAddPrincipal();
		}
	}
	
	
	// ----------------------------------------------
	// Метод отвечающий за команды кнопок в АДМИНИМСТРАТИВНОМ ОКОШКЕ
	// ----------------------------------------------
	public void initControllerAdministrativeInput() {
		LOG.debug("запущен метод - initControllerAdministrativeInput(); (Метод отвечающий за команды кнопок в АДМИНИМСТРАТИВНОМ ОКОШКЕ), в классе -  Controller");
		administrativeInput.getButtonLogin().addActionListener(clickEvent -> checkedLogin());
		administrativeInput.getButtonCancel().addActionListener(clickEvent -> checkCancel());
	}
	
	// ----------------------------------------------
	// Метод отвечающий за добавления данных про директора 
	// ----------------------------------------------
	public void initControllerAddPrincipal() {
		LOG.debug("запущен метод - initControllerAddPrincipal(); (Метод отвечающий за добавления данных про директора), в классе -  Controller");

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
	// сеттеры, геттеры
	// ----------------------------------------------
	
	
}
