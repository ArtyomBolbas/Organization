package model.hierarchy.of.employees;

public abstract class Managing extends Administration{

	// ----------------------------------------------
	// поля, свойства необходимые Managing
	// ----------------------------------------------
	private Principal principal;
	
	private ChiefEnginner chiefEnginner;
	
	private Engineer enginner;

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public ChiefEnginner getChiefEnginner() {
		return chiefEnginner;
	}

	public void setChiefEnginner(ChiefEnginner chiefEnginner) {
		this.chiefEnginner = chiefEnginner;
	}

	public Engineer getEnginner() {
		return enginner;
	}

	public void setEnginner(Engineer enginner) {
		this.enginner = enginner;
	}
	
}
