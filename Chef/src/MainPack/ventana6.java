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

    private JPanel contentPane;
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

    /**
     * Constructor de la clase ventana6.
     */
    public ventana6() {
        // Configuración de la ventana
        setIconImage(Toolkit.getDefaultToolkit().getImage(ventana6.class.getResource("/recursos/logoChef.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 899, 596);
        setLocationRelativeTo(null);
        
        // Creación del panel de contenido
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Etiqueta "VERDURAS"
        JLabel lblNewLabel = new JLabel("VERDURAS");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(341, 59, 198, 46);
        contentPane.add(lblNewLabel);

        // Campo de texto para búsqueda
        textField = new JTextField();
        textField.setBounds(407, 110, 120, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        // Etiqueta "BUSCAR"
        JLabel lblNewLabel_1 = new JLabel("BUSCAR");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(323, 113, 74, 17);
        contentPane.add(lblNewLabel_1);

        // Imagen del logo
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 7));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/logoChef.png")));
        lblNewLabel_2.setBounds(-138, 75, 304, 77);
        contentPane.add(lblNewLabel_2);

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(230, 23, 488, 28);
        contentPane.add(menuBar);

        // Elementos del menú
        JMenuItem mntmNewMenuItem = new JMenuItem("RESTAURANTE");
        menuBar.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("ALMACEN");
        menuBar.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("PERSONAL");
        menuBar.add(mntmNewMenuItem_2);

      
        botones = new ArrayList<>();

        // Creación de botones con el método createButton
        createButton("alimento", 41, 405, 155, 47);
        createButton("Limon", 41, 310, 155, 47);
        createButton("Brocoli", 217, 221, 144, 47);
        createButton("Zanahoria", 217, 405, 147, 47);
        createButton("Patata", 384, 221, 143, 46);
        createButton("Esparragos", 384, 406, 143, 46);
        createButton("Berenjena", 537, 221, 134, 46);
        createButton("Tomate", 217, 310, 144, 47);
        createButton("Calabaza", 537, 310, 134, 46);
        createButton("Puerro", 681, 310, 154, 46);
        createButton("Maiz", 684, 221, 154, 46);
        createButton("Guisantes", 537, 405, 134, 46);
        createButton("Cebolla", 681, 405, 154, 46);
        createButton("Guisante", 384, 310, 143, 46);

        // Botón de "Tomate" con icono
        JButton btnTomateIcon = new JButton("Tomate");
        btnTomateIcon.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
        btnTomateIcon.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/avatar (1).png")));
        btnTomateIcon.setBounds(41, 221, 155, 47);
        btnTomateIcon.addActionListener(new ColorChangeActionListener(btnTomateIcon));
        botones.add(btnTomateIcon);

        // Añadir todos los botones al panel de contenido
        for (JButton boton : botones) {
            contentPane.add(boton);
        }

        // Botón de cesta
        JButton btnNewCesta = new JButton("");
        btnNewCesta.setBackground(new Color(255, 255, 255));
        btnNewCesta.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/cesta-de-la-compra.png")));
        btnNewCesta.setBounds(732, 194, 39, 46);
        btnNewCesta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón de nueva cesta
            }
        });
        contentPane.add(btnNewCesta);

        // Botón "Añadir Cesta"
        JButton btnCesta = new JButton("Añadir a Cesta");
        btnCesta.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
        btnCesta.setBounds(341, 485, 134, 41);
        btnCesta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción para el botón de añadir a la cesta
            }
        });
        contentPane.add(btnCesta);

        // Botón de avatar
        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/avatar (1).png")));
        btnNewButton.setBounds(830, 23, 45, 46);
        contentPane.add(btnNewButton);
    }

    /**
     * Método para crear un botón con texto y añadirlo a la lista de botones.
     */
    private void createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
        button.setBounds(x, y, width, height);
        button.addActionListener(new ColorChangeActionListener(button));
        botones.add(button);
    }

    /**
     * Clase interna para manejar el cambio de color de los botones.
     */
    private static class cam implements ActionListener {
        private final JButton button;

        public ColorChangeActionListener(JButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            button.setBackground(new Color(46, 204, 113));
        }
    }
}


