package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionTony;
import vista.Jugadores;

public class ControladorTony implements ActionListener{
	InformacionTony tony = new InformacionTony();

	public ControladorTony(InformacionTony tony) {
		super();
		this.tony = tony;
		this.tony.btnGrito.addActionListener(this);
		this.tony.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		tony.setTitle("Información Tony");
		tony.setLocationRelativeTo(null);
		tony.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tony.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			tony.setVisible(false);
		
		}else if (e.getSource() == tony.btnGrito) {
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
