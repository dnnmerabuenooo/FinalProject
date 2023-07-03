
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		setBounds(100, 100, 1000, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel adminPagePic = new JLabel("");
		adminPagePic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\adminPage.png"));
		adminPagePic.setBounds(0, 0, 1000, 600);
		contentPane.add(adminPagePic);
		
		JLabel AddEBtn = new JLabel("");
		AddEBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AddEquipment adminAdd = new AddEquipment();
				adminAdd.setVisible(true);
				dispose();
			}
		});
		AddEBtn.setBounds(809, 80, 165, 42);
		contentPane.add(AddEBtn);
		
		JLabel AvailEBtn = new JLabel("");
		AvailEBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AvailableEquipment avail = new AvailableEquipment();
				avail.setVisible(true);
				dispose();
			}
		});
		AvailEBtn.setBounds(809, 155, 165, 42);
		contentPane.add(AvailEBtn);
		
		JLabel ViewReportBtn = new JLabel("");
		ViewReportBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Records adminRecords = new Records();
				adminRecords.setVisible(true);
				dispose();
			}
		});
		ViewReportBtn.setBounds(809, 224, 165, 42);
		contentPane.add(ViewReportBtn);
		
		JLabel AdminLogout = new JLabel("");
		AdminLogout.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				HomePage home = new HomePage();
				home.setVisible(true);
				dispose();
			}
		});
		AdminLogout.setBounds(894, 566, 90, 25);
		contentPane.add(AdminLogout);
	}
}
