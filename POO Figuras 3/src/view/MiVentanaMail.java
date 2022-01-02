package view;

import java.awt.Color;
import javax.swing.JInternalFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import control.ControladorVentanaMail;

public class MiVentanaMail extends JInternalFrame {

	public JTextField email;
	public JTextField asunto;
	public JTextArea mensaje;
	public JButton enviar;
	public JButton mostrar;

	public MiVentanaMail(ControladorVentanaMail c) {

		JPanel panelCentral = new JPanel();
		email = new JTextField(20);
		asunto = new JTextField(20);
		mensaje = new JTextArea(5, 25);
		mensaje.setBorder(new LineBorder(Color.RED));

		JLabel etiqueta2 = new JLabel("Asunto:");
		JLabel etiqueta3 = new JLabel("Escribe aquí tu Mensaje");

		enviar = new JButton("Enviar");
		mostrar = new JButton("Mostrar");

		enviar.setActionCommand("Enviar");
		mostrar.setActionCommand("Mostrar");

		enviar.addActionListener(c);
		mostrar.addActionListener(c);

		panelCentral.add(new JLabel("Para:"));
		panelCentral.add(email);
		panelCentral.add(etiqueta2);
		panelCentral.add(asunto);
		panelCentral.add(etiqueta3);
		panelCentral.add(mensaje);
		panelCentral.add(enviar);
		panelCentral.add(mostrar);
		this.getContentPane().add(panelCentral);
		this.setSize(310, 250);
		this.setTitle("Envío de Correo");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}