package controlador;

import vista.MenuAdmin;

public class ControladorAdmin {
	
	MenuAdmin menuAdmin = new MenuAdmin();
	
	public void iniciar() {
		menuAdmin.setTitle("Men� Administrador");
		menuAdmin.setLocationRelativeTo(null);
		menuAdmin.setVisible(true);
	}
}
