package _191209_swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ZipSearchEx04_ComboBox extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
					ZipSearchEx04_ComboBox frame = new ZipSearchEx04_ComboBox();
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
	public ZipSearchEx04_ComboBox()
	{
		this.setTitle(this.getClass().getName());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(12, 10, 599, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(93, 20, 385, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("찾기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
//				ZipSearchDAO dao = new ZipSearchDAO();				
//				
//				Vector<String> vl = new Vector<String>(dao.searchZips(textField.getText()));
//				
//				DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(vl);
//				
//				comboBox.setModel(model);
				
				String strDong = textField.getText();
				
				comboBox.setModel(new ZipSearchComboBoxModel(strDong));				
				
			}
		});
		btnNewButton.setBounds(490, 19, 97, 23);
		panel.add(btnNewButton);
		
		JLabel label = new JLabel("동 이름 입력 :");
		label.setBounds(14, 23, 82, 15);
		panel.add(label);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(12, 69, 599, 23);
		contentPane.add(comboBox);
	}
}
