import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class E_Commerce_Layout {

	private JFrame frame;
	private JTextField txtSearchBar;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel BodyContent;
	private CardLayout BodyContentLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_Commerce_Layout window = new E_Commerce_Layout();
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
	public E_Commerce_Layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(
				new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel Header = new JPanel();
		Header.setPreferredSize(new Dimension(1024, 100));
		frame.getContentPane().add(Header);
		Header.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BodyContentLayout.next(BodyContent);
			}
		});
		lblLogo.setPreferredSize(new Dimension(200, 100));
		lblLogo.setFont(new Font("Times New Roman", Font.PLAIN, 48));
		Header.add(lblLogo);

		txtSearchBar = new JTextField();
		txtSearchBar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtSearchBar.setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				txtSearchBar.setText("Search Bar...");
			}
		});
		txtSearchBar.setPreferredSize(new Dimension(300, 40));
		txtSearchBar.setText("Search Bar...");
		Header.add(txtSearchBar);
		txtSearchBar.setColumns(30);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setPreferredSize(new Dimension(25, 40));
		Header.add(btnNewButton);

		JPanel subHeader = new JPanel();
		subHeader.setPreferredSize(new Dimension(435, 100));
		Header.add(subHeader);
		subHeader.setLayout(null);

		JLabel lblAccountInformation = new JLabel("    Account Information-");
		lblAccountInformation.setPreferredSize(new Dimension(300, 85));
		lblAccountInformation.setBounds(0, 12, 300, 88);
		subHeader.add(lblAccountInformation);
		
		JButton btnShoppingCart = new JButton("Shopping Cart");
		btnShoppingCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnShoppingCart.setFont(new Font("Dialog", Font.BOLD, 10));
		btnShoppingCart.setBounds(306, 63, 117, 25);
		subHeader.add(btnShoppingCart);

		BodyContent = new JPanel();
		BodyContent.setPreferredSize(new Dimension(1000, 600));
		BodyContentLayout = new CardLayout();
		BodyContent.setLayout(BodyContentLayout);
		frame.getContentPane().add(BodyContent);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BodyContentLayout.show(BodyContent, "Login_Panel");
			}
		});
		btnLogin.setBounds(306, 12, 117, 25);
		subHeader.add(btnLogin);

		JPanel Guest = new JPanel();
		Guest.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		BodyContent.add(Guest);

		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setAlignmentY(0.0f);
		lblWelcome.setPreferredSize(new Dimension(1024, 20));
		Guest.add(lblWelcome);

		JPanel guestContent = new JPanel();
		guestContent.setPreferredSize(new Dimension(1024, 580));
		guestContent.setAlignmentY(Component.TOP_ALIGNMENT);
		guestContent.setAlignmentX(Component.LEFT_ALIGNMENT);
		guestContent.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Guest.add(guestContent);

		JPanel sideBar = new JPanel();
		sideBar.setPreferredSize(new Dimension(150, 535));
		sideBar.setSize(new Dimension(25, 580));
		sideBar.setMaximumSize(new Dimension(25, 580));
		sideBar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		guestContent.add(sideBar);

		JButton btnNewButton_1 = new JButton("Best Sellers");
		btnNewButton_1.setPreferredSize(new Dimension(144, 25));
		sideBar.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Recently Added");
		btnNewButton_2.setPreferredSize(new Dimension(144, 25));
		sideBar.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Daily Deals");
		btnNewButton_3.setPreferredSize(new Dimension(144, 25));
		sideBar.add(btnNewButton_3);

		JPanel scrollableItems = new JPanel();
		scrollableItems.setPreferredSize(new Dimension(850, 535));
		scrollableItems.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		guestContent.add(scrollableItems);

		JList list = new JList();
		list.setPreferredSize(new Dimension(800, 535));
		scrollableItems.add(list);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setPreferredSize(new Dimension(15, 530));
		scrollableItems.add(scrollBar);

		JPanel User = new JPanel();
		BodyContent.add(User);

		JPanel Admin = new JPanel();
		BodyContent.add(Admin);
		
		JPanel Login = new JPanel();
		BodyContent.add(Login, "Login_Panel");
		GridBagLayout gbl_Login = new GridBagLayout();
		gbl_Login.columnWidths = new int[]{0, 0};
		gbl_Login.rowHeights = new int[]{0, 0};
		gbl_Login.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_Login.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		Login.setLayout(gbl_Login);
		
		JPanel sub_login = new JPanel();
		sub_login.setPreferredSize(new Dimension(300, 150));
		GridBagConstraints gbc_sub_login = new GridBagConstraints();
		Login.add(sub_login, gbc_sub_login);
		sub_login.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(200, 19));
		sub_login.add(textField);
		textField.setColumns(20);
		
		textField_1 = new JTextField();
		sub_login.add(textField_1);
		textField_1.setColumns(20);
		
		JButton btnNewButton_4 = new JButton("Login");
		sub_login.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Create Account");
		btnNewButton_5.setDefaultCapable(false);
		sub_login.add(btnNewButton_5);

	}
}
