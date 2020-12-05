package controladorAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import vistaAdmin.MenuAdmin;
import vistaAdmin.SimulacionAdmin;

public class ControladorSimulacionAdmin implements ActionListener {

	SimulacionAdmin simulacion = new SimulacionAdmin();

	public ControladorSimulacionAdmin(SimulacionAdmin simulacion) {
		super();
		this.simulacion = simulacion;
		this.simulacion.btnVolver.addActionListener(this);
		this.simulacion.btnGenerar.addActionListener(this);
		this.simulacion.btnSimulacion1.addActionListener(this);
		this.simulacion.btnSimulacion2.addActionListener(this);
		this.simulacion.btnSimulacion3.addActionListener(this);
		this.simulacion.btnSimulacion4.addActionListener(this);
		this.simulacion.btnSimulacionSemi1.addActionListener(this);
		this.simulacion.btnSimulacionSemi2.addActionListener(this);
		this.simulacion.btnSimulacionFinal.addActionListener(this);

	}

	public void iniciar() {
		simulacion.setTitle("Ver Partido");
		simulacion.setLocationRelativeTo(null);
		simulacion.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == simulacion.btnVolver) {
			MenuAdmin mUsuario = new MenuAdmin();
			ControladorAdmin cUser = new ControladorAdmin(mUsuario);
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
		} else if (e.getSource() == simulacion.btnSimulacion1) {
			simulacion.lblSemifinalista1.setText(enfrentamiento1(simulacion));
		} else if (e.getSource() == simulacion.btnSimulacion2) {
			simulacion.lblSemifinalista2.setText(enfrentamiento2(simulacion));
		} else if (e.getSource() == simulacion.btnSimulacion3) {
			simulacion.lblSemifinalista3.setText(enfrentamiento3(simulacion));
		} else if (e.getSource() == simulacion.btnSimulacion4) {
			simulacion.lblSemifinalista4.setText(enfrentamiento4(simulacion));
		} else if (e.getSource() == simulacion.btnSimulacionSemi1) {
			simulacion.lblFinalista1.setText(semi1(simulacion));
		} else if (e.getSource() == simulacion.btnSimulacionSemi2) {
			simulacion.lblFinalista2.setText(semifinal2(simulacion));
		} else if (e.getSource() == simulacion.btnSimulacionFinal) {
			simulacion.lblGanador.setText(granFinal(simulacion));
		}

	}

	/**
	 * Devuelve ganador 1º enfrentamiento
	 * 
	 * @param simulacion
	 * @return
	 */
	public String enfrentamiento1(SimulacionAdmin simulacion) {
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

	/**
	 * Devuelve ganador 2º enfrentamiento
	 * 
	 * @param simulacion
	 * @return
	 */
	public String enfrentamiento2(SimulacionAdmin simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacion3.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacion4.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblJugador3.getText();
				} else {
					ganador = simulacion.lblJugador4.getText();
				}
			}
		}

		return ganador;
	}

	/**
	 * Devuelve ganador 3º enfrentamiento
	 * 
	 * @param simulacion
	 * @return
	 */
	public String enfrentamiento3(SimulacionAdmin simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacion5.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacion6.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblJugador5.getText();
				} else {
					ganador = simulacion.lblJugador6.getText();
				}
			}
		}

		return ganador;
	}

	/**
	 * Devuelve ganador 4º enfrentamiento
	 * 
	 * @param simulacion
	 * @return
	 */
	public String enfrentamiento4(SimulacionAdmin simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacion7.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacion8.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblJugador7.getText();
				} else {
					ganador = simulacion.lblJugador8.getText();
				}
			}
		}

		return ganador;
	}

	/**
	 * Devuelve ganador 1º semifinal
	 * 
	 * @param simulacion
	 * @return
	 */
	public String semi1(SimulacionAdmin simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacionSemi1.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacionSemi2.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblSemifinalista1.getText();
				} else {
					ganador = simulacion.lblSemifinalista2.getText();
				}
			}
		}

		return ganador;
	}

	/**
	 * Devuelve ganador 2ª semifinal
	 * 
	 * @param simulacion
	 * @return
	 */
	public String semifinal2(SimulacionAdmin simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacionSemi3.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacionSemi4.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblSemifinalista3.getText();
				} else {
					ganador = simulacion.lblSemifinalista4.getText();
				}
			}
		}

		return ganador;
	}

	/**
	 * Devuelve ganador de la final
	 * 
	 * @param simulacion
	 * @return
	 */
	public String granFinal(SimulacionAdmin simulacion) {
		String ganador = "";
		int puntos1 = 0;
		int puntos2 = 0;
		int puntua;
		boolean fin = false;

		while (fin != true) {
			puntua = (1 + (int) (Math.random() * 2));
			if (puntua == 1) {
				puntos1 = puntos1 + 1;
				simulacion.txtPuntuacionFinal1.setText(String.valueOf(puntos1));
			} else {
				puntos2 = puntos2 + 1;
				simulacion.txtPuntuacionFinal2.setText(String.valueOf(puntos2));
			}

			if (puntos1 == 7 | puntos2 == 7) {
				fin = true;
				if (puntos1 == 7) {
					ganador = simulacion.lblFinalista1.getText();
				} else {
					ganador = simulacion.lblFinalista2.getText();
				}
			}
		}

		return ganador;
	}

}
