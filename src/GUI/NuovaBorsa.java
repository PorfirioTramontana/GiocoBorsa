package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class NuovaBorsa.
 */
public class NuovaBorsa extends JFrame {

	/** The content pane. */
	private JPanel contentPane;
	
	/** The controller. */
	private Controller controller;
	
	/** The text citta. */
	private JTextField textCitta;
	
	/** The frame. */
	private JFrame frame;

	/**
	 * Create the frame.
	 *
	 * @param c the c
	 * @param frameChiamante the frame chiamante
	 */
	public NuovaBorsa(Controller c, JFrame frameChiamante) {
		frame=this;
		setTitle("Creazione di una nuova borsa");
		controller=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Citta");
		contentPane.add(lblNewLabel);
		
		textCitta = new JTextField();
		contentPane.add(textCitta);
		textCitta.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.nuovaBorsa(textCitta.getText());
				frameChiamante.setVisible(true);
				//frame.setVisible(false);
				frame.dispose();
			}
		});
		contentPane.add(btnOK);
	}

}
