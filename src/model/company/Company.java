package model.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;


import org.apache.log4j.Logger;

import main.Runner;
import model.hierarchy.of.employees.Employee;

public class Company {
	// ----------------------------------------------
	// поля, свойства необходимые Company
	// ----------------------------------------------
	
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	public static final Company myCompany = new Company();
	
	private static String nameCompany;
	
	private static final String FILE_BLACK_LIST = "File black list";
	private static final String FILE_WORKING_STAFF_LIST = "File workingStaff list";
	
	private int sizefileBlackList;
	private int sizefileWorkingStaff;
	
	private LinkedList<Employee> blackList;
	
	private ArrayList<Employee> workingStaff;
	
	private ArrayList <BuildingObject> listBuildingBojects;
	
	// ----------------------------------------------
	// конструктор Principal
	// ----------------------------------------------
	private Company() {
		LOG.debug("запущен конструктор в Company");
		start();
	}
	
	// ----------------------------------------------
	// метод отвечает за чтение объектов из файла при старте программы
	// ----------------------------------------------
	private void start() {
		LOG.debug("запущен метод - start(); (метод отвечает за чтение объектов из файла при старте программы), в классе - Company");	
		blackList = new LinkedList<>();
		workingStaff = new ArrayList<>();
		try (FileInputStream fileInputStreamForBlackList = new FileInputStream(FILE_BLACK_LIST);
				FileInputStream fileInputStreamForWorkingStaff = new FileInputStream(FILE_WORKING_STAFF_LIST)) {
			try (ObjectInputStream objectInputStreamForBlackList = new ObjectInputStream(fileInputStreamForBlackList);
					ObjectInputStream objectInputStreamForWorkingStaff = new ObjectInputStream(fileInputStreamForWorkingStaff)) {
				sizefileBlackList = fileInputStreamForBlackList.read();
				sizefileWorkingStaff = fileInputStreamForWorkingStaff.read();
				if (sizefileBlackList < 0) {
					try {
						blackList = (LinkedList<Employee>)objectInputStreamForBlackList.readObject();
					} catch (ClassNotFoundException e) {
						LOG.error("IOException - (Файл еще не создан)", e);
					}
				}
				if (sizefileWorkingStaff < 0) {
					try {
						workingStaff = (ArrayList<Employee>)objectInputStreamForWorkingStaff.readObject();
					} catch (ClassNotFoundException e) {
						LOG.error("IOException - (Файл еще не создан)", e);
					}
				}
			} catch (IOException e) {
				LOG.error("IOException - (Файл еще не создан)", e);
			}
			
		} catch (FileNotFoundException e) {
			LOG.error("FileNotFoundException - (инициализация: fileInputStream)", e);
		} catch (IOException e1) {
			LOG.error("IOException - (Файл еще не создан)", e1);
		}
		
		
	}
	

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------

	public static Logger getLog() {
		return LOG;
	}

	public static String getNameCompany() {
		return nameCompany;
	}

	public static void setNameCompany(String nameCompany) {
		Company.nameCompany = nameCompany;
	}

	public LinkedList<Employee> getBlackList() {
		return blackList;
	}

	public void setBlackList(LinkedList<Employee> blackList) {
		this.blackList = blackList;
	}

	public ArrayList<Employee> getWorkingStaff() {
		return workingStaff;
	}

	public void setWorkingStaff(ArrayList<Employee> workingStaff) {
		this.workingStaff = workingStaff;
	}

	public static Company getMycompany() {
		return myCompany;
	}

	public ArrayList<BuildingObject> getListBuildingBojects() {
		return listBuildingBojects;
	}

	public void setListBuildingBojects(ArrayList<BuildingObject> listBuildingBojects) {
		this.listBuildingBojects = listBuildingBojects;
	}

	public int getSizefileBlackList() {
		return sizefileBlackList;
	}

	public void setSizefileBlackList(int sizefileBlackList) {
		this.sizefileBlackList = sizefileBlackList;
	}

	public int getSizefileWorkingStaff() {
		return sizefileWorkingStaff;
	}

	public void setSizefileWorkingStaff(int sizefileWorkingStaff) {
		this.sizefileWorkingStaff = sizefileWorkingStaff;
	}
	
}
