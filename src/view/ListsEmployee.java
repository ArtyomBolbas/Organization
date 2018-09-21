package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.apache.log4j.Logger;

import main.Runner;
import model.company.Company;
import model.hierarchy.of.employees.Employee;


public class ListsEmployee extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1922562138592889630L;

	// ---------------------------------------------------------------
	// поля свойства необходимые WindowShouingTheChoiceTheUser
	// ---------------------------------------------------------------
	private final static Logger LOG = Logger.getLogger(ListsEmployee.class);

	//private List<Employee> workingStaff;
	
	private JList<Employee> listWorkingStaff;
	
	private JPanel panel;
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 600;
	
	private Font fontList;
	
	private JScrollPane myScrollPane;
	
	// ---------------------------------------------------------------
	// конструктор
	// ---------------------------------------------------------------
	public ListsEmployee() {
			//this.workingStaff = workingStaff;
			LOG.debug("запущен конструктор в ListsEmployee");

			initListEmloyee();
		}

	// ----------------------------------------------
		// метод "настроек" внешнего вида
		// ----------------------------------------------
	private void initListEmloyee() {
		LOG.debug("запущен метод - initListEmloyee(); (метод \"настроек\" внешнего вида), в классе -  ListsEmployee");
	
		add(panel());
	
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		setLocationRelativeTo(null);
		
		setVisible(false);
	}

	// ---------------------------------------------------------------
	// метод который, в случае необзодимсти служит для очищения и обновления информации
	// ---------------------------------------------------------------
	public JPanel panel() {
		LOG.debug("запущен метод - initListEmloyee(); (метод который, в случае необзодимсти служит для очищения и обновления информации), в классе -  ListsEmployee");
		panel = new JPanel();
		panel.add(initPanelListEmployee());
		return panel;
	}

	// ----------------------------------------------
	// метод в котором добавляются и компануются эл-ты
	// ----------------------------------------------
	public JPanel initPanelListEmployee() {
		LOG.debug("запущен метод - initListEmloyee(); (метод в котором добавляются и компануются эл-ты), в классе -  ListsEmployee");

		JPanel mainPanelListEmployee = new JPanel();
		mainPanelListEmployee.setLayout(new BorderLayout());
		
		fontList = new Font("Arial Black", Font.BOLD, 16);
		
		List<Employee> workingStaff = Company.getMycompany().getWorkingStaff();
		LOG.info("в методе initListEmloyee() > " + workingStaff.size());
		
		if (workingStaff instanceof Employee) {
			
			int sizeListWorkingStaff = workingStaff.size();
			
			Employee[] arraysEmployee = new Employee[sizeListWorkingStaff];
			
			listWorkingStaff = new JList<Employee>(workingStaff.toArray(arraysEmployee));
			listWorkingStaff.setFont(fontList);
			listWorkingStaff.setLayoutOrientation(JList.VERTICAL);
		}
		
		myScrollPane = new JScrollPane(listWorkingStaff);
		
		mainPanelListEmployee.add(myScrollPane, BorderLayout.CENTER);
		return mainPanelListEmployee;
	}
	
	
	
	
	}
	
	
	