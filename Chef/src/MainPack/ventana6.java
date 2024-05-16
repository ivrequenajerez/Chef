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

        JMenuBar menuBar = new JMenuBar();
        panel_1.add(menuBar);

        JMenuItem mntmNewMenuItem = new JMenuItem("RESTAURANTE");
        menuBar.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("ALMACEN");
        menuBar.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_2 = new JMenuItem("PERSONAL");
        menuBar.add(mntmNewMenuItem_2);

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
        textField.setBounds(407, 110, 86, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("BUSCAR");
        lblNewLabel_1.setBounds(341, 113, 46, 14);
        contentPane.add(lblNewLabel_1);
        
        JButton btnAlimento = new JButton("New button");
        btnAlimento.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		btnAlimento.setBackground(new Color (46, 204, 113));
        	}
        });
        btnAlimento.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnAlimento.setBounds(81, 178, 109, 46);
        contentPane.add(btnAlimento);
        
        JButton btnNewButton_1 = new JButton("New button");
        btnNewButton_1.setBounds(81, 244, 109, 46);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("New button");
        btnNewButton_2.setBounds(81, 317, 109, 46);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("New button");
        btnNewButton_3.setBounds(222, 178, 109, 46);
        contentPane.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("New button");
        btnNewButton_4.setBounds(222, 244, 109, 46);
        contentPane.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("New button");
        btnNewButton_5.setBounds(222, 317, 109, 46);
        contentPane.add(btnNewButton_5);
        
        JButton btnNewButton_6 = new JButton("New button");
        btnNewButton_6.setBounds(354, 178, 109, 46);
        contentPane.add(btnNewButton_6);
        
        JButton btnNewButton_8 = new JButton("New button");
        btnNewButton_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_8.setBounds(354, 317, 109, 46);
        contentPane.add(btnNewButton_8);
        
        JButton btnNewButton_9 = new JButton("New button");
        btnNewButton_9.setBounds(508, 178, 109, 46);
        contentPane.add(btnNewButton_9);
        
        JButton btnNewButton_10 = new JButton("New button");
        btnNewButton_10.setBounds(354, 244, 109, 46);
        contentPane.add(btnNewButton_10);
        
        JButton btnNewButton_11 = new JButton("New button");
        btnNewButton_11.setBounds(508, 244, 109, 46);
        contentPane.add(btnNewButton_11);
        
        JButton btnNewButton_12 = new JButton("New button");
        btnNewButton_12.setBounds(658, 244, 109, 46);
        contentPane.add(btnNewButton_12);
        
        JButton btnNewButton_13 = new JButton("New button");
        btnNewButton_13.setBounds(658, 178, 109, 46);
        contentPane.add(btnNewButton_13);
        
        JButton btnNewButton_14 = new JButton("New button");
        btnNewButton_14.setBounds(508, 317, 109, 46);
        contentPane.add(btnNewButton_14);
        
        JButton btnNewButton_7 = new JButton("New button");
        btnNewButton_7.setBounds(658, 317, 109, 46);
        contentPane.add(btnNewButton_7);

        createButton("New button", 104, 398);
        createButton("New button", 267, 398);
        createButton("New button", 436, 398);
        createButton("New button", 597, 398);
    }

    private void createButton(String text, int x, int y) {
    }
}
