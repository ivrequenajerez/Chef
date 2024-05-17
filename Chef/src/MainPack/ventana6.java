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

public class ventana6 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 899, 596);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(175, 10, 522, 38);
        contentPane.add(panel_1);

        JLabel lblNewLabel = new JLabel("Titulo");
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
        
        JButton btnAlimento = new JButton("Aliemnto");
        btnAlimento.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ew ) {
        		btnAlimento.setBackground(new Color (46, 204, 113));
        	}

        });
        btnAlimento.setBounds(103, 221, 109, 46);
        contentPane.add(btnAlimento);
        
        JButton btnNewButton = new JButton("e");
        btnNewButton.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ew ) {
        		btnNewButton.setBackground(new Color (46, 204, 113));
        	}

        });
        btnNewButton.setBounds(103, 310, 109, 46);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setBounds(103, 400, 109, 46);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("New button");
        btnNewButton_3.setBounds(247, 221, 109, 46);
        contentPane.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("New button");
        btnNewButton_4.setBounds(247, 310, 109, 46);
        contentPane.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("New button");
        btnNewButton_5.setBounds(247, 400, 109, 46);
        contentPane.add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("New button");
        btnNewButton_6.setBounds(384, 221, 109, 46);
        contentPane.add(btnNewButton_6);
        
        JButton btnNewButton_8 = new JButton("New button");
        btnNewButton_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_8.setBounds(384, 400, 109, 46);
        contentPane.add(btnNewButton_8);
        
        JButton btnNewButton_9 = new JButton("New button");
        btnNewButton_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_9.setBounds(527, 221, 109, 46);
        contentPane.add(btnNewButton_9);
        
        JButton btnNewButton_10 = new JButton("New button");
        btnNewButton_10.setBounds(384, 310, 109, 46);
        contentPane.add(btnNewButton_10);
        
        JButton btnNewButton_11 = new JButton("New button");
        btnNewButton_11.setBounds(527, 310, 109, 46);
        contentPane.add(btnNewButton_11);
        
        JButton btnNewButton_12 = new JButton("New button");
        btnNewButton_12.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_12.setBounds(671, 310, 109, 46);
        contentPane.add(btnNewButton_12);
        
        JButton btnNewButton_13 = new JButton("New button");
        btnNewButton_13.setBounds(671, 221, 109, 46);
        contentPane.add(btnNewButton_13);
        
        JButton btnNewButton_14 = new JButton("New button");
        btnNewButton_14.setBounds(527, 400, 109, 46);
        contentPane.add(btnNewButton_14);
        
        JButton btnNewButton_7 = new JButton("New button");
        btnNewButton_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_7.setBounds(671, 400, 109, 46);
        contentPane.add(btnNewButton_7);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setIcon(new ImageIcon(ventana6.class.getResource("/recursos/logoChef.png")));
        lblNewLabel_2.setBounds(-113, 61, 379, 163);
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

        createButton("New button", 104, 398);
        createButton("New button", 267, 398);
        createButton("New button", 436, 398);
        createButton("New button", 597, 398);
    }

    private void createButton(String text, int x, int y) {
    }
}
