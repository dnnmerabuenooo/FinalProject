import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel adminpagePic = new JLabel("");
		adminpagePic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\AdminPage.png"));
		adminpagePic.setBounds(0, 0, 984, 561);
		contentPane.add(adminpagePic);
		
		JLabel addeqBtn = new JLabel("New label");
		addeqBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddEquipment addEquipment = new AddEquipment();
				addEquipment.setVisible(true);
				dispose();
			}
		});
		addeqBtn.setBounds(805, 62, 169, 42);
		contentPane.add(addeqBtn);
		
		JLabel availableeqBtn = new JLabel("New label");
		availableeqBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AvailableEquipment availableEquipment = new AvailableEquipment();
				availableEquipment.setVisible(true);
				dispose();
			}
		});
		availableeqBtn.setBounds(805, 134, 169, 42);
		contentPane.add(availableeqBtn);
		
		JLabel recordsBtn = new JLabel("New label");
		recordsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Records records = new Records();
				records.setVisible(true);
				dispose();
			}
		});
		recordsBtn.setBounds(805, 205, 169, 42);
		contentPane.add(recordsBtn);
		
		JLabel adminlogoutBtn = new JLabel("");
		adminlogoutBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomePage home = new HomePage();
				home.setVisible(true);
				dispose();
			}
		});
		adminlogoutBtn.setBounds(894, 547, 90, 14);
		contentPane.add(adminlogoutBtn);
		
		JLabel logout = new JLabel("");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		logout.setBounds(955, 0, 29, 22);
		contentPane.add(logout);
	}

}
