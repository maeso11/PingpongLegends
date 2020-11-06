package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ModeloLogin;
import vista.Login;
import vista.MenuUsuario;

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
		l.setVisible(true);
	}



	public void actionPerformed(ActionEvent arg0) {

		ControladorAdmin cAdmin = new ControladorAdmin();
		MenuUsuario menuUser = new MenuUsuario();
		ControladorUser cUser = new ControladorUser(menuUser);

		if(l.txtUser.getText().equals(m.getUser()) && l.txtPassword.getText().equals(m.getPass())) {
			JOptionPane.showMessageDialog(null, "Has accedido como administrador");
			cAdmin.iniciar();
			l.setVisible(false);
		}else if(l.txtUser.getText().equals("") || l.txtPassword.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Tienes que rellenar los campos");
		}else {
			JOptionPane.showMessageDialog(null, "Has accedido como usuario");
			cUser.iniciar();
			l.setVisible(false);
		}
	}
    
}
