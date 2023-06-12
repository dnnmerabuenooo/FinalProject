import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPage frame = new UserPage();
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
	public UserPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userpagePic = new JLabel("");
		userpagePic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\UserPage.png"));
		userpagePic.setBounds(0, 0, 984, 561);
		contentPane.add(userpagePic);
		
		JLabel vieweqBtn = new JLabel("");
		vieweqBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewEquipment viewEquipment = new ViewEquipment();
				viewEquipment.setVisible(true);
				dispose();
			}
		});
		vieweqBtn.setBounds(274, 280, 185, 52);
		contentPane.add(vieweqBtn);
		
		JLabel rentBtn = new JLabel("");
		rentBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Rent rent = new Rent();
				rent.setVisible(true);
				dispose();
			}
		});
		rentBtn.setBounds(536, 280, 191, 52);
		contentPane.add(rentBtn);
	}

}
