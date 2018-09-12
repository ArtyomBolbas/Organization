package main;

import org.apache.log4j.Logger;

import controller.Controller;
import view.AdministrativeInput;

public class Runner {

	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	
	
	public static void main(String[] args) {
		LOG.debug("запущен метод - main(String[] args); (Главный метод приложения), в классе -  Runner");
		
		
		
		
		// ---------------------------------
		// Создаем внешний вид
		// ---------------------------------
		AdministrativeInput administrativeInput = new AdministrativeInput();
		
		// ---------------------------------
		// Создаем контроллер 
		// ---------------------------------
		Controller controller = new Controller(administrativeInput); 
		controller.initControllerAdministrativeInput();
	}

	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public static Logger getLog() {
		return LOG;
	}
	
}
