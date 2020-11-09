package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Clasificacion;
import vista.MenuUsuario;

public class ControladorClasificacion implements ActionListener{
	
	Clasificacion clasificacion = new Clasificacion();
	
	public ControladorClasificacion(Clasificacion clasificacion) {
		super();
		this.clasificacion = clasificacion;
		this.clasificacion.btnVolver.addActionListener(this);
	}

	public void iniciar() {
		clasificacion.setTitle("Clasificación");
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
