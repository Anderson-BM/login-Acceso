package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("unused")
public class Logueo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	private JButton btnIngresar;
	private JLabel lblNewLabel_3;
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logueo frame = new Logueo();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(Logueo.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//-----------------------------------------------------------------
	public Logueo() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 398);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//-------------------------LB USUARIO----------------------------------------
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(395, 52, 137, 41);
		contentPane.add(lblNewLabel_1);
		
		
		//-------------------------LB CONTRASEÑA----------------------------------------
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(395, 164, 165, 50);
		contentPane.add(lblNewLabel_2);
		
		//------------------------IMPUT USARIO-----------------------------------------
		txtUsuario = new JTextField();
		txtUsuario.setBounds(395, 103, 205, 34);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		//------------------------IMPUT PASWORD-----------------------------------------
		jpassClave = new JPasswordField();
		jpassClave.setBounds(395, 225, 215, 34);
		contentPane.add(jpassClave);
		 
		//---------------------------- BTN INGRESAR ------------------------
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setForeground(new Color(255, 255, 255));
		btnIngresar.setBackground(new Color(7, 7, 129));
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char [] clave = jpassClave.getPassword();
						String claveFinal = new String (clave);

		//-----------------------------------------------------------------
				if(txtUsuario.getText().equals("Anderson") && claveFinal.equals("2323")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema"," INGRESASTE",
							JOptionPane.INFORMATION_MESSAGE	);
					
					Principal p = new Principal();
					p.setVisible(true);
					p.setLocationRelativeTo(null);
					p.setDefaultCloseOperation(Logueo.EXIT_ON_CLOSE);
		//-----------------------------------------------------------------
					}else {
						JOptionPane.showMessageDialog(null, "Usuario o contraseña Iconrrecto", "ERROR",
								JOptionPane.ERROR_MESSAGE);
						
						txtUsuario.setText("");
						jpassClave.setText("");
						txtUsuario.requestFocus();

					}
				}
			
		});
		btnIngresar.setBounds(433, 289, 137, 41);
		contentPane.add(btnIngresar);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Logueo.class.getResource("/IMG/MM.png")));
		lblNewLabel_3.setBounds(0, 0, 344, 360);
		contentPane.add(lblNewLabel_3);
	}
}
