import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class ClsInstW {

	// Create Jframe
	private JFrame frame;
	//create a table and set identifiers 
		JTable table = new JTable();
		Object[]columns = {"ProductName","Barcode","Amount"};
		DefaultTableModel model = new DefaultTableModel();
		
	public void creatJFrame() {
	model.setColumnIdentifiers(columns);	
    table.setModel(model);
    // set the model to the table
    table.setModel(model);
    
    // Change A JTable Background Color, Font Size, Font Color, Row Height
    table.setBackground(Color.LIGHT_GRAY);
    table.setForeground(Color.black);
    Font font = new Font("",1,22);
    table.setFont(font);
    table.setRowHeight(30);
    
	}
	
	private JTextField txtQunatityType;// first textfield for Quantity supply
	private JTextField txtAmount;// Amount to add, next text field
	private JTextField txtBarcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClsInstW window = new ClsInstW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public ClsInstW() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		creatJFrame();
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(87, 159, -79, 16);
		frame.getContentPane().add(textArea);
		
		JLabel lblModifySupplyQuantity = new JLabel("Modify Supply quantity");
		lblModifySupplyQuantity.setForeground(new Color(30, 144, 255));
		lblModifySupplyQuantity.setFont(new Font("Lucida Grande", Font.ITALIC, 12));
		lblModifySupplyQuantity.setBackground(new Color(0, 255, 51));
		lblModifySupplyQuantity.setBounds(6, 156, 153, 29);
		frame.getContentPane().add(lblModifySupplyQuantity);
		
		txtQunatityType = new JTextField();
		txtQunatityType.setText("Qunatity type");
		txtQunatityType.setBounds(6, 185, 130, 34);
		frame.getContentPane().add(txtQunatityType);
		txtQunatityType.setColumns(10);
		
		txtAmount = new JTextField();
		txtAmount.setText("amount");
		txtAmount.setBounds(264, 185, 90, 34);
		frame.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		// action performed for button add
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnAdd.setBounds(354, 186, 90, 34);
		frame.getContentPane().add(btnAdd);
		 
		// Action for "execute" add supply
		JButton btnEx = new JButton("Execute");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEx.setBounds(340, 131, 102, 29);
		frame.getContentPane().add(btnEx);
		
		JButton btnSubtract = new JButton("Update");
		btnSubtract.setBackground(new Color(240, 230, 140));
		btnSubtract.setBounds(249, 131, 94, 29);
		frame.getContentPane().add(btnSubtract);
		
		JLabel lblReturnConsole = new JLabel("Return Console");
		lblReturnConsole.setBackground(new Color(255, 255, 255));
		lblReturnConsole.setBounds(6, 223, 422, 50);
		lblReturnConsole.setOpaque(true);// allow for background color change

		frame.getContentPane().add(lblReturnConsole);
		
		txtBarcode = new JTextField();
		txtBarcode.setText("Barcode");
		txtBarcode.setBounds(136, 185, 130, 34);
		frame.getContentPane().add(txtBarcode);
		txtBarcode.setColumns(10);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textArea, lblModifySupplyQuantity, txtQunatityType, txtAmount, btnAdd}));
	}
}
