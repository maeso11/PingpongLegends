package controladorAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistaAdmin.AdminClasificacion;
import vista.Clasificacion;
import vistaAdmin.MenuAdmin;
import vista.MenuUsuario;

public class ControladorClasificacionAdmin implements ActionListener{
	
	AdminClasificacion clasificacion = new AdminClasificacion();
	Clasificacion c = new Clasificacion();
	
	
	public ControladorClasificacionAdmin(AdminClasificacion clasificacion) {
		super();
		this.clasificacion = clasificacion;
		this.clasificacion.btnVolver.addActionListener(this);
		this.clasificacion.btnActualizar.addActionListener(this);
	}

	public void iniciar() {
		clasificacion.setTitle("Clasificación");
		clasificacion.setLocationRelativeTo(null);
		clasificacion.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==clasificacion.btnVolver) {
			MenuAdmin menuAdmin = new MenuAdmin();
			ControladorAdmin ca = new ControladorAdmin(menuAdmin);
			ca.iniciar();
			clasificacion.setVisible(false);
		}else if(e.getSource()==clasificacion.btnActualizar) {
			System.out.println("hola");
			c.lblPuntos1.setText(clasificacion.txtPuntos1.getText()+ " PUNTOS");
	
			c.lblPuntos2.setText(clasificacion.txtPuntos2.getText()+ " PUNTOS");
			c.lblPuntos3.setText(clasificacion.txtPuntos3.getText()+ " PUNTOS");
			c.lblPuntos4.setText(clasificacion.txtPuntos4.getText()+ " PUNTOS");
			c.lblPuntos5.setText(clasificacion.txtPuntos5.getText()+ " PUNTOS");
			c.lblPuntos6.setText(clasificacion.txtPuntos6.getText()+ " PUNTOS");
			c.lblPuntos7.setText(clasificacion.txtPuntos7.getText()+ " PUNTOS");
			c.lblPuntos8.setText(clasificacion.txtPuntos8.getText()+ " PUNTOS");
			
		}
		
	}
}
