import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewEquipment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEquipment frame = new ViewEquipment();
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
	public ViewEquipment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel vieweqPic = new JLabel("");
		vieweqPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\ViewEquipment.png"));
		vieweqPic.setBounds(0, 0, 984, 561);
		contentPane.add(vieweqPic);
		
		JLabel userChoice = new JLabel("");
		userChoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserPage userPage = new UserPage();
				userPage.setVisible(true);
				dispose();
			}
		});
		userChoice.setBounds(833, 0, 89, 26);
		contentPane.add(userChoice);
		
		JLabel userExit = new JLabel("");
		userExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		userExit.setBounds(950, 0, 34, 26);
		contentPane.add(userExit);
	}
}
