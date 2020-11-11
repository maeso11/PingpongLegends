package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.MenuUsuario;
import vista.Resultados;

public class ControladorResultados implements ActionListener{
	
	Resultados resultados= new Resultados();
	public ControladorResultados(Resultados resultados) {
		super();
		this.resultados = resultados;
		this.resultados.btnVolver.addActionListener(this);
	}
	public void iniciar() {
		resultados.setTitle("Resultados");
		resultados.setLocationRelativeTo(null);
		resultados.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		MenuUsuario mUsuario = new MenuUsuario();
		ControladorUser cUser = new ControladorUser(mUsuario);
		cUser.iniciar();
		resultados.setVisible(false);
		
	}
}
