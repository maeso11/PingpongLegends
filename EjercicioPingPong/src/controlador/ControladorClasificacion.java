package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Clasificaci�n;
import vista.MenuUsuario;

public class ControladorClasificacion implements ActionListener{
	
	Clasificaci�n clasificacion = new Clasificaci�n();
	
	public ControladorClasificacion(Clasificaci�n clasificacion) {
		super();
		this.clasificacion = clasificacion;
		this.clasificacion.btnVolver.addActionListener(this);
	}

	public void iniciar() {
		clasificacion.setTitle("Clasificaci�n");
		clasificacion.setLocationRelativeTo(null);
		clasificacion.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MenuUsuario menuUser = new MenuUsuario();
		ControladorUser cUser = new ControladorUser(menuUser);
		cUser.iniciar();
		clasificacion.setVisible(false);
	}
}
