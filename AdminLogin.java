import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField adminUsername;
	private JPasswordField adminPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel adminloginBtn = new JLabel("");
        
		adminloginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = adminUsername.getText();
				String password = String.valueOf(adminPassword.getPassword());
		        
				if(username.equals("Admin1") && password.equals("123"))
	             {
					JOptionPane.showMessageDialog(null, "Login Successful!");
					AdminPage adminPage = new AdminPage();
					adminPage.setVisible(true);
					dispose();
	             }
				else if(username.equals("") && password.equals("")) 
	             {
	                 JOptionPane.showMessageDialog( null, "Please enter your username and password.");
	             }
	             else if(!username.equals("Admin1") && password.equals("123")) 
	             {
	                 JOptionPane.showMessageDialog( null, "Incorrect username.");
	             }
	             else if(username.equals("Admin1") && !password.equals("123")) 
	             {
	                 JOptionPane.showMessageDialog( null, "Incorrect password.");
	             }
	             else
	             {
	                 JOptionPane.showMessageDialog( null, "Incorrect username and password.");
	             }};
			}
		);

		adminloginBtn.setBounds(456, 412, 118, 44);
		contentPane.add(adminloginBtn);
		
		adminUsername = new JTextField();
		adminUsername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		adminUsername.setBackground(null);
		adminUsername.setBorder(null);
		adminUsername.setOpaque(false);
		adminUsername.setBounds(310, 229, 507, 44);
		contentPane.add(adminUsername);
		adminUsername.setColumns(10);
		
		
		adminPassword = new JPasswordField();
		adminPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		adminPassword.setBackground(null);
		adminPassword.setBorder(null);
		adminPassword.setOpaque(false);
		adminPassword.setBounds(310, 315, 497, 44);
		contentPane.add(adminPassword);
		
		JLabel adminloginPic = new JLabel("");
		adminloginPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\AdminLogin.png"));
		adminloginPic.setBounds(0, 0, 984, 561);
		contentPane.add(adminloginPic);
	}
}

