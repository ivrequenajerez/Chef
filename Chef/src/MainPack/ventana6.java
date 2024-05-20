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
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class ventana6 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JButton btnNewButton_1;

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
    public ventana6() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventana6.class.getResource("/recursos/logoChef.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 899, 596); 
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("VERDURAS");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(341, 59, 198, 46);
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

        textField = new JTextField();
        textField.setBounds(407, 110, 120, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("BUSCAR");
        lblNewLabel_1.setBounds(323, 113, 74, 17);
        contentPane.add(lblNewLabel_1);

        btnNewButton_1 = new JButton("alimento");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_1.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_1.setBounds(103, 400, 109, 46);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_3 = new JButton("Limon");
        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_3.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_3.setBounds(103, 310, 109, 46);
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Brocoli");
        btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_4.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_4.setBounds(247, 221, 109, 46);
        contentPane.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Zanahoria");
        btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_5.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_5.setBounds(247, 400, 109, 46);
        contentPane.add(btnNewButton_5);

        JButton btnNewButton_6 = new JButton("Patata");
        btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNewButton_6.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_6.setBounds(384, 221, 109, 46);
        contentPane.add(btnNewButton_6);

        JButton btnNewButton_8 = new JButton("Esparragos");
        btnNewButton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNewButton_8.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_8.setBounds(384, 400, 109, 46);
        contentPane.add(btnNewButton_8);

        JButton btnNewButton_9 = new JButton("Berenjena");
        btnNewButton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNewButton_9.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_9.setBounds(527, 221, 109, 46);
        contentPane.add(btnNewButton_9);

        JButton btnNewButton_10 = new JButton("Tomate");
        btnNewButton_10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_10.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_10.setBounds(247, 310, 109, 46);
        contentPane.add(btnNewButton_10);

        JButton btnNewButton_11 = new JButton("Calabaza");
        btnNewButton_11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_11.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_11.setBounds(527, 310, 109, 46);
        contentPane.add(btnNewButton_11);

        JButton btnNewButton_12 = new JButton("Puerro");
        btnNewButton_12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNewButton_12.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_12.setBounds(671, 310, 109, 46);
        contentPane.add(btnNewButton_12);

        JButton btnNewButton_13 = new JButton("Maiz");
        btnNewButton_13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_13.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_13.setBounds(671, 221, 109, 46);
        contentPane.add(btnNewButton_13);

        JButton btnNewButton_14 = new JButton("Guisantes");
        btnNewButton_14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ew) {
                btnNewButton_14.setBackground(new Color(46, 204, 113));
            }
        });
        btnNewButton_14.setBounds(527, 400, 109, 46);
        contentPane.add(btnNewButton_14);

        JButton btnNewButton_7 = new JButton("Cebolla");
        btnNewButton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action here if needed
            }
        });
        btnNewButton_7.setBounds(671, 400, 109, 46);
        contentPane.add(btnNewButton_7);
        

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 7));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/logoChef.png")));
        lblNewLabel_2.setBounds(-138, 75, 304, 77);
        contentPane.add(lblNewLabel_2);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(230, 23, 488, 28);
        contentPane.add(menuBar);

        JMenuItem mntmNewMenuItem = new JMenuItem("RESTAURANTE");
        menuBar.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("ALMACEN");
        menuBar.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("PERSONAL");
        menuBar.add(mntmNewMenuItem_2);
        
        JButton btnNewButton_7_1 = new JButton("Guisante");
        btnNewButton_7_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        JButton buttonToma = new JButton("Tomate");
        buttonToma.setBounds(103, 218, 114, 53);
        buttonToma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonToma.setBackground(new Color(46, 204, 113));
            }
        });
        contentPane.add(buttonToma);
        btnNewButton_7_1.setBounds(384, 310, 109, 46);
        contentPane.add(btnNewButton_7_1);
        
        JButton btnNewCesta = new JButton("");
        btnNewCesta.setBackground(new Color(255, 255, 255));
        btnNewCesta.setIcon(new ImageIcon("C:\\Users\\Zero\\Documents\\GitHub\\Chef\\Chef\\src\\recursos\\bolsa-de-la-compra.png"));
        btnNewCesta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewCesta.setBounds(786, 110, 63, 63);
        contentPane.add(btnNewCesta);
        
        JButton btnCesta = new JButton("Añadir Cesta");
        btnCesta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnCesta.setBounds(354, 500, 109, 28);
        contentPane.add(btnCesta);
    }

    private void createButton(String text, int x, int y) {
        JButton buttonToma = new JButton("Tomate");
        buttonToma.setBounds(103, 218, 114, 53);
        buttonToma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonToma.setBackground(new Color(46, 204, 113));
            }
        });
        contentPane.add(buttonToma);
    }
}


