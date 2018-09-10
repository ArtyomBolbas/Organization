package additional.classes;

import exception.DateOfBirthException;

public class DateOfBirth {
	// ----------------------------------------------
	// поля, свойства необходимые DateOfBirth
	// ----------------------------------------------
	private int day;
	private int month;
	private int year;
	
	// ----------------------------------------------
	// конструктор DateOfBirth
	// ----------------------------------------------
	public DateOfBirth() {
		
	}
	
	// ----------------------------------------------
	// конструктор DateOfBirth
	// ----------------------------------------------
	public DateOfBirth(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public int getDay() {
		return day;
	}
	public void setDay(int day) throws DateOfBirthException {
		this.day = day;
		
		if (day < 1 || day > 31) {
			throw new DateOfBirthException();
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) throws DateOfBirthException {
		this.month = month;
		
		if (month < 1 || month > 12) {
		 throw new DateOfBirthException();
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) throws DateOfBirthException {
		this.year = year;
		
		if (year < 1940 || year > 2018) {
			throw new DateOfBirthException();
		}
	}
	
}
