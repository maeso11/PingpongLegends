package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.MenuUsuario;
import vista.Simulacion;

public class ControladorSimulacion implements ActionListener{
	
	Simulacion simulacion = new Simulacion();
	
	public ControladorSimulacion(Simulacion simulacion) {
		super();
		this.simulacion = simulacion;
		this.simulacion.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		simulacion.setTitle("Ver Partido");
		simulacion.setLocationRelativeTo(null);
		simulacion.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MenuUsuario mUsuario = new MenuUsuario();
		ControladorUser cUser = new ControladorUser(mUsuario);
		cUser.iniciar();
		simulacion.setVisible(false);	
	}


}
