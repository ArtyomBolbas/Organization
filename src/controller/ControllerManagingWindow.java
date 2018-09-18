package controller;

import java.util.List;

import org.apache.log4j.Logger;

import model.company.Company;
import model.hierarchy.of.employees.Administration;
import model.hierarchy.of.employees.Employee;
import model.hierarchy.of.employees.Principal;
import view.AdministrativeInput;
import view.ManagingWindow;

public class ControllerManagingWindow {
	// ----------------------------------------------
	// поля, свойства необходимые ControllerManagingWindow     
	// ----------------------------------------------
	private final static Logger LOG = Logger.getLogger(ControllerManagingWindow.class);
	
	
	/**
	 * Контроллер хранит внешнее представление для изменения (ManagingWindow)
	 */
	private ManagingWindow managingWindow;
	
	// ----------------------------------------------
	// конструктор ControllerManagingWindow
	// ----------------------------------------------
	public ControllerManagingWindow(ManagingWindow managingWindow) {
		LOG.debug("запущен конструктор в ControllerManagingWindow");
		this.managingWindow = managingWindow;
	}

	// ----------------------------------------------
	// Метод добавляет информицию о компании и даректоре
	// ----------------------------------------------
	public void initControllerManagingWindow(Employee employee) {
		managingWindow.getLabelNameCompany().setText(Company.myCompany.getNameCompany());
		List<Employee> workingStaff = Company.myCompany.getWorkingStaff();
		for (Employee employee1: workingStaff) {
			if (employee1 instanceof Principal) {
				managingWindow.getLabelNamePrincipal().setText(Principal.PRINCIPAL.fullName(employee1));
			}
		}
		
		managingWindow.getLabelFullNameEmployee().setText(employee.fullName(employee));
		managingWindow.getLabelPosition().setText(employee.getPosition());
		
		
		//managingWindow.getLabelNamePrincipal().setText(Company.myCompany.getWorkingStaff());
		
		
		
	}
	
	
	
	
	
}
