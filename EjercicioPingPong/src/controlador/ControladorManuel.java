package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionManuel;
import vista.Jugadores;

public class ControladorManuel implements ActionListener{
	InformacionManuel manuel = new InformacionManuel();

	public ControladorManuel(InformacionManuel manuel) {
		super();
		this.manuel = manuel;
		this.manuel.btnGrito.addActionListener(this);
		this.manuel.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		manuel.setTitle("Información Manuel");
		manuel.setLocationRelativeTo(null);
		manuel.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == manuel.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			manuel.setVisible(false);
		
		}else if (e.getSource() == manuel.btnGrito) {
			try {
				
				Clip sonido = AudioSystem.getClip();
				sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/AUDIO.wav")));
				
				sonido.start();
				
		        } catch (Exception u) {
		            u.printStackTrace();
		        }
		}		
	}

}
