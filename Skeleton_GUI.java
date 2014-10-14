import java.awt.EventQueue;


public class E_Commerce_Layout {

	private JFrame frame;
	private JTextField txtSearchBar;

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
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel Header = new JPanel();
		Header.setPreferredSize(new Dimension(1024, 100));
		frame.getContentPane().add(Header);
		Header.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setPreferredSize(new Dimension(200, 100));
		lblLogo.setFont(new Font("Times New Roman",Font.PLAIN,48));
		Header.add(lblLogo);
		
		txtSearchBar = new JTextField();
		txtSearchBar.setPreferredSize(new Dimension(300, 20));
		txtSearchBar.setText("Search Bar...");
		Header.add(txtSearchBar);
		txtSearchBar.setColumns(30);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setPreferredSize(new Dimension(25, 20));
		Header.add(btnNewButton);
		
		JPanel subHeader = new JPanel();
		subHeader.setPreferredSize(new Dimension(435, 100));
		Header.add(subHeader);
		subHeader.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(306, 63, 117, 25);
		subHeader.add(btnLogin);
		
		JLabel lblAccountInformation = new JLabel("    Account Information-");
		lblAccountInformation.setPreferredSize(new Dimension(300, 85));
		lblAccountInformation.setBounds(0, 0, 298, 88);
		subHeader.add(lblAccountInformation);
		
		JTabbedPane user_Level = new JTabbedPane(JTabbedPane.TOP);
		user_Level.setPreferredSize(new Dimension(1024, 600));
		frame.getContentPane().add(user_Level);
		
		JPanel Guest = new JPanel();
		user_Level.addTab("Guest", null, Guest, null);
		Guest.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setAlignmentY(0.0f);
		lblWelcome.setPreferredSize(new Dimension(1024,20));
		Guest.add(lblWelcome);
		
		JPanel guestContent = new JPanel();
		guestContent.setPreferredSize(new Dimension(1024,580));
		guestContent.setAlignmentY(Component.TOP_ALIGNMENT);
		guestContent.setAlignmentX(Component.LEFT_ALIGNMENT);
		Guest.add(guestContent);
		guestContent.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel sideBar = new JPanel();
		sideBar.setPreferredSize(new Dimension(150, 535));
		sideBar.setSize(new Dimension(25, 580));
		sideBar.setMaximumSize(new Dimension(25, 580));
		guestContent.add(sideBar);
		sideBar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Best Sellers");
		btnNewButton_1.setPreferredSize(new Dimension(144, 25));
		sideBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Recently Added");
		sideBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Popular Items");
		btnNewButton_3.setPreferredSize(new Dimension(144, 25));
		sideBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Daily Deals");
		btnNewButton_4.setPreferredSize(new Dimension(144, 25));
		sideBar.add(btnNewButton_4);
		
		JPanel scrollableItems = new JPanel();
		scrollableItems.setPreferredSize(new Dimension(850, 535));
		guestContent.add(scrollableItems);
		scrollableItems.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList();
		list.setPreferredSize(new Dimension(800, 535));
		scrollableItems.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setPreferredSize(new Dimension(15, 530));
		scrollableItems.add(scrollBar);
		
		JPanel User = new JPanel();
		user_Level.addTab("User", null, User, null);
		
		JPanel Admin = new JPanel();
		user_Level.addTab("Admin", null, Admin, null);
	
	}
}
