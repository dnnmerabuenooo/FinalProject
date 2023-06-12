import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddEquipment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEquipment frame = new AddEquipment();
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
	public AddEquipment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel addeqPic = new JLabel("");
		addeqPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\AddEquipment.png"));
		addeqPic.setBounds(0, 0, 984, 561);
		contentPane.add(addeqPic);
		
		JLabel adminChoice = new JLabel("");
		adminChoice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminPage adminPage = new AdminPage();
				adminPage.setVisible(true);
				dispose();
			}
		});
		adminChoice.setBounds(833, 0, 95, 26);
		contentPane.add(adminChoice);
		
		JLabel logout = new JLabel("");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		logout.setBounds(948, 0, 36, 26);
		contentPane.add(logout);
	}

}
