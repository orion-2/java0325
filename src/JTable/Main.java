package JTable;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {
	
	JTabbedPane tabPane = new JTabbedPane(); //세개의 패널의 연결
	
	DefaultTableModel tableModel = new DefaultTableModel(); //데이터의 입출력?
	JTable table = new JTable(tableModel);
	JScrollPane tableScroll = new JScrollPane(table);
	JPanel tab_1 = new JPanel();
	JPanel tab_1_inputP = new JPanel();
	JPanel tab_2 = new JPanel();
	
	JTextField[] indata = new JTextField[4];
	JPopupMenu popup;
	JMenuItem m_del, m_mod;
	int modIntRow = -1;
	String fileName = "data.txt";
	
	Main() {
		Dimension size = new Dimension(600,400); //사이즈
		menuLayout();
		tableSetting();
		creatInputP();
		creatTabbedP();
		
		init();
	}
	
	
	private void init() {
		// TODO Auto-generated method stub
		
	}


	private void creatTabbedP() {
		// TODO Auto-generated method stub
		
	}


	private void creatInputP() {
		// TODO Auto-generated method stub
		
	}


	private void tableSetting() {
		// TODO Auto-generated method stub
		
	}


	private void menuLayout() {
		// TODO Auto-generated method stub
		popup = new JPopupMenu();
		m_mod = new JMenuItem("수정");
		m_mod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modIntRow = table.getSelectedRow();
				for (int i = 0; i < indata.length; i++) {
					indata[i].setText((String) table.getValueAt(modIntRow, i));
				}
			}
			
		});
		m_del = new JMenuItem("삭제");
		m_del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (table.getSelectedRow()==-1) {
					return;
				}else {
					delTableRow(table.getSelectedRow());
				}
				
			}

			
		});
		popup.add(m_mod);
		popup.add(m_del);
	}
	
	public void delTableRow(int row) {
		tableModel.removeRow(row);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
