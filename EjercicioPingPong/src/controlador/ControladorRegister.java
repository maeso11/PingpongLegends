package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.EstableceConexion;
import vista.Registrarse;

public class ControladorRegister implements ActionListener {
	private Registrarse registrarse = new Registrarse();

	public ControladorRegister(Registrarse registrarse) {
		super();
		this.registrarse = registrarse;
		this.registrarse.btnCrearUsuario.addActionListener(this);
		this.registrarse.btnVolver.addActionListener(this);

	}

	public void iniciar() {
		registrarse.setTitle("Crear Cuenta");
		registrarse.setLocationRelativeTo(null);
		registrarse.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Boton Volver
		if (e.getSource() == registrarse.btnVolver) {
			registrarse.setVisible(false);
			// Boton Registrarse
		} else if (e.getSource() == registrarse.btnCrearUsuario) {
			try {
				EstableceConexion eConexion = new EstableceConexion();
				String usuario = registrarse.txtUsuario.getText();
				String contraseña = registrarse.txtContraseña.getText();
				String contraseña2 = registrarse.txtContraseña2.getText();
				if (contraseña.equals(contraseña2)) {
					eConexion.creaUsuario(usuario, contraseña, contraseña2);
					registrarse.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "La contraseña no coincide.");
				}
			} catch (ClassNotFoundException | IOException | SQLException e1) {
			}
		}
	}
}
