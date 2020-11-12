package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionDavid;
import vista.Jugadores;

public class ControladorDavid implements ActionListener{
	InformacionDavid david = new InformacionDavid();

	public ControladorDavid(InformacionDavid david) {
		super();
		this.david = david;
		this.david.btnGrito.addActionListener(this);
		this.david.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		david.setTitle("Información David");
		david.setLocationRelativeTo(null);
		david.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == david.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			david.setVisible(false);
		
		}else if (e.getSource() == david.btnGrito) {
			try {
				
				Clip sonido = AudioSystem.getClip();
				sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/david.wav")));
				
				sonido.start();
				
		        } catch (Exception u) {
		            u.printStackTrace();
		        }
		}
		
	}

}
