import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		HomePagePic.setBounds(0, 0, 984, 561);
		HomePagePic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\HomePage.png"));
		contentPane.add(HomePagePic);
		
		JLabel adminBtn = new JLabel("");
		adminBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin adminLogin = new AdminLogin();
				adminLogin.setVisible(true);
				dispose();
			}
		});
		adminBtn.setBounds(57, 483, 137, 43);
		contentPane.add(adminBtn);
		
		JLabel userBtn = new JLabel("");
		userBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserLogin userLogin = new UserLogin();
				userLogin.setVisible(true);
				dispose();
			}
		});
		userBtn.setBounds(291, 483, 137, 43);
		contentPane.add(userBtn);
	}
}
