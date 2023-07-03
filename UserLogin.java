
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField nameUser;
	private JTextField addressUser;
	private JTextField mobileNumber;
	private JButton loginBtn;

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
	
	private void UserPage(String name, String address, String phone) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Information.txt", true));
			writer.write( name + " , " + address + " , " + phone);
			writer.newLine();
			writer.close();
			
			JOptionPane.showMessageDialog(null, "Successfully Login");
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Invalid Credentials");
			ex.printStackTrace();
			
		}
	}
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameUser = new JTextField();
		nameUser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		nameUser.setBounds(322, 236, 439, 28);
		nameUser.setBackground(null);
		nameUser.setBorder(null);
		nameUser.setOpaque(false);
		contentPane.add(nameUser);
		nameUser.setColumns(10);
		
		addressUser = new JTextField();
		addressUser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		addressUser.setBounds(322, 291, 445, 34);
		addressUser.setBackground(null);
		addressUser.setBorder(null);
		addressUser.setOpaque(false);
		contentPane.add(addressUser);
		addressUser.setColumns(10);
		
		mobileNumber = new JTextField();
		mobileNumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mobileNumber.setBounds(322, 346, 445, 34);
		mobileNumber.setBackground(null);
		mobileNumber.setBorder(null);
		mobileNumber.setOpaque(false);
		contentPane.add(mobileNumber);
		mobileNumber.setColumns(10);
		
		JLabel userLoginPic = new JLabel("");
		userLoginPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\userLogin.png"));
		userLoginPic.setBounds(0, 0, 1000, 600);
		contentPane.add(userLoginPic);
		
		loginBtn = new JButton("");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameUser.getText();
				String addr = addressUser.getText();
				String phone = mobileNumber.getText();
				
				if (phone.startsWith("09") && phone.length() == 11) {
					UserPage(name, addr, phone);
					ViewEquipment viewEq = new ViewEquipment();
					viewEq.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Invalid phone number. Please enter a valid 11-digit number starting with '09'.");
				}
				
				
			}
		});
		loginBtn.setBounds(461, 417, 105, 41);
		loginBtn.setOpaque(false);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		contentPane.add(loginBtn);
	}

}
