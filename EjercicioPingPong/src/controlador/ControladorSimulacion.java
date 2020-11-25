package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import vista.MenuUsuario;
import vista.Simulacion;

public class ControladorSimulacion implements ActionListener{
	
	Simulacion simulacion = new Simulacion();


	
	
	public ControladorSimulacion(Simulacion simulacion) {
		super();
		this.simulacion = simulacion;
		this.simulacion.btnVolver.addActionListener(this);
		this.simulacion.btnGenerar.addActionListener(this);
	}
	
	public void iniciar() {
		simulacion.setTitle("Ver Partido");
		simulacion.setLocationRelativeTo(null);
		simulacion.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == simulacion.btnVolver) {
			MenuUsuario mUsuario = new MenuUsuario();
			ControladorUser cUser = new ControladorUser(mUsuario);
			cUser.iniciar();
			simulacion.setVisible(false);	
		}else if(e.getSource() == simulacion.btnGenerar) {
			//Creamos un arraylist con los jugadores
			List<String> jugadores = new ArrayList<>(8);
			jugadores.add("Jesús");
			jugadores.add("Paco");
			jugadores.add("Víctor");
			jugadores.add("Maeso");
			jugadores.add("Manuel");
			jugadores.add("Tony");
			jugadores.add("Carlos");
			jugadores.add("David");
			
			
			//Utilizamos la clase random para generar números aleatorios
			Random random = new Random();

			while(jugadores.size() >= 1) {
				int index = random.nextInt(jugadores.size());
				if(simulacion.lblJugador1.getText().equals("Jugador 1") || simulacion.lblJugador1.getText().equals(jugadores.get(0))) {
					simulacion.lblJugador1.setText(jugadores.get(index));
				}else if (simulacion.lblJugador2.getText().equals("Jugador 2") || simulacion.lblJugador2.getText().equals(jugadores.get(1))) {
					simulacion.lblJugador2.setText(jugadores.get(index));
				}else if (simulacion.lblJugador3.getText().equals("Jugador 3") || simulacion.lblJugador3.getText().equals(jugadores.get(2))) {
					simulacion.lblJugador3.setText(jugadores.get(index));
				}else if (simulacion.lblJugador4.getText().equals("Jugador 4") || simulacion.lblJugador4.getText().equals(jugadores.get(3))) {
					simulacion.lblJugador4.setText(jugadores.get(index));
				}else if (simulacion.lblJugador5.getText().equals("Jugador 5") || simulacion.lblJugador5.getText().equals(jugadores.get(4))) {
					simulacion.lblJugador5.setText(jugadores.get(index));
				}else if (simulacion.lblJugador6.getText().equals("Jugador 6") || simulacion.lblJugador6.getText().equals(jugadores.get(5))) {
					simulacion.lblJugador6.setText(jugadores.get(index));
				}else if (simulacion.lblJugador7.getText().equals("Jugador 7") || simulacion.lblJugador7.getText().equals(jugadores.get(6))) {
					simulacion.lblJugador7.setText(jugadores.get(index));
				}else if (simulacion.lblJugador8.getText().equals("Jugador 8") || simulacion.lblJugador8.getText().equals(jugadores.get(7))) {
					simulacion.lblJugador8.setText(jugadores.get(index));
				}
				jugadores.remove(index);
			}
		}

	}


}
