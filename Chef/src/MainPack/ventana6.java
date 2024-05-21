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
        setIconImage(Toolkit.getDefaultToolkit().getImage(ventana6.class.getResource("/recursos/logoChef.png")));
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
        JLabel lblNewLabel_2 = new JLabel("New label");
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



        JButton btnTomateIcon = new JButton("Tomate");
        btnTomateIcon.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
        btnTomateIcon.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/avatar (1).png")));
        btnTomateIcon.setBounds(41, 221, 155, 47);
        btnTomateIcon.addActionListener(new cambioColor(btnTomateIcon));
        botones.add(btnTomateIcon);


        for (JButton boton : botones) {
            contentPaneInicio.add(boton);
        }


        JButton btnNewCesta = new JButton("");
        btnNewCesta.setBackground(new Color(255, 255, 255));
        btnNewCesta.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/cesta-de-la-compra.png")));
        btnNewCesta.setBounds(727, 110, 39, 46);
        btnNewCesta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
        ArrayList<JButton> botones = new ArrayList<>();

        JButton btnNewButton_1 = new JButton("Sandia");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.setBounds(77, 184, 120, 46);
        contentPaneInicio.add(btnNewButton_1);
        botones.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Limon");
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2.setBounds(77, 259, 113, 46);
        contentPaneInicio.add(btnNewButton_2);
        botones.add(btnNewButton_2);
        
        JButton btnNewButton_2_1 = new JButton("Esparragos");
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_1.setBounds(77, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_1);
        botones.add(btnNewButton_2_1);
        
        JButton btnNewButton_2_2 = new JButton("Lechuga");
        btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_2.setBounds(77, 331, 113, 46);
        contentPaneInicio.add(btnNewButton_2_2);
        botones.add(btnNewButton_2_2);
        
        JButton btnNewButton_2_3 = new JButton("Puerro");
        btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_3.setBounds(230, 184, 109, 46);
        contentPaneInicio.add(btnNewButton_2_3);
        botones.add(btnNewButton_2_3);
        
        JButton btnNewButton_2_4 = new JButton("Coliflor");
        btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_4.setBounds(230, 259, 109, 46);
        contentPaneInicio.add(btnNewButton_2_4);
        botones.add(btnNewButton_2_4);
        
        JButton btnNewButton_2_5 = new JButton("Calabaza");
        btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_5.setBounds(230, 331, 105, 46);
        contentPaneInicio.add(btnNewButton_2_5);
        botones.add(btnNewButton_2_5);
        
        JButton btnNewButton_2_6 = new JButton("Ajo");
        btnNewButton_2_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_6.setBounds(230, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_6);
        botones.add(btnNewButton_2_6);
        
        JButton btnNewButton_2_7 = new JButton("Cebolla");
        btnNewButton_2_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_2_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_7.setBounds(370, 262, 105, 41);
        contentPaneInicio.add(btnNewButton_2_7);
        botones.add(btnNewButton_2_7);
        
        JButton btnNewButton_2_8 = new JButton("Guisantes");
        btnNewButton_2_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_8.setBounds(370, 331, 105, 47);
        contentPaneInicio.add(btnNewButton_2_8);
        botones.add(btnNewButton_2_8);
        
        JButton btnNewButton_2_9 = new JButton("Acelgas");
        btnNewButton_2_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_9.setBounds(370, 184, 105, 46);
        contentPaneInicio.add(btnNewButton_2_9);
        botones.add(btnNewButton_2_9);
        
        JButton btnNewButton_2_10 = new JButton("Zanahoria");
        btnNewButton_2_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_10.setBounds(362, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_10);
        botones.add(btnNewButton_2_10);
        
        JButton btnNewButton_2_11 = new JButton("Brocoli");
        btnNewButton_2_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_11.setBounds(509, 184, 113, 46);
        contentPaneInicio.add(btnNewButton_2_11);
        botones.add(btnNewButton_2_11);
        
        JButton btnNewButton_2_12 = new JButton("Patata");
        btnNewButton_2_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_12.setBounds(509, 259, 113, 46);
        contentPaneInicio.add(btnNewButton_2_12);
        botones.add(btnNewButton_2_12);
        
        JButton btnNewButton_2_13 = new JButton("Tomate");
        btnNewButton_2_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_13.setBounds(509, 328, 113, 52);
        contentPaneInicio.add(btnNewButton_2_13);
        botones.add(btnNewButton_2_13);
        
        JButton btnNewButton_2_14 = new JButton("Berenjema");
        btnNewButton_2_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_14.setBounds(509, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14);
        botones.add(btnNewButton_2_14);
        
        JButton btnNewButton_2_14_1 = new JButton("Berenjema");
        btnNewButton_2_14_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_14_1.setBounds(653, 406, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_1);
        botones.add(btnNewButton_2_14_1);
        
        JButton btnNewButton_2_14_2 = new JButton("Berenjema");
        btnNewButton_2_14_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_14_2.setBounds(653, 331, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_2);
        botones.add(btnNewButton_2_14_2);
        
        JButton btnNewButton_2_14_3 = new JButton("Berenjema");
        btnNewButton_2_14_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_14_3.setBounds(653, 259, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_3);
        botones.add(btnNewButton_2_14_3);
        
        JButton btnNewButton_2_14_4 = new JButton("Berenjema");
        btnNewButton_2_14_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2_14_4.setBounds(653, 184, 113, 46);
        contentPaneInicio.add(btnNewButton_2_14_4);
        botones.add(btnNewButton_2_14_4);
 
    
        // Botón "Añadir Cesta"
        JButton btnCesta = new JButton("Añadir a Cesta");
        btnCesta.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
        btnCesta.setBounds(329, 494, 134, 41);
        btnCesta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(JButton button:botones) {
                	if(button.getBackground().equals(new Color(46,204,113))) {
                		button.add(btnCesta);
                	}
                }
                		
            }
        });
        contentPaneInicio.add(btnCesta);
    
    
    }
    


    
    
    
    private static class cambioColor implements ActionListener {
        private final JButton button;

        public cambioColor(JButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            button.setBackground(new Color(46, 204, 113));
        }
    }
}


