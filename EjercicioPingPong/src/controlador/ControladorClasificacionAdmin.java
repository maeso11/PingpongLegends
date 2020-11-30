package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.AdminClasificacion;
import vista.Clasificacion;
import vista.MenuUsuario;

public class ControladorClasificacionAdmin implements ActionListener{
	
	AdminClasificacion adminclasificacion = new AdminClasificacion();
	Clasificacion clasificacion = new Clasificacion();
	
	public ControladorClasificacionAdmin(Clasificacion clasificacion) {
		super();
		this.clasificacion = clasificacion;
		this.clasificacion.btnVolver.addActionListener(this);
		this.adminclasificacion.btnActualizar.addActionListener(this);
	}

	public void iniciar() {
		clasificacion.setTitle("Clasificación");
		clasificacion.setLocationRelativeTo(null);
		clasificacion.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==adminclasificacion.btnVolver) {
			MenuUsuario menuUser = new MenuUsuario();
			ControladorUser cUser = new ControladorUser(menuUser);
			cUser.iniciar();
			clasificacion.setVisible(false);
		}else if(e.getSource()==adminclasificacion) {
			clasificacion.lblPuntos.setText(adminclasificacion.puntos1.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos2.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos3.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos4.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos5.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos6.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos7.getText()+ " PUNTOS");
			clasificacion.lblPuntos.setText(adminclasificacion.puntos8.getText()+ " PUNTOS");
			
		}
		
	}
}
