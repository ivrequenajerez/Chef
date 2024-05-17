package mainPack;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setBounds(100, 100, 900, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 884, 481);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel iconoChef = new JLabel("");
		iconoChef.setIcon(new ImageIcon(Registro.class.getResource("/recursos/logoChef.png")));
		iconoChef.setBounds(33, 146, 417, 208);
		panel.add(iconoChef);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.textHighlight);
		panel_2.setBounds(551, 0, 333, 497);
		panel_2.setBackground(new Color(0, 255, 0, 50));

		panel_2.setBackground(new Color(245, 255, 250, 50));
	
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setLayout(null);
		
		JLabel lblNombreDeUsaurio = new JLabel("Nombre de usuario:");
		lblNombreDeUsaurio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombreDeUsaurio.setBounds(61, 130, 145, 14);
		panel_2.add(lblNombreDeUsaurio);
		
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(104, 161, 72, 14);
		panel_2.add(lblContraseña);
		
		JLabel lbNombreR = new JLabel("Nombre del restuarante:");
		lbNombreR.setBounds(37, 190, 145, 14);
		panel_2.add(lbNombreR);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setBounds(114, 219, 68, 14);
		panel_2.add(lblDireccion);
		
		JLabel lblCorreoElectronico_1 = new JLabel("Correo electrónico:");
		lblCorreoElectronico_1.setBounds(67, 250, 124, 14);
		panel_2.add(lblCorreoElectronico_1);
		
		JLabel lbTlf = new JLabel("Teléfono:");
		lbTlf.setBounds(104, 280, 78, 14);
		panel_2.add(lbTlf);
		
		JLabel lbTarjetaCredito = new JLabel("Tarjeta de Crédito:");
		lbTarjetaCredito.setBounds(70, 310, 145, 14);
		panel_2.add(lbTarjetaCredito);
		

		
	
		textField = new JTextField();
		textField.setBounds(177, 127, 110, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 157, 110, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
				
				
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 187, 110, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(177, 217, 110, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(177, 247, 110, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(177, 277, 110, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(177, 307, 110, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registro.class.getResource("/recursos/cubiertos-de-restaurante-simbolo-circular-de-una-cuchara-y-un-tenedor-en-un-circulo (4).png")));
		lblNewLabel.setBounds(25, -7, 136, 151);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Registro.class.getResource("/recursos/restaurante.png")));
		lblNewLabel_1.setBounds(126, 11, 86, 109);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Registro.class.getResource("/recursos/alimentos-saludables.png")));
		lblNewLabel_2.setBounds(236, 26, 159, 75);
		panel_2.add(lblNewLabel_2);
		
		JLabel fondoImagen = new JLabel("");
		fondoImagen.setIcon(new ImageIcon(Registro.class.getResource("/recursos/food-4k-tmi8md4hnk20df1u (1).jpg")));
		fondoImagen.setBounds(0, 0, 884, 481);
		panel.add(fondoImagen);
	}
}
