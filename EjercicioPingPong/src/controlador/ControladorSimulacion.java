package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import vista.MenuUsuario;
import vista.Simulacion;

public class ControladorSimulacion implements ActionListener {

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
		if (e.getSource() == simulacion.btnVolver) {
			MenuUsuario mUsuario = new MenuUsuario();
			ControladorUser cUser = new ControladorUser(mUsuario);
			cUser.iniciar();
			simulacion.setVisible(false);

		} else if (e.getSource() == simulacion.btnGenerar) {
			simulacion.lblJugador1.setText("Jugador 1");
			simulacion.lblJugador2.setText("Jugador 2");
			simulacion.lblJugador3.setText("Jugador 3");
			simulacion.lblJugador4.setText("Jugador 4");
			simulacion.lblJugador5.setText("Jugador 5");
			simulacion.lblJugador6.setText("Jugador 6");
			simulacion.lblJugador7.setText("Jugador 7");
			simulacion.lblJugador8.setText("Jugador 8");

			// Creamos un arraylist con los jugadores
			List<String> jugadores = new ArrayList<>(8);
			jugadores.add("Jesús");
			jugadores.add("Paco");
			jugadores.add("Víctor");
			jugadores.add("Maeso");
			jugadores.add("Manuel");
			jugadores.add("Tony");
			jugadores.add("Carlos");
			jugadores.add("David");

			// Utilizamos la clase random para generar números aleatorios
			Random random = new Random();

			// Recorremos el arraylist
			while (jugadores.size() >= 1) {

				// Genera el número aleatorio entre el 0 y el nº que queramos indicándolo en el
				// paréntesis
				int index = random.nextInt(jugadores.size());

				// Modificación de los distintos label por los nombres de los jugadores
				if (simulacion.lblJugador1.getText().equals("Jugador 1")
						|| simulacion.lblJugador1.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador1.setText(jugadores.get(index));
				} else if (simulacion.lblJugador2.getText().equals("Jugador 2")
						|| simulacion.lblJugador2.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador2.setText(jugadores.get(index));
				} else if (simulacion.lblJugador3.getText().equals("Jugador 3")
						|| simulacion.lblJugador3.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador3.setText(jugadores.get(index));
				} else if (simulacion.lblJugador4.getText().equals("Jugador 4")
						|| simulacion.lblJugador4.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador4.setText(jugadores.get(index));
				} else if (simulacion.lblJugador5.getText().equals("Jugador 5")
						|| simulacion.lblJugador5.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador5.setText(jugadores.get(index));
				} else if (simulacion.lblJugador6.getText().equals("Jugador 6")
						|| simulacion.lblJugador6.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador6.setText(jugadores.get(index));
				} else if (simulacion.lblJugador7.getText().equals("Jugador 7")
						|| simulacion.lblJugador7.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador7.setText(jugadores.get(index));
				} else if (simulacion.lblJugador8.getText().equals("Jugador 8")
						|| simulacion.lblJugador8.getText().equals(jugadores.get(index))) {
					simulacion.lblJugador8.setText(jugadores.get(index));
				}
				// Elimina el nombre del jugador que se haya modificado
				jugadores.remove(index);
			}
		}

	}

	/**
	 * Devuelve ganador 1º enfrentamiento
	 * 
	 * @param simulacion
	 * @return
	 */
	public String enfrentamiento1(Simulacion simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacion1.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacion2.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblJugador1.getText();
				} else {
					ganador = simulacion.lblJugador2.getText();
				}
			}
		}

		return ganador;
	}

}
