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

import control.ControladorVentanaCanvas;
import control.ControladorVentanaMail;

public class MiVentanaCanvas extends JInternalFrame {

	public JButton borrar;

	public MiVentanaCanvas(ControladorVentanaCanvas controlador2) {

		JPanel panelCentral = new JPanel();

		borrar = new JButton("Borrar");

		borrar.setActionCommand("Borrar");

		this.getContentPane().add(panelCentral);
		this.setSize(310, 250);
		this.setTitle("Nuevo Canvas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}