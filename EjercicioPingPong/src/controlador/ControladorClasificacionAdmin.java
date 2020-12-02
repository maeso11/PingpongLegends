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
			clasificacion.lblPuntos1.setText(adminclasificacion.txtPuntos1.getText()+ " PUNTOS");
			clasificacion.lblPuntos2.setText(adminclasificacion.txtPuntos2.getText()+ " PUNTOS");
			clasificacion.lblPuntos3.setText(adminclasificacion.txtPuntos3.getText()+ " PUNTOS");
			clasificacion.lblPuntos4.setText(adminclasificacion.txtPuntos4.getText()+ " PUNTOS");
			clasificacion.lblPuntos5.setText(adminclasificacion.txtPuntos5.getText()+ " PUNTOS");
			clasificacion.lblPuntos6.setText(adminclasificacion.txtPuntos6.getText()+ " PUNTOS");
			clasificacion.lblPuntos7.setText(adminclasificacion.txtPuntos7.getText()+ " PUNTOS");
			clasificacion.lblPuntos8.setText(adminclasificacion.txtPuntos8.getText()+ " PUNTOS");
			
		}
		
	}
}
