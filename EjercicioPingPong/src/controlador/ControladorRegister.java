package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.Registrarse;

public class ControladorRegister implements ActionListener {
	private Registrarse registrarse = new Registrarse();

	public ControladorRegister(Registrarse registrarse) {
		super();
		this.registrarse = registrarse;
		this.registrarse.btnCrearUsuario.addActionListener(this);
		this.registrarse.btnVolver.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == registrarse.btnCrearUsuario) {
			JOptionPane.showMessageDialog(null, "asd");
		}
	}
}

/*
 * 		if (e.getSource() == registrarse.btnCrearUsuario) {
			EstableceConexion eConexion = new EstableceConexion();
			System.out.println("hola");
			String usuario = registrarse.txtUsuario.getText();
			String contrase�a = registrarse.txtContrase�a.getText();
			String contrase�a2 = registrarse.txtContrase�a2.getText();
			try {
				eConexion.creaUsuario(usuario, contrase�a, contrase�a2);
			} catch (ClassNotFoundException | IOException | SQLException e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == registrarse.btnVolver) {
			volver();
		}
 */
 
