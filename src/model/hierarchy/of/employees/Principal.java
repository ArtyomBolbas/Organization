package model.hierarchy.of.employees;

import java.io.Serializable;

import org.apache.log4j.Logger;

import main.Runner;
import model.company.AddObject;
import model.company.Arrange;
import model.company.LayOff;
import model.company.MoveWorkers;

public final class Principal extends Managing implements Arrange, LayOff, AddObject, MoveWorkers, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6270888505637143374L;
	
	// ----------------------------------------------
	// поля, свойства необходимые Principal
	// ----------------------------------------------
	public static final Principal PRINCIPAL = new Principal();
	
	
	private final static Logger LOG = Logger.getLogger(Principal.class);
	
	// ----------------------------------------------
	// конструктор Principal
	// ----------------------------------------------
	private Principal() {
		//LOG.debug("запущен конструктор в Principal");
		
	}
	
	
	
	
	// ----------------------------------------------
	// реализации методов с подписанных интерфейосв
	// ----------------------------------------------
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arrange() {
		// TODO Auto-generated method stub
		
	}
	
	// ----------------------------------------------
	// сеттеры, геттеры
	// ----------------------------------------------
	
	public static Logger getLog() {
		return LOG;
	}
	
}
