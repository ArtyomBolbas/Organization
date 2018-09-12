package model.hierarchy.of.employees;

import org.apache.log4j.Logger;

import main.Runner;
import model.company.AddObject;
import model.company.Arrange;
import model.company.LayOff;
import model.company.MoveWorkers;

public final class Principal extends Managing implements Arrange, LayOff, AddObject, MoveWorkers{
	
	// ----------------------------------------------
	// поля, свойства необходимые Principal
	// ----------------------------------------------
	
	public static final Principal PRINCIPAL = new Principal();
	
	
	private final static Logger LOG = Logger.getLogger(Runner.class);
	
	
	
	// ----------------------------------------------
	// конструктор Principal
	// ----------------------------------------------
	private Principal() {
		LOG.debug("запущен конструктор в Principal");
		
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
