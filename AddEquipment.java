import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;

public class AddEquipment extends JFrame {

	private JPanel contentPane;
	private JTextField equipment;
	private JTextField quantity;
	private JTable table;
	DefaultTableModel model;

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
		
		equipment = new JTextField();
		equipment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		equipment.setBackground(null);
		equipment.setBorder(null);
		equipment.setOpaque(false);
		equipment.setBounds(123, 176, 190, 20);
		contentPane.add(equipment);
		equipment.setColumns(10);
		
		quantity = new JTextField();
		quantity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		quantity.setBackground(null);
		quantity.setBorder(null);
		quantity.setOpaque(false);
		quantity.setBounds(471, 176, 86, 20);
		contentPane.add(quantity);
		quantity.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 252, 895, 278);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				equipment.setText(model.getValueAt(i, 0).toString());
				quantity.setText(model.getValueAt(i, 1).toString());
			}
		});
		model = new DefaultTableModel();
		Object[] column = {"Equipment", "No. of Equipment"};
		final Object[] row = new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		
		JLabel addeqPic = new JLabel("");
		addeqPic.setIcon(new ImageIcon("C:\\Users\\callv\\OneDrive\\Pictures\\Project\\AddEquipment.png"));
		addeqPic.setBounds(0, 0, 984, 561);
		contentPane.add(addeqPic);
		
		JLabel addBtn = new JLabel("");
		addBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(equipment.getText().equals("") || quantity.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill complete information.");
				} else {
					row[0] = equipment.getText();
					row[1] = quantity.getText();
					model.addRow(row);
					
					equipment.setText("");
					quantity.setText("");
					JOptionPane.showMessageDialog(null, "Saved Successfully!");
				}
			}
		});
		addBtn.setBounds(833, 162, 86, 34);
		contentPane.add(addBtn);
		
		JLabel editBtn = new JLabel("");
		editBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				if (i>=0) {
					model.setValueAt(equipment.getText(), i, 0);
					model.setValueAt(quantity.getText(), i, 1);
					JOptionPane.showMessageDialog(null, "Update Successful!");
				} else {
					JOptionPane.showMessageDialog(null, "Please select a row first.");
				}
			}
		});
		editBtn.setBounds(833, 207, 86, 26);
		contentPane.add(editBtn);
	}
}
