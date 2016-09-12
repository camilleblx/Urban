package vue;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtlp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntreeJeu frame = new EntreeJeu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}ca
		});
	}
	
	/**
	 * Create the frame.
	 */
	
	
	/**
	* clic sur le bouton Start pour lancer le serveur
	*/
	private void btnStart_clic() {
	System.out.println("using start button") ;
	}
	
	private void btnExit_clic() {
		System.exit(0);
		}
	
	public EntreeJeu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Start a server :");
		lblNewLabel.setBounds(16, 46, 84, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblConnectAn = new JLabel("Connect an existing server :");
		lblConnectAn.setBounds(16, 81, 166, 14);
		contentPane.add(lblConnectAn);
		
		JLabel lblIpServer = new JLabel("IP Server :");
		lblIpServer.setBounds(16, 106, 73, 24);
		contentPane.add(lblIpServer);
		
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnStart_clic() ;
			}
		});
		btnStart.setBounds(199, 47, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(199, 107, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnExit_clic() ;
			}
		});
		btnExit.setBounds(199, 151, 89, 23);
		contentPane.add(btnExit);
		
		txtlp = new JTextField();
		txtlp.setText("127.0.0.1");
		txtlp.setBounds(96, 108, 86, 20);
		contentPane.add(txtlp);
		txtlp.setColumns(10);
	}
}
