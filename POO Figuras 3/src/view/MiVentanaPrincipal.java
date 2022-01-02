package view;

import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.ControladorMenu;

public class MiVentanaPrincipal extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JMenuItem menuItem2;

	ControladorMenu controlador;
	ControladorMenu controlador2;

	public MiVentanaPrincipal(ControladorMenu c, ControladorMenu d) {

		this.controlador=c;
		this.controlador2=d;

		this.menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		// Primer menú
		menu = new JMenu("Correo");
		menu.setMnemonic(KeyEvent.VK_C);
		// Submenú 1
		menuItem = new JMenuItem("Nuevo", KeyEvent.VK_N);
		menuItem2 = new JMenuItem("Canvas", KeyEvent.VK_N);

		menuItem.addActionListener(controlador);
		menuItem.addActionListener(controlador2);
		menu.add(menuItem);
		menu.add(menuItem2);
		this.menuBar.add(menu);

		// Le decimos que va a ser un JDesktopPane
		this.setContentPane(new JDesktopPane());

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setTitle("Principal");
		this.setVisible(true);
	}

}