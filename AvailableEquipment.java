import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AvailableEquipment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvailableEquipment frame = new AvailableEquipment();
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
	public AvailableEquipment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel availableeqPic = new JLabel("");
		availableeqPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\AvailableEquipment.png"));
		availableeqPic.setBounds(0, 0, 984, 561);
		contentPane.add(availableeqPic);
		
		JLabel adminChoice = new JLabel("");
		adminChoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminPage adminPage = new AdminPage();
				adminPage.setVisible(true);
				dispose();
			}
		});
		adminChoice.setBounds(834, 0, 92, 29);
		contentPane.add(adminChoice);
		
		JLabel logout = new JLabel("");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		logout.setBounds(949, 0, 35, 23);
		contentPane.add(logout);
	}

}

