package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.EstableceConexion;
import modelo.ModeloLogin;
import vista.Jugadores;
import vista.Login;
import vista.Menu;
import vista.MenuUsuario;
import vista.Registrarse;

public class ControladorLogin implements ActionListener {
	private Login l;
	private ModeloLogin m;

	public ControladorLogin(Login l, ModeloLogin m) {
		super();
		this.l = l;
		this.m = m;
		this.l.btnEntrar.addActionListener(this);
		this.l.btnVolver.addActionListener(this);
		this.l.btnRegistrarme.addActionListener(this);
	}

	public void iniciar() {
		l.setTitle("Men� Inicio");
		l.setLocationRelativeTo(null);
		l.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		ControladorAdmin cAdmin = new ControladorAdmin();
		MenuUsuario menuUser = new MenuUsuario();
		ControladorUser cUser = new ControladorUser(menuUser);
		Menu menu = new Menu();
		// Boton Volver
		if (e.getSource() == l.btnVolver) {
			menu.setVisible(true);
			l.setVisible(false);
		// Bot�n registrarse
		} else if (e.getSource() == l.btnRegistrarme) {
			Registrarse r = new Registrarse();
			r.setVisible(true);
		} else if (e.getSource() == l.btnEntrar) {
			if (l.txtUser.getText().equals(m.getUser()) && l.txtPassword.getText().equals(m.getPass())) {
				JOptionPane.showMessageDialog(null, "Has accedido como administrador");
				cAdmin.iniciar();
				l.setVisible(false);
			} else if (l.txtUser.getText().equals("") || l.txtPassword.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Tienes que rellenar los campos");
			} else {
				JOptionPane.showMessageDialog(null, "Has accedido como usuario");
				cUser.iniciar();
				l.setVisible(false);
			}
		}

	}

}
