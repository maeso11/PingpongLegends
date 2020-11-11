package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionPaco;
import vista.Jugadores;

public class ControladorPaco implements ActionListener{
	InformacionPaco paco = new InformacionPaco();

	public ControladorPaco(InformacionPaco paco) {
		super();
		this.paco = paco;
		this.paco.btnGrito.addActionListener(this);
		this.paco.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		paco.setTitle("Información Paco");
		paco.setLocationRelativeTo(null);
		paco.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == paco.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			paco.setVisible(false);
		
		}else if (e.getSource() == paco.btnGrito) {
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
