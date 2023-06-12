import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userloginBtn = new JLabel("");
		userloginBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String phonenumber = number.getText();
				
				if (phonenumber.startsWith("09") && (phonenumber.length() == 11)) {
					JOptionPane.showMessageDialog(null, "Login Successful!");
					UserPage userPage = new UserPage();
					userPage.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter a valid 11-digit number starting with '09'.");
				}
				
				
			}
		});
		userloginBtn.setBounds(454, 398, 120, 41);
		contentPane.add(userloginBtn);
		
		name = new JTextField();
		name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		name.setBackground(null);
		name.setBorder(null);
		name.setOpaque(false);
		name.setBounds(321, 214, 446, 32);
		contentPane.add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		address.setBackground(null);
		address.setBorder(null);
		address.setOpaque(false);
		address.setBounds(321, 271, 446, 32);
		contentPane.add(address);
		address.setColumns(10);
		
		number = new JTextField();
		number.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		number.setBackground(null);
		number.setBorder(null);
		number.setOpaque(false);
		number.setBounds(321, 327, 446, 32);
		contentPane.add(number);
		number.setColumns(10);
		
		JLabel userloginPic = new JLabel("");
		userloginPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\UserLogin.png"));
		userloginPic.setBounds(0, 0, 984, 561);
		contentPane.add(userloginPic);
	}

}
