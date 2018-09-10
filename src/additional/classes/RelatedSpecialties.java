package additional.classes;

public class RelatedSpecialties { // смежные специальностей
	// ----------------------------------------------
	// поля, свойства необходимые RelatedSpecialties
	// ----------------------------------------------
	private String nameOfSpecialty;		//название специальности

	private String descriptionSpecialty; // описание специальностей

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public String getNameOfSpecialty() {
		return nameOfSpecialty;
	}

	public void setNameOfSpecialty(String nameOfSpecialty) {
		this.nameOfSpecialty = nameOfSpecialty;
	}

	public String getDescriptionSpecialty() {
		return descriptionSpecialty;
	}

	public void setDescriptionSpecialty(String descriptionSpecialty) {
		this.descriptionSpecialty = descriptionSpecialty;
	}

}
