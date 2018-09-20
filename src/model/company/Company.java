package model.company;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import main.Runner;
import model.hierarchy.of.employees.Employee;

public class Company {
	// ----------------------------------------------
	// поля, свойства необходимые Company
	// ----------------------------------------------

	private final static Logger LOG = Logger.getLogger(Company.class);

	public static final Company myCompany = new Company();

	private static String nameCompany;

	private File fileWorkingStaff;
	private File fileBlackList;

	private static final String FILE_BLACK_LIST = "File black list";
	private static final String FILE_WORKING_STAFF_LIST = "File workingStaff list";

	private List<Employee> blackList;

	private List<Employee> workingStaff;

	private List<BuildingObject> listBuildingBojects;

	private List<Employee> suspendedStaff; // отстранненые сотрудники
	
	private boolean readingWriting;

	// ----------------------------------------------
	// конструктор Principal
	// ----------------------------------------------
	private Company() {
		LOG.debug("запущен конструктор в Company");
		start();
	}

	// ----------------------------------------------
	// метод отвечает за чтение объектов из файла при старте программы так же за
	// инициализацию файлов
	// ----------------------------------------------
	private void start() {
		LOG.debug("запущен метод - start(); (метод отвечает за чтение объектов из файла при старте программы так же за инициализацию файлов), в классе - Company");
		blackList = new LinkedList<Employee>();
		workingStaff = new ArrayList<Employee>();
		fileWorkingStaff = new File(FILE_WORKING_STAFF_LIST);
		fileBlackList = new File(FILE_BLACK_LIST);
		LOG.info("в методе start() > " + fileWorkingStaff.length());
		try (FileInputStream fileInputStreamForBlackList = new FileInputStream(FILE_BLACK_LIST);
				FileInputStream fileInputStreamForWorkingStaff = new FileInputStream(FILE_WORKING_STAFF_LIST)) {
			try (ObjectInputStream objectInputStreamForBlackList = new ObjectInputStream(fileInputStreamForBlackList);
					ObjectInputStream objectInputStreamForWorkingStaff = new ObjectInputStream(
							fileInputStreamForWorkingStaff)) {
				// ----------------------------------------------------------------------------------------
				// при условии, что файл не пуст, переписывает объекты из файла в СПИСОК
				// ----------------------------------------------------------------------------------------
				if (fileWorkingStaff.length() > 0) {
					try {
						workingStaff = (ArrayList<Employee>) objectInputStreamForWorkingStaff.readObject();
					} catch (ClassNotFoundException e) {
						LOG.error("IOException - (Файл еще не создан)", e);
					}
				}
				if (fileBlackList.length() > 0) {
					try {
						blackList = (LinkedList<Employee>) objectInputStreamForBlackList.readObject();
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
		// -------------------------------------------------------------------------------------------
		// если приложение запущенно в первый раз, то эта часть кода создает файл
		// так же часть кода отвечает за инициализацию потоков I/O
		// -------------------------------------------------------------------------------------------
	}

	public void addEmployeeWorkingStaff(Employee employee) {
		// if (fileWorkingStaff.length() == 0) {
		try (FileOutputStream fileOutputStreamForBlackList = new FileOutputStream(FILE_BLACK_LIST);
				FileOutputStream fileOutputStreamForWorkingStaff = new FileOutputStream(FILE_WORKING_STAFF_LIST)) {
			try (ObjectOutputStream objectOutputStreamForBlackList = new ObjectOutputStream(
					fileOutputStreamForBlackList);
					ObjectOutputStream objectOutputStreamForWorkingStaff = new ObjectOutputStream(
							fileOutputStreamForWorkingStaff)) {
				workingStaff.add(employee);
				objectOutputStreamForWorkingStaff.writeObject(workingStaff);
			}
		} catch (FileNotFoundException e) {
			LOG.error("FileNotFoundException - (инициализация: fileInputStream)", e);
		} catch (IOException e) {
			LOG.error("IOException - (Файл еще не создан)", e);
		}
		// }
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

	public static Company getMycompany() {
		return myCompany;
	}

	public List<Employee> getBlackList() {
		return blackList;
	}

	public void setBlackList(List<Employee> blackList) {
		this.blackList = blackList;
	}

	public List<Employee> getWorkingStaff() {
		return workingStaff;
	}

	public void setWorkingStaff(List<Employee> workingStaff) {
		this.workingStaff = workingStaff;
	}

	public List<BuildingObject> getListBuildingBojects() {
		return listBuildingBojects;
	}

	public void setListBuildingBojects(List<BuildingObject> listBuildingBojects) {
		this.listBuildingBojects = listBuildingBojects;
	}

	public List<Employee> getSuspendedStaff() {
		return suspendedStaff;
	}

	public void setSuspendedStaff(List<Employee> suspendedStaff) {
		this.suspendedStaff = suspendedStaff;
	}

	public File getFileWorkingStaff() {
		return fileWorkingStaff;
	}

	public void setFileWorkingStaff(File fileWorkingStaff) {
		this.fileWorkingStaff = fileWorkingStaff;
	}

	public File getFileBlackList() {
		return fileBlackList;
	}

	public void setFileBlackList(File fileBlackList) {
		this.fileBlackList = fileBlackList;
	}

}
