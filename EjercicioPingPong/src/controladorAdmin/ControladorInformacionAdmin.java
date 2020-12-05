package controladorAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;

import connection.EstableceConexion;
import vistaAdmin.InformacionJugadorAdmin;
import vistaAdmin.JugadoresAdmin;

public class ControladorInformacionAdmin implements ActionListener {
	InformacionJugadorAdmin infoJug = new InformacionJugadorAdmin();
	EstableceConexion conn = new EstableceConexion();

	public ControladorInformacionAdmin(InformacionJugadorAdmin infoJug) {
		super();
		this.infoJug = infoJug;
		this.infoJug.btnVolver.addActionListener(this);
		this.infoJug.btnGrito.addActionListener(this);
		this.infoJug.btnActualizar.addActionListener(this);
	}

	public void iniciar() {
		infoJug.setTitle("INFORMACIÓN JUGADORES");
		infoJug.setLocationRelativeTo(null);
		infoJug.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Clip sonido = null;

		try {
			sonido = AudioSystem.getClip();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Boton Volver
		if (e.getSource() == infoJug.btnVolver) {
			JugadoresAdmin jugadores = new JugadoresAdmin();
			ControladorJugadoresAdmin cJugadores = new ControladorJugadoresAdmin(jugadores);

			cJugadores.iniciar();
			infoJug.setVisible(false);
		}

		// Boton Grito
		if (e.getSource() == infoJug.btnGrito) {
			switch (infoJug.lblNombre.getText()) {
			case "CARLOS":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/carlos.wav")));

					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "VICTOR":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/VICTOR.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "JESUS":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/jesus.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "PACO":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/paco.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "DAVID":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/david.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "MANUEL":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/manuel.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "ANTONIO":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/maeso.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;
			case "ANTONIO EDUARDO":
				try {

					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/tony.wav")));
					sonido.start();

				} catch (Exception u) {
					u.printStackTrace();
				}
				break;

			}
		}
		// Actualiza los datos a la base de datos
		if(e.getSource() == infoJug.btnActualizar) {
			try {
				conn.actualizaJugador(infoJug.txtAlias.getText(), Integer.valueOf(infoJug.txtEdad.getText()), infoJug.txtCiudad.getText(), infoJug.txtLateralidad.getText(), infoJug.txtGolpeEstrella.getText(), infoJug.txtAtaque.getText(), infoJug.txtDefensa.getText(), infoJug.lblNombre.getText());
				JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
			} catch (NumberFormatException | ClassNotFoundException | IOException | SQLException ex) {
				ex.printStackTrace();
			}
		}

	}
}

