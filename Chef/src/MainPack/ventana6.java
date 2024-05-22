package MainPack;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class ventana6 extends JFrame {

    private JPanel contentPaneInicio;
    private JTextField textField;
    private ArrayList<JButton> botones;

    /**
     * Método principal para ejecutar la aplicación.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventana6 frame = new ventana6();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
    public ventana6() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ventana6.class.getResource("/recursos/alimentos-saludables.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 899, 596);
        setLocationRelativeTo(null);

        contentPaneInicio = new JPanel();
        contentPaneInicio.setBackground(new Color(255, 255, 255));
        contentPaneInicio.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneInicio);
        contentPaneInicio.setLayout(null);

        JLabel lblNewLabel = new JLabel("VERDURAS");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(341, 59, 198, 46);
        contentPaneInicio.add(lblNewLabel);

        // Campo de texto para búsqueda
        textField = new JTextField();
        textField.setBounds(407, 110, 120, 20);
        contentPaneInicio.add(textField);
        textField.setColumns(10);

        // Etiqueta "BUSCAR"
        JLabel lblNewLabel_1 = new JLabel("BUSCAR");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(323, 113, 74, 17);
        contentPaneInicio.add(lblNewLabel_1);

        // Imagen del logo
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 7));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/logoChef.png")));
        lblNewLabel_2.setBounds(-138, 75, 304, 77);
        contentPaneInicio.add(lblNewLabel_2);

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(230, 23, 488, 28);
        contentPaneInicio.add(menuBar);

        // Elementos del menú
        JMenuItem mntmNewMenuItem = new JMenuItem("RESTAURANTE");
        menuBar.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("ALMACEN");
        menuBar.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("PERSONAL");
        menuBar.add(mntmNewMenuItem_2);

        botones = new ArrayList<>();

        JButton btnNewCesta = new JButton("");
        btnNewCesta.setBackground(new Color(255, 255, 255));
        btnNewCesta.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/cesta-de-la-compra.png")));
        btnNewCesta.setBounds(772, 106, 39, 46);
        btnNewCesta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	cesta cestaVentana = new cesta();
                cestaVentana.setVisible(true);
                cestaVentana.setLocationRelativeTo(null);
            	cesta.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
                // Acción para el botón de nueva cesta
            }
        });
        contentPaneInicio.add(btnNewCesta);

        // Botón de avatar
        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/avatar (1).png")));
        btnNewButton.setBounds(830, 23, 45, 46);
        contentPaneInicio.add(btnNewButton);

        //BOTONES
        JButton btnNewButton_1 = new JButton("Sandia");
	        btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if (btnNewButton_1.getBackground().equals(new Color(129, 242, 22))) {
	        		    btnNewButton_1.setBackground(null);
	                } else {
	          
	                    btnNewButton_1.setBackground(new Color(129, 242, 22));
	                }
	        		}
	        		
	        	}
	        );
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\sandia.png"));
        btnNewButton_1.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_1.setBounds(61, 184, 136, 46);
        contentPaneInicio.add(btnNewButton_1);
        botones.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Limon");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2.setBackground(null);
                } else {
          
                	btnNewButton_2.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\limon.png"));
        btnNewButton_2.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2.setBounds(61, 259, 136, 46);
        contentPaneInicio.add(btnNewButton_2);
        botones.add(btnNewButton_2);

        JButton btnNewButton_2_1 = new JButton("Esparragos");
        btnNewButton_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_1.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_1.setBackground(null);
                } else {
          
                	btnNewButton_2_1.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\esparragos.png"));
        btnNewButton_2_1.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_1.setBounds(61, 406, 136, 46);
        contentPaneInicio.add(btnNewButton_2_1);
        botones.add(btnNewButton_2_1);

        JButton btnNewButton_2_2 = new JButton("Lechuga");
        btnNewButton_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (btnNewButton_2_2.getBackground().equals(new Color(129, 242, 22))) {
            		btnNewButton_2_2.setBackground(null);
                } else {
          
                	btnNewButton_2_2.setBackground(new Color(129, 242, 22));
                }
            }
        });
        btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\lechuga.png"));
        btnNewButton_2_2.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_2.setBounds(61, 331, 136, 46);
        contentPaneInicio.add(btnNewButton_2_2);
        botones.add(btnNewButton_2_2);

        JButton btnNewButton_2_3 = new JButton("Puerro");
        btnNewButton_2_3.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\puerro.png"));
        btnNewButton_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (btnNewButton_2_3.getBackground().equals(new Color(129, 242, 22))) {
            		btnNewButton_2_3.setBackground(null);
                } else {
          
                	btnNewButton_2_3.setBackground(new Color(129, 242, 22));
                }
            }
        });
        btnNewButton_2_3.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_3.setBounds(226, 184, 120, 46);
        contentPaneInicio.add(btnNewButton_2_3);
        botones.add(btnNewButton_2_3);

        JButton btnNewButton_2_4 = new JButton("Coliflor");
        btnNewButton_2_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_4.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_4.setBackground(null);
                } else {
          
                	btnNewButton_2_4.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_4.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\coliflor.png"));
        btnNewButton_2_4.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_4.setBounds(226, 259, 120, 46);
        contentPaneInicio.add(btnNewButton_2_4);
        botones.add(btnNewButton_2_4);

        JButton btnNewButton_2_5 = new JButton("Calabaza");
        btnNewButton_2_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_5.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_5.setBackground(null);
                } else {
          
                	btnNewButton_2_5.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_5.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\calabaza.png"));
        btnNewButton_2_5.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_5.setBounds(226, 331, 120, 46);
        contentPaneInicio.add(btnNewButton_2_5);
        botones.add(btnNewButton_2_5);

        JButton btnNewButton_2_6 = new JButton("Ajo");
        btnNewButton_2_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_6.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_6.setBackground(null);
                } else {
          
                	btnNewButton_2_6.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_6.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_6.setBounds(226, 406, 120, 46);
        contentPaneInicio.add(btnNewButton_2_6);
        botones.add(btnNewButton_2_6);

        JButton btnNewButton_2_7 = new JButton("Cebolla");
        btnNewButton_2_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (btnNewButton_2_7.getBackground().equals(new Color(129, 242, 22))) {
            		btnNewButton_2_7.setBackground(null);
                } else {
          
                	btnNewButton_2_7.setBackground(new Color(129, 242, 22));
                }
            }
        });
        btnNewButton_2_7.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_7.setBounds(370, 262, 105, 41);
        contentPaneInicio.add(btnNewButton_2_7);
        botones.add(btnNewButton_2_7);

        JButton btnNewButton_2_8 = new JButton("Guisantes");
        btnNewButton_2_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_8.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_8.setBackground(null);
                } else {
          
                	btnNewButton_2_8.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_8.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_8.setBounds(370, 331, 105, 47);
        contentPaneInicio.add(btnNewButton_2_8);
        botones.add(btnNewButton_2_8);

        JButton btnNewButton_2_9 = new JButton("Acelgas");
        btnNewButton_2_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_9.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_9.setBackground(null);
                } else {
          
                	btnNewButton_2_9.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_9.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_9.setBounds(370, 184, 105, 46);
        contentPaneInicio.add(btnNewButton_2_9);
        botones.add(btnNewButton_2_9);

        JButton btnNewButton_2_10 = new JButton("Zanahoria");
        btnNewButton_2_10.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_10.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_10.setBackground(null);
                } else {
          
                	btnNewButton_2_10.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_10.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_10.setBounds(370, 406, 105, 46);
        contentPaneInicio.add(btnNewButton_2_10);
        botones.add(btnNewButton_2_10);

        JButton btnNewButton_2_11 = new JButton("Brocoli");
        btnNewButton_2_11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_11.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_11.setBackground(null);
                } else {
          
                	btnNewButton_2_11.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_11.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_11.setBounds(509, 184, 113, 46);
        contentPaneInicio.add(btnNewButton_2_11);
        botones.add(btnNewButton_2_11);

        JButton btnNewButton_2_12 = new JButton("Patata");
        btnNewButton_2_12.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_12.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_12.setBackground(null);
                } else {
          
                	btnNewButton_2_12.setBackground(new Color(129, 242, 22));
                }
        	}
        	
        });
        btnNewButton_2_12.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_12.setBounds(509, 259, 113, 46);
        contentPaneInicio.add(btnNewButton_2_12);
        botones.add(btnNewButton_2_12);

        JButton btnNewButton_2_13 = new JButton("Tomate");
        btnNewButton_2_13.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_13.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_13.setBackground(null);
                } else {
          
                	btnNewButton_2_13.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_13.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_13.setBounds(509, 328, 113, 52);
        contentPaneInicio.add(btnNewButton_2_13);
        botones.add(btnNewButton_2_13);

        JButton btnNewButton_2_14 = new JButton("Naranja");
        btnNewButton_2_14.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_14.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_14.setBackground(null);
                } else {
          
                	btnNewButton_2_14.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_14.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\naranja.png"));
        btnNewButton_2_14.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_14.setBounds(509, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14);
        botones.add(btnNewButton_2_14);

        JButton btnNewButton_2_14_1 = new JButton("Berenjema");
        btnNewButton_2_14_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_14_1.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_14_1.setBackground(null);
                } else {
          
                	btnNewButton_2_14_1.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_14_1.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_14_1.setBounds(653, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_1);
        botones.add(btnNewButton_2_14_1);

        JButton btnNewButton_2_14_2 = new JButton("Berenjena");
        btnNewButton_2_14_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_14_2.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_14_2.setBackground(null);
                } else {
          
                	btnNewButton_2_14_2.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_14_2.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_14_2.setBounds(653, 331, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_2);
        botones.add(btnNewButton_2_14_2);

        JButton btnNewButton_2_14_3 = new JButton("Berenjema");
        btnNewButton_2_14_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_14_3.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_14_3.setBackground(null);
                } else {
          
                	btnNewButton_2_14_3.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_14_3.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_14_3.setBounds(653, 259, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_3);
        botones.add(btnNewButton_2_14_3);

        JButton btnNewButton_2_14_4 = new JButton("Berenjema");
        btnNewButton_2_14_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (btnNewButton_2_14_4.getBackground().equals(new Color(129, 242, 22))) {
        			btnNewButton_2_14_4.setBackground(null);
                } else {
          
                	btnNewButton_2_14_4.setBackground(new Color(129, 242, 22));
                }
        	}
        });
        btnNewButton_2_14_4.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 15));
        btnNewButton_2_14_4.setBounds(653, 184, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_4);
        botones.add(btnNewButton_2_14_4);

        // Botón "Añadir Cesta"
        ArrayList<String> listaCesta = new ArrayList<>();

        JButton btnCesta = new JButton("Añadir a Cesta");
        btnCesta.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/cesta-de-la-compra.png")));
        btnCesta.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
        btnCesta.setBounds(329, 494, 146, 41);
        btnCesta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
            	boolean soloUno=true;
	                for (JButton button : botones) {
	                    if (button.getBackground().equals(new Color( 129, 242, 22 ))) {
	                        listaCesta.add(button.getText());
	                        soloUno=true;
	                                    
	                    }
	                }
	                if(soloUno) {
	                	 JOptionPane.showMessageDialog(null, "Se han añadido los elementos a la cesta.", "Añadidos a la cesta", JOptionPane.INFORMATION_MESSAGE);

	                }
	                
            }
        });
        contentPaneInicio.add(btnCesta);
    }
}


