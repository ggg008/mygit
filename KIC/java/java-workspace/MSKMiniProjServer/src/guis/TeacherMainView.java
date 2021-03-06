package guis;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import content.MyClassTeacherContent;
import models.FileInfoModel;
import models.JoinStudentInfoModel;
import models.StudentInfoModel;
import javax.swing.table.DefaultTableModel;

public class TeacherMainView extends JFrame implements ActionListener
{
	private static TeacherMainView tm = null;
	
	private JPanel contentPane;
	private JTable studentsTable;
	private JPopupMenu popup;
	private JTable filesTable;
	private JTabbedPane tabbedPane;
	private JTable joinStudentTable;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try {
					TeacherMainView frame = new TeacherMainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static TeacherMainView getInstance()
	{
		if(tm == null)
			tm = new TeacherMainView();
	
		return tm;
	}

	/**
	 * Create the frame.
	 */
	private TeacherMainView()
	{
		System.out.println("서버시작완료");
		
		setTitle("마이클래스 슈퍼매니저");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		
		Toolkit tk = Toolkit.getDefaultToolkit(); // 구현된 Toolkit 객체 를 얻는다.
		Dimension screenSize = tk.getScreenSize(); // 화면의 크기를 구한다.
		setLocation(screenSize.width - (this.getWidth() + 100), screenSize.height/2 - this.getHeight()/2);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				refreshStuTable();
				refreshfileTable();
			}
		});
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setBounds(0, 20, 622, 422);
		contentPane.add(tabbedPane);
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 593, 373);
		panel.add(scrollPane);
		
		studentsTable = new JTable();
		studentsTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				 
				if (e.isPopupTrigger())
                {
                    JTable source = (JTable)e.getSource();
                    int row = source.rowAtPoint( e.getPoint() );
                    int column = source.columnAtPoint( e.getPoint() );

                    if (! source.isRowSelected(row))
                        source.changeSelection(row, column, false, false);

                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
			}
			@Override
			public void mouseClicked(MouseEvent e) {
//				if(e.getClickCount() == 2) {
//					System.out.println("doubleclick " + studentsTable.getSelectedRow());
//				}
					
			}
		});
		studentsTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "aaa", "\uB09C\uD14C\uC2A4", "1234561234567", "01012341234", "\uD14C\uC2A4\uD130\uB97C \uC704\uD574 \uB9CC\uB4E4\uC5B4\uC9C4 \uC544\uC774\uB514", "X", "2019-11-19", "\uC131\uB0A8\uC2DC", "/192.168.0.18"},
			},
			new String[] {
				"\uBC88\uD638", "\uC544\uC774\uB514", "\uC774\uB984", "\uC8FC\uBBFC\uB4F1\uB85D\uBC88\uD638", "\uC804\uD654\uBC88\uD638", "\uBE44\uACE0", "\uC811\uC18D\uC5EC\uBD80", "\uAC00\uC785\uC77C\uC790", "\uC9D1\uC8FC\uC18C", "ip"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		studentsTable.getColumnModel().getColumn(0).setResizable(false);
		studentsTable.getColumnModel().getColumn(0).setPreferredWidth(35);
		studentsTable.getColumnModel().getColumn(1).setResizable(false);
		studentsTable.getColumnModel().getColumn(1).setPreferredWidth(60);
		studentsTable.getColumnModel().getColumn(2).setResizable(false);
		studentsTable.getColumnModel().getColumn(2).setPreferredWidth(58);
		studentsTable.getColumnModel().getColumn(3).setResizable(false);
		studentsTable.getColumnModel().getColumn(3).setPreferredWidth(106);
		studentsTable.getColumnModel().getColumn(4).setResizable(false);
		studentsTable.getColumnModel().getColumn(4).setPreferredWidth(90);
		studentsTable.getColumnModel().getColumn(5).setResizable(false);
		studentsTable.getColumnModel().getColumn(5).setPreferredWidth(180);
		studentsTable.getColumnModel().getColumn(6).setResizable(false);
		studentsTable.getColumnModel().getColumn(6).setPreferredWidth(61);
		studentsTable.getColumnModel().getColumn(7).setResizable(false);
		studentsTable.getColumnModel().getColumn(8).setResizable(false);
		studentsTable.getColumnModel().getColumn(8).setPreferredWidth(175);
		studentsTable.getColumnModel().getColumn(9).setResizable(false);
		studentsTable.getColumnModel().getColumn(9).setPreferredWidth(85);
		scrollPane.setViewportView(studentsTable);
		studentsTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnUpload = new JButton("업로드");
		btnUpload.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser( "c:\\java" );
				
//				FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Source File", "java");
//				fileChooser.setFileFilter(filter);
				
				
				int flag = fileChooser.showOpenDialog(TeacherMainView.this);
				
				if( flag == JFileChooser.APPROVE_OPTION ) {
//					FileInfoDAO dao = new FileInfoDAO();
//					textArea.setText(dao.readFile(fileChooser.getSelectedFile()).toString());
					
					MyClassTeacherContent.uploadFileList(fileChooser.getSelectedFile());
				}
			}
		});
		btnUpload.setBounds(493, 10, 112, 39);
		panel_1.add(btnUpload);
		
		JButton btnDelete = new JButton("선택 목록 삭제");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				MyClassTeacherContent.deleteFileList(filesTable.getSelectedRow());
			}
		});
		btnDelete.setBounds(493, 59, 112, 39);
		panel_1.add(btnDelete);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 10, 470, 375);
		panel_1.add(scrollPane_1);
		
		filesTable = new JTable();
		filesTable.setModel(FileInfoModel.getInstance());
		scrollPane_1.setViewportView(filesTable);
		filesTable.getColumnModel().getColumn(0).setPreferredWidth(135);
		filesTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		filesTable.getColumnModel().getColumn(2).setPreferredWidth(58);
		filesTable.getColumnModel().getColumn(3).setPreferredWidth(56);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 10, 470, 375);
		panel_2.add(scrollPane_3);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane_3.setViewportView(textArea);
		
		JButton btnDoneText = new JButton("작성완료");
		btnDoneText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyClassTeacherContent.sendTeacherMsg();
				MyClassTeacherContent.saveTeacherMsg();
			}
		});
		btnDoneText.setBounds(493, 10, 112, 39);
		panel_2.add(btnDoneText);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 10, 470, 375);
		panel_3.add(scrollPane_2);
		
		joinStudentTable = new JTable();
		joinStudentTable.setModel(JoinStudentInfoModel.getInstance());
		scrollPane_2.setViewportView(joinStudentTable);
		joinStudentTable.getColumnModel().getColumn(0).setPreferredWidth(45);
		joinStudentTable.getColumnModel().getColumn(3).setPreferredWidth(105);
		
		JButton btnAcceptJoin = new JButton("가입허가");
		btnAcceptJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyClassTeacherContent.approveJoinStu(joinStudentTable.getSelectedRow());
			}
		});
		btnAcceptJoin.setBounds(493, 10, 112, 39);
		panel_3.add(btnAcceptJoin);
		
		JButton btnRejectJoin = new JButton("불가통보");
		btnRejectJoin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MyClassTeacherContent.unapproveJoinStu(joinStudentTable.getSelectedRow());
			}
		});
		btnRejectJoin.setBounds(494, 59, 112, 39);
		panel_3.add(btnRejectJoin);

		
        popup = new JPopupMenu();
        JMenuItem infoChangeMenu = new JMenuItem("수정");
        infoChangeMenu.addActionListener(event -> MyClassTeacherContent.showStuInfo(studentsTable.getSelectedRow()));        
        popup.add( infoChangeMenu );
        
        JMenuItem kickHimMenu = new JMenuItem("삭제");
        kickHimMenu.addActionListener(event -> MyClassTeacherContent.kickStudent(studentsTable.getSelectedRow()));        
        popup.add( kickHimMenu );
        
        
