package _191205_swing;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MyJuminCheckGUI extends JFrame
{

	private JPanel contentPane;
	private JTextField tfJumin1;
	private JTextField tfJumin2;
	private JLabel lbl2;
	private JButton btn1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
					MyJuminCheckGUI frame = new MyJuminCheckGUI();
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
	public MyJuminCheckGUI()
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 154);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfJumin1 = new JTextField();
		tfJumin1.setBounds(12, 10, 203, 21);
		contentPane.add(tfJumin1);
		tfJumin1.setColumns(10);
		
		tfJumin2 = new JTextField();
		tfJumin2.setColumns(10);
		tfJumin2.setBounds(227, 10, 203, 21);
		contentPane.add(tfJumin2);
		
		JLabel lbl1 = new JLabel("출력결과 :");
		lbl1.setVerticalAlignment(SwingConstants.TOP);
		lbl1.setBounds(12, 49, 61, 38);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setVerticalAlignment(SwingConstants.TOP);
		lbl2.setBounds(75, 49, 473, 38);
		contentPane.add(lbl2);
		
		btn1 = new JButton("검사하기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String srtJu = tfJumin1.getText()+tfJumin2.getText();				
				
				lbl2.setText(JuminChecker.checkJumin(srtJu.toCharArray()));				
			}
		});
		
		btn1.setBounds(442, 9, 97, 23);
		contentPane.add(btn1);
	}

}
