package model.company;

import java.util.ArrayList;

import model.hierarchy.of.employees.Working;

public class BuildingObject {
	// ----------------------------------------------
	// поля, свойства необходимые BuildingObject
	// ----------------------------------------------
	private String nameBuildingObject;
	private int numberBuildingObject;
	
	private ArrayList<Working> listWorking;

	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	public String getNameBuildingObject() {
		return nameBuildingObject;
	}

	public void setNameBuildingObject(String nameBuildingObject) {
		this.nameBuildingObject = nameBuildingObject;
	}

	public int getNumberBuildingObject() {
		return numberBuildingObject;
	}

	public void setNumberBuildingObject(int numberBuildingObject) {
		this.numberBuildingObject = numberBuildingObject;
	}

	public ArrayList<Working> getListWorking() {
		return listWorking;
	}

	public void setListWorking(ArrayList<Working> listWorking) {
		this.listWorking = listWorking;
	}
	
}
