package MainPack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Contraseña;
	private JTextField textField_Usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//ICONO USUARIO
		
		java.net.URL imgUrl11 = getClass().getResource("/recursos/avatar(1).png");
		
		ImageIcon icon11 = new ImageIcon(imgUrl11);
	

		JButton iconoUsuario = new JButton(new ImageIcon(Login.class.getResource("/recursos/avatar (2).png")));
		icon11 = new ImageIcon(icon11.getImage().getScaledInstance(iconoUsuario.getWidth(), iconoUsuario.getHeight(), java.awt.Image.SCALE_SMOOTH));
		iconoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		iconoUsuario.setBounds(230, 25, 194, 140);
		panel.add(iconoUsuario);
		iconoUsuario.setPreferredSize(new Dimension(icon11.getIconWidth(), icon11.getIconHeight()));
		iconoUsuario.setContentAreaFilled(false);
		
		textField_Contraseña = new JTextField();
		textField_Contraseña.setBounds(286, 190, 86, 20);
		panel.add(textField_Contraseña);
		textField_Contraseña.setColumns(10);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setColumns(10);
		textField_Usuario.setBounds(286, 145, 86, 20);
		panel.add(textField_Usuario);
		
		JButton iconoChef = new JButton("");
		iconoChef.setContentAreaFilled(false);
		iconoChef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		iconoChef.setIcon(new ImageIcon(Login.class.getResource("/recursos/logoChef.png")));
		iconoChef.setBounds(33, 72, 278, 165);
		panel.add(iconoChef);
		
		JButton panelbtn = new JButton("");
		panelbtn.setIcon(new ImageIcon(Login.class.getResource("/recursos/fondo2.png")));
		panelbtn.setBounds(-10, 0, 444, 261);
		panel.add(panelbtn);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(301, 128, 71, 14);
		panel.add(lblNewLabel);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panelbtn, iconoUsuario, textField_Contraseña, textField_Usuario, iconoChef, lblNewLabel}));
		
		
		
		
		
		
	}
}
