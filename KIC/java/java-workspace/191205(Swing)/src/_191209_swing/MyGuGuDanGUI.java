package _191209_swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyGuGuDanGUI extends JFrame
{

	protected static final String DefaultTableModel = null;
	private JPanel contentPane;
	private JTable table;
	private JSpinner spinnerStart;
	private JSpinner spinnerEnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
					MyGuGuDanGUI frame = new MyGuGuDanGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyGuGuDanGUI()
	{

		setTitle(getClass().getName());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uB2E8\uC218 \uC785\uB825", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 10, 316, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("시작단");
		lblNewLabel.setBounds(12, 23, 57, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("끝단");
		lblNewLabel_1.setBounds(12, 48, 57, 15);
		panel.add(lblNewLabel_1);
		
		spinnerStart = new JSpinner();
		spinnerStart.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key Pressed");
			}
		});
		spinnerStart.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerStart.setBounds(73, 20, 104, 18);
		panel.add(spinnerStart);
		
		spinnerEnd = new JSpinner();
		spinnerEnd.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerEnd.setBounds(73, 45, 104, 18);
		panel.add(spinnerEnd);
		
		
		JButton btnNewButton = new JButton("구구단 출력");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				System.out.println("mousePressed");	
				changeValue();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				changeValue();
			}
//			@Override
//			public void mouseClicked(MouseEvent e) {
////				System.out.println("클릭");
//				changeValue();
//			}
		});
		btnNewButton.setBounds(191, 23, 104, 40);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 113, 592, 281);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"단", "x1", "x2", "x3", "x4", "x5", "x6", "x7", "x8", "x9"
			}
		));
		
		
		scrollPane.setViewportView(table);
	}
	


	public DefaultTableModel changeValue()
	{
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		int iStart = (Integer)spinnerStart.getValue();
		int iEnd = (Integer)spinnerEnd.getValue();
		
		
		model.setRowCount(0);		
		
		//같을때
		if(iStart == iEnd){
//			System.out.println("값차이가 없다");
			ArrayList<String> dan = new ArrayList<String>();
			dan.add(iStart + "단");
			for(int j = 1; j <= 9; ++j) {
				dan.add(String.valueOf(iStart * j));
			}
			model.addRow(dan.toArray());
		}
		else {

//			System.out.println("값차이가 있다");
			//더클때
			for(int i = iStart; i <= iEnd; ++i) {
				ArrayList<String> dan = new ArrayList<String>();
				dan.add(i + "단");
						
				for(int j = 1; j <= 9; ++j) {
					dan.add(String.valueOf(i * j));
				}
				model.addRow(dan.toArray());
			}
			
			//더작을때
			for(int i = iStart; i >= iEnd; --i) {
				ArrayList<String> dan = new ArrayList<String>();
				dan.add(i + "단");
						
				for(int j = 1; j <= 9; ++j) {
					dan.add(String.valueOf(i * j));
				}
				model.addRow(dan.toArray());
			}
		}
			
		table.setModel(model);

//		System.out.printf("%d %d \n", iStart, iEnd);
//		System.out.println("call reset " + model.getRowCount());
		return model;
	}
}
