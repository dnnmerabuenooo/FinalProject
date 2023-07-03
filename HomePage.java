
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HomePagePic = new JLabel("");
		HomePagePic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\homePage.png"));
		HomePagePic.setBounds(0, 0, 1000, 600);
		contentPane.add(HomePagePic);
		
		JButton adminBtn = new JButton("");
		adminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin adminLogin = new AdminLogin();
				adminLogin.setVisible(true);
				dispose();
			}
		});
		adminBtn.setBounds(57, 506, 132, 44);
		adminBtn.setOpaque(false);
		adminBtn.setContentAreaFilled(false);
		adminBtn.setBorderPainted(false);
		contentPane.add(adminBtn);
		
		JButton userBtn = new JButton("");
		userBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin userLogin = new UserLogin();
				userLogin.setVisible(true);
				dispose();
			}
		});
		userBtn.setBounds(292, 506, 132, 44);
		userBtn.setOpaque(false);
		userBtn.setContentAreaFilled(false);
		userBtn.setBorderPainted(false);
		contentPane.add(userBtn);
	}

}
