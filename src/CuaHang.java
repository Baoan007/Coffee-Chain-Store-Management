import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CuaHang extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuaHang frame = new CuaHang();
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
	public CuaHang() {
		setFont(new Font("Dialog", Font.BOLD, 25));
		setTitle("C\u1EECA H\u00C0NG ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnThucUong = new JButton("Qu\u1EA3n l\u00FD th\u1EE9c u\u1ED1ng");
		btnThucUong.setIcon(null);
		btnThucUong.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnThucUong.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnThucUong.setBackground(SystemColor.textHighlight);
		btnThucUong.setForeground(SystemColor.inactiveCaptionBorder);
		btnThucUong.setBounds(28, 82, 161, 75);
		contentPane.add(btnThucUong);

		JLabel lblNewLabel = new JLabel("C\u1EEDa h\u00E0ng cafe");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(183, 11, 170, 46);
		contentPane.add(lblNewLabel);

		JButton btnQuanLyns = new JButton("Qu\u1EA3n l\u00FD nh\u00E2n s\u1EF1");
		btnQuanLyns.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnQuanLyns.setForeground(Color.WHITE);
		btnQuanLyns.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnQuanLyns.setBackground(SystemColor.textHighlight);
		btnQuanLyns.setBounds(199, 82, 149, 75);
		contentPane.add(btnQuanLyns);

		JButton btnThongKe = new JButton("Th\u1ED1ng k\u00EA");
		btnThongKe.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnThongKe.setForeground(Color.WHITE);
		btnThongKe.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThongKe.setBackground(SystemColor.textHighlight);
		btnThongKe.setBounds(363, 82, 143, 75);
		contentPane.add(btnThongKe);

		JButton btnBanHang = new JButton("B\u00E1n h\u00E0ng");
		btnBanHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBanHang.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnBanHang.setForeground(Color.WHITE);
		btnBanHang.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBanHang.setBackground(SystemColor.textHighlight);
		btnBanHang.setBounds(28, 182, 161, 69);
		contentPane.add(btnBanHang);

		JButton btnDatBan = new JButton("\u0110\u1EB7t b\u00E0n");
		btnDatBan.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDatBan.setForeground(Color.WHITE);
		btnDatBan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDatBan.setBackground(SystemColor.textHighlight);
		btnDatBan.setBounds(199, 182, 149, 69);
		contentPane.add(btnDatBan);

		JButton btnThongTin = new JButton("Th\u00F4ng tin");
		btnThongTin.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnThongTin.setForeground(Color.WHITE);
		btnThongTin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThongTin.setBackground(SystemColor.textHighlight);
		btnThongTin.setBounds(363, 182, 143, 69);
		contentPane.add(btnThongTin);

		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
			}
		});
		btnThoat.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnThoat.setForeground(Color.BLUE);
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnThoat.setBackground(new Color(245, 245, 245));
		btnThoat.setBounds(312, 302, 84, 32);
		contentPane.add(btnThoat);

		JButton btnDangXuat = new JButton("\u0110\u0103ng xu\u1EA5t");
		btnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDangXuat.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnDangXuat.setForeground(Color.BLUE);
		btnDangXuat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDangXuat.setBackground(new Color(245, 245, 245));
		btnDangXuat.setBounds(411, 302, 95, 32);
		contentPane.add(btnDangXuat);
		label.setBounds(0, -30, 145, 41);
		contentPane.add(label);
	}
}
