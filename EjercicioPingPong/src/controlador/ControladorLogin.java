package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ModeloLogin;
import vista.Login;

public class ControladorLogin implements ActionListener {
    private Login l;
    private ModeloLogin m;
    
    public ControladorLogin(Login l, ModeloLogin m) {
		super();
		this.l = l;
		this.m = m;
		this.l.btnEntrar.addActionListener(this);
	}
	public void iniciar () {
		l.setTitle("Menú Inicio");
		l.setLocationRelativeTo(null);
	}



	public void actionPerformed(ActionEvent arg0) {

		if (l.txtUser.getText().equals(m.getUser()) && l.txtPassword.getText().equals(m.getPass())) {
			JOptionPane.showMessageDialog(null, "Usuario y contraseña correctos");
		}else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
		}
		
	}
    
}
