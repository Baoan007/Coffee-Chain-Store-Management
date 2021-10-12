import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Point;
import java.awt.Toolkit;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldId;
	private JLabel lblMtKhu;
	private JPasswordField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BAO AN\\Downloads\\Hinh\\Unknown person.png"));
		setForeground(new Color(0, 0, 255));
		setLocationByPlatform(true);
		setLocation(new Point(400, 400));
		setBackground(new Color(230, 230, 250));
		setFont(new Font("Dialog", Font.BOLD, 31));
		setTitle("PH\u1EA6N M\u1EC0M QU\u1EA2N L\u00DD CAFE SHOP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnngNhp = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp:");
		lblTnngNhp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTnngNhp.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTnngNhp.setSize(new Dimension(1, 1));
		lblTnngNhp.setBounds(158, 98, 114, 23);
		contentPane.add(lblTnngNhp);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(282, 100, 137, 23);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		lblMtKhu = new JLabel("M\u1EADt kh\u1EA9u:");
		lblMtKhu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMtKhu.setBounds(158, 135, 82, 21);
		contentPane.add(lblMtKhu);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThoat.setBounds(319, 199, 88, 23);
		contentPane.add(btnThoat);
		
		JButton bntDangNhap = new JButton("\u0110\u0103ng nh\u1EADp");
		bntDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
			}
		});
		bntDangNhap.setBounds(188, 199, 101, 23);
		contentPane.add(bntDangNhap);
		
		JLabel lblNewLabel = new JLabel("Quy\u1EC1n truy c\u1EADp:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(158, 38, 114, 30);
		contentPane.add(lblNewLabel);
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setBounds(282, 135, 137, 24);
		contentPane.add(textFieldPassword);
		
		JComboBox boxQuyentruycap = new JComboBox();
		boxQuyentruycap.setModel(new DefaultComboBoxModel(new String[] {"Nh\u00E2n vi\u00EAn", "Qu\u1EA3n l\u00FD"}));
		boxQuyentruycap.setBounds(282, 43, 94, 24);
		contentPane.add(boxQuyentruycap);
	}
}
