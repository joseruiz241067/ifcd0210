import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_salario;
	
	private ButtonGroup botones=new ButtonGroup ();
	

	
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 26, 79, 14);
		contentPane.add(lblNombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(140, 23, 158, 20);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(33, 84, 46, 14);
		contentPane.add(lblEdad);
		
		final JComboBox cmb_edad = new JComboBox();
		cmb_edad.setModel(new DefaultComboBoxModel(new String[] {"15-25", "26-35", "36-45", "46-55", "M\u00E1s de 55"}));
		cmb_edad.setBounds(160, 81, 79, 20);
		contentPane.add(cmb_edad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(33, 139, 46, 14);
		contentPane.add(lblSexo);
		
		final JRadioButton rdbtnMasculino = new JRadioButton("Masculino ");
		rdbtnMasculino.setBounds(107, 135, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		final JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(200, 135, 109, 23);
		contentPane.add(rdbtnFemenino);
		
		botones.add(rdbtnMasculino);
		botones.add (rdbtnFemenino);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 198, 46, 14);
		contentPane.add(label);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(33, 198, 46, 14);
		contentPane.add(lblSalario);
		
		txt_salario = new JTextField();
		txt_salario.setBounds(99, 192, 86, 20);
		contentPane.add(txt_salario);
		txt_salario.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje,sexo;
				if (rdbtnMasculino.isSelected()) {
					sexo="Masculino";
				}
				else {
					if (rdbtnFemenino.isSelected()) {
						sexo="Femenino";
					}
					else {
						sexo="";
					}
				}
				mensaje=txt_nombre.getText()+"que tiene un rango de edad de"+cmb_edad.getSelectedItem ()+"de sexo"+sexo+"y que tiene un salario de"+txt_salario.getText();
				System.out.println(mensaje);
				
				
				
					
			}
		});
		btnIngresar.setBounds(209, 189, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(209, 223, 89, 23);
		contentPane.add(btnSalir);
	}
}
