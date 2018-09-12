package model.hierarchy.of.employees;

public class Working extends Employee {
	// ----------------------------------------------
	// поля, свойства необходимые Working
	// ----------------------------------------------
	private Integer id; // таб номер

	private String profession; // профессия

	private int numberPhone; // номер телефона
	
	// ----------------------------------------------
	// конструктор
	// ----------------------------------------------
	public Working(Integer id) {
		this.id = id;
	}
	
	

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}
	
}
