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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.List;

public class ventana7 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldBuscar;

    /**
     * Launch the application.
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
     * Create the frame.
     */
    public ventana7() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 899, 596);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("ALMACEN");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 40));
        lblNewLabel.setBounds(341, 66, 296, 55);
        contentPane.add(lblNewLabel);

        createButton("New button", 104, 164);
        createButton("New button", 104, 244);
        createButton("New button", 104, 321);
        createButton("New button", 267, 321);
        createButton("New button", 267, 244);
        createButton("New button", 267, 164);
        createButton("New button", 436, 164);
        createButton("New button", 436, 244);
        createButton("New button", 436, 321);
        createButton("New button", 597, 164);
        createButton("New button", 597, 244);
        createButton("New button", 597, 321);

        textFieldBuscar = new JTextField();
        textFieldBuscar.setBounds(419, 132, 120, 20);
        contentPane.add(textFieldBuscar);
        textFieldBuscar.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("BUSCAR");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(320, 132, 74, 17);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/logoChef.png")));
        lblNewLabel_2.setBounds(-113, 61, 379, 163);
        contentPane.add(lblNewLabel_2);
        
                JMenuBar menuBar = new JMenuBar();
                menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                menuBar.setBounds(230, 23, 488, 28);
                contentPane.add(menuBar);
                
                        JMenuItem mntmNewMenuItem = new JMenuItem("RESTAURANTE");
                        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                        menuBar.add(mntmNewMenuItem);
                        
                                JMenuItem mntmNewMenuItem_1 = new JMenuItem("ALMACEN");
                                mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                                menuBar.add(mntmNewMenuItem_1);
                                
                                        JMenuItem mntmNewMenuItem_2 = new JMenuItem("PERSONAL");
                                        mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                                        menuBar.add(mntmNewMenuItem_2);
                                        
                                        JButton btnAgregar = new JButton("Agregar +");
                                        btnAgregar.setBackground(new Color(138, 236, 140));
                                        btnAgregar.setBounds(724, 131, 89, 23);
                                        contentPane.add(btnAgregar);

        createButton("New button", 104, 398);
        createButton("New button", 267, 398);
        createButton("New button", 436, 398);
        createButton("New button", 597, 398);
    }

    private void createButton(String text, int x, int y) {
    }
}