//        popup.add( new JMenuItem("Do Something2") );
//        popup.add( new JMenuItem("Do Something3") );
//        JMenuItem menuItem = new JMenuItem("ActionPerformed");
//        menuItem.addActionListener( this );
//        popup.add( menuItem );
        
		
		tabbedPane.setTitleAt(0, "학생목록");
		tabbedPane.setTitleAt(1, "파일관리");
		tabbedPane.setTitleAt(2, "전파메세지");
		tabbedPane.setTitleAt(3, "가입신청목록");
		
		studentsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		joinStudentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		filesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.refreshMsgView();
	}

    public String getTextAreaText()
	{
		return textArea.getText();
	}

	public void actionPerformed(ActionEvent e)//인터페이스에 의한 구현
    {
        Component c = (Component)e.getSource();
        JPopupMenu popup = (JPopupMenu)c.getParent();
        JTable table = (JTable)popup.getInvoker();
        System.out.println(table.getSelectedRow() + " : " + table.getSelectedColumn());
    }
    
    public void refreshStuTable()
	{
		JoinStudentInfoModel.getInstance().fireTableDataChanged();		
		StudentInfoModel.getInstance().fireTableDataChanged();	
	}
    
    public void refreshMsgView()
    {
    	textArea.setText(MyClassTeacherContent.loadTeacherMsg());
    }
    
    public void refreshfileTable()
	{    	
    	if(FileInfoModel.getInstance().resetModel()) {
    		MyClassTeacherContent.sendFileInfoList(FileInfoModel.getInstance().getDatas());
    	}	
		FileInfoModel.getInstance().fireTableDataChanged();	
	}
}
