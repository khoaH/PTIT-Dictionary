
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;

public class TuDienChinh {

	private JFrame frmTinTing;
	private JTextField textField;
	private JLabel lblGVo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TuDienChinh window = new TuDienChinh();
					window.frmTinTing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TuDienChinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTinTing = new JFrame();
		frmTinTing.setTitle("T\u1EEB \u0110i\u1EC3n Ti\u1EBFng Anh");
		frmTinTing.getContentPane().setBackground(new Color(153, 255, 153));
		frmTinTing.setBounds(100, 100, 1200, 675);
		frmTinTing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTinTing.setResizable(false);
		frmTinTing.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(38, 50, 201, 20);
		frmTinTing.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTm = new JLabel("T\u00ECm");
		lblTm.setBounds(10, 50, 36, 20);
		lblTm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmTinTing.getContentPane().add(lblTm);
		
		JButton button = new JButton("");
		button.setBounds(249, 50, 32, 32);
		button.setIcon(new ImageIcon(TuDienChinh.class.getResource("/TuDienChinh/Resouces/Zoom-icon (1).png")));
		frmTinTing.getContentPane().add(button);
		
		lblGVo = new JLabel("G\u00F5 v\u00E0o \u00F4 tr\u00EAn r\u1ED3i nh\u1EA5n Enter");
		lblGVo.setBounds(38, 69, 201, 14);
		frmTinTing.getContentPane().add(lblGVo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 128, 201, 507);
		frmTinTing.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setViewportView(list);
		list.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(291, 127, 893, 508);
		frmTinTing.getContentPane().add(scrollPane_1);
		
		JTextArea txtrdadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa = new JTextArea();
		txtrdadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa.setText("\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\r\n\r\n\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa\u00E1dadsadsadadsasdas\u00E1dadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsadasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa");
		scrollPane_1.setViewportView(txtrdadsadsadadsasdasdasdasdasdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdadsadadadsadadsadadadadsadsadsadsa);
		
		JLabel lblDanhSchT = new JLabel("Danh s\u00E1ch t\u1EEB");
		lblDanhSchT.setBounds(38, 105, 201, 14);
		lblDanhSchT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmTinTing.getContentPane().add(lblDanhSchT);
	}
}
