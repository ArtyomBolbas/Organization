package controller;

import org.apache.log4j.Logger;

import main.Runner;
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
	
	
	// ----------------------------------------------
	// конструктор Controller
	// ----------------------------------------------
	public Controller(AdministrativeInput administrativeInput) {
		LOG.debug("запущен конструктор в Controller");
		this.administrativeInput = administrativeInput;
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
