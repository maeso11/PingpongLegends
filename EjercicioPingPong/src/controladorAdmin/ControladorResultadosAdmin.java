package controladorAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import vista.Clasificacion;
import vista.Jugadores;
import vista.MenuUsuario;
import vista.Resultados;
import vista.Simulacion;
import vistaAdmin.MenuAdmin;
import vistaAdmin.ResultadosAdmin;

public class ControladorResultadosAdmin implements ActionListener{
	
	
	ResultadosAdmin resultados= new ResultadosAdmin();
	public ControladorResultadosAdmin(ResultadosAdmin resultados) {
		super();
		this.resultados = resultados;
		this.resultados.btnVolver.addActionListener(this);
		this.resultados.comboBox.addActionListener(this);
	}
	public void iniciar() {
		resultados.setTitle("Resultados");
		resultados.setLocationRelativeTo(null);
		resultados.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resultados.btnVolver) {
			MenuAdmin menuAdmin = new MenuAdmin();
			ControladorAdmin cUser = new ControladorAdmin(menuAdmin);
			cUser.iniciar();
			resultados.setVisible(false);
		
		}
		if(resultados.comboBox.getSelectedItem()== "MEJORES RESTADORES") {
			
			//Ocultar
			resultados.fotoMaeso.setVisible(false);
			resultados.banderaMaeso.setVisible(false);
			resultados.porro.setVisible(false);
			
			//TOP1
			resultados.lblJugador4.setText("JESÚS");
			//TOP2
			resultados.lblNewLabel_1.setText("CARLOS");
			//TOP3
			resultados.lblJugador6.setText("VICTOR");
			
			//NOMBRE %
			resultados.lblPorcentaje.setText("Porcentaje restos");
			//IMG1
			resultados.lblNewLabel_2.setIcon(new ImageIcon(Resultados.class.getResource("/img/jesusMINI.jpeg")));
			//IMG2
			resultados.lblNewLabel_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/victorMINI.jpeg")));
			//IMG3
			resultados.lblNewLabel_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/carlosMINI.jpeg")));
			
			// % 1
			resultados.label.setText("100%");
			// % 2
			resultados.label_1.setText("96%");
			// % 3
			resultados.label_2.setText("89%");
			
			//BANDERA1
			resultados.lblBandera1.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILESPAÑA.png")));
			//BANDERA2
			resultados.lblBandera4.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILESPAÑA.png")));
			//BANDERA3
			resultados.lblBandera6.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILPORTUGAL.png")));
			
			//medalla oro
			resultados.label_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/oro.png")));
			//medalla plata
			resultados.label_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/plata.png")));
			//medalla bronce
			resultados.lblNewLabel_8.setIcon(new ImageIcon(Resultados.class.getResource("/img/bronce.png")));
			
		}else if(resultados.comboBox.getSelectedItem()== "MEJORES REMATADORES") {
			
			//Ocultar
			resultados.fotoMaeso.setVisible(false);
			resultados.banderaMaeso.setVisible(false);
			resultados.porro.setVisible(false);
			
			//TOP1
			resultados.lblJugador4.setText("TONY");
			//TOP2
			resultados.lblNewLabel_1.setText("MANUEL");
			//TOP3
			resultados.lblJugador6.setText("DAVID");
			
			//NOMBRE %
			resultados.lblPorcentaje.setText("Porcentaje remates ganadores");
			//IMG1
			resultados.lblNewLabel_2.setIcon(new ImageIcon(Resultados.class.getResource("/img/tonyMINI.jpeg")));
			//IMG2
			resultados.lblNewLabel_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/DAVIDMINI.jpg")));
			//IMG3
			resultados.lblNewLabel_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/manuelMINI.jpeg")));
			
			// % 1
			resultados.label.setText("33%");
			// % 2
			resultados.label_1.setText("24%");
			// % 3
			resultados.label_2.setText("22%");
			
			//BANDERA1
			resultados.lblBandera1.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILwilly2.png")));
			//BANDERA2
			resultados.lblBandera4.setIcon(new ImageIcon(Resultados.class.getResource("/img/lilINDIA.png")));
			//BANDERA3
			resultados.lblBandera6.setIcon(new ImageIcon(Resultados.class.getResource("/img/Lilcorea.jpg")));
			
			//medalla oro
			resultados.label_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/oro.png")));
			//medalla plata
			resultados.label_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/plata.png")));
			//medalla bronce
			resultados.lblNewLabel_8.setIcon(new ImageIcon(Resultados.class.getResource("/img/bronce.png")));
			
		}else if(resultados.comboBox.getSelectedItem()== "MEJORES SACADORES") {
			
			//Ocultar
			resultados.fotoMaeso.setVisible(false);
			resultados.banderaMaeso.setVisible(false);
			resultados.porro.setVisible(false);
			//TOP1
			resultados.lblJugador4.setText("MANUEL");
			//TOP2
			resultados.lblNewLabel_1.setText("PACO");
			//TOP3
			resultados.lblJugador6.setText("DAVID");
			
			//NOMBRE %
			resultados.lblPorcentaje.setText("Porcentaje saques ganadores");
			//IMG1
			resultados.lblNewLabel_2.setIcon(new ImageIcon(Resultados.class.getResource("/img/manuelMINI.jpeg")));
			//IMG2
			resultados.lblNewLabel_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/pacoMINI.jpeg")));
			//IMG3
			resultados.lblNewLabel_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/DAVIDMINI.jpg")));
			
			// % 1
			resultados.label.setText("83%");
			// % 2
			resultados.label_1.setText("77%");
			// % 3
			resultados.label_2.setText("71%");
			
			//BANDERA1
			resultados.lblBandera1.setIcon(new ImageIcon(Resultados.class.getResource("/img/Lilcorea.jpg")));
			//BANDERA2
			resultados.lblBandera4.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILwilly2.png")));
			//BANDERA3
			resultados.lblBandera6.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILBRASIL.png")));
			
			//medalla oro
			resultados.label_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/oro.png")));
			//medalla plata
			resultados.label_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/plata.png")));
			//medalla bronce
			resultados.lblNewLabel_8.setIcon(new ImageIcon(Resultados.class.getResource("/img/bronce.png")));
			
		}else if(resultados.comboBox.getSelectedItem()== "MEJORES FUMADORES") {
			
			//Ocultar
			resultados.fotoMaeso.setVisible(true);
			resultados.banderaMaeso.setVisible(true);
			resultados.porro.setVisible(true);
			
			//TOP1
			resultados.lblJugador4.setText("MAESO");
			//TOP2
			resultados.lblNewLabel_1.setText("");
			//TOP3
			resultados.lblJugador6.setText("");
			
			//NOMBRE %
			resultados.lblPorcentaje.setText("Porcentaje de fumadores");
			//IMG1
			resultados.lblNewLabel_2.setIcon(new ImageIcon(Resultados.class.getResource("")));
			//IMG2
			resultados.lblNewLabel_3.setIcon(new ImageIcon(Resultados.class.getResource("")));
			//IMG3
			resultados.lblNewLabel_4.setIcon(new ImageIcon(Resultados.class.getResource("")));
			
			// % 1
			resultados.label.setText("100%");
			// % 2
			resultados.label_1.setText("");
			// % 3
			resultados.label_2.setText("");
			
			//BANDERA1
			resultados.lblBandera1.setIcon(new ImageIcon(Resultados.class.getResource("")));
			//BANDERA2
			resultados.lblBandera4.setIcon(new ImageIcon(Resultados.class.getResource("")));
			//BANDERA3
			resultados.lblBandera6.setIcon(new ImageIcon(Resultados.class.getResource("")));
			
			resultados.banderaMaeso.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILjamaica.jpg")));
			resultados.fotoMaeso.setIcon(new ImageIcon(Resultados.class.getResource("/img/maesoTOP.jpeg")));
			resultados.porro.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILporritoniño.png")));
			
			//medalla oro
			resultados.label_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/oro.png")));
			//medalla plata
			resultados.label_3.setIcon(new ImageIcon(Resultados.class.getResource("")));
			//medalla bronce
			resultados.lblNewLabel_8.setIcon(new ImageIcon(Resultados.class.getResource("")));

		}
	}
}
