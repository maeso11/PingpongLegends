package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionVictor;
import vista.Jugadores;

public class ControladorVictor implements ActionListener{
	InformacionVictor victor = new InformacionVictor();

	public ControladorVictor(InformacionVictor victor) {
		super();
		this.victor = victor;
		this.victor.btnGrito.addActionListener(this);
		this.victor.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		victor.setTitle("Información Víctor");
		victor.setLocationRelativeTo(null);
		victor.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == victor.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			victor.setVisible(false);
		
		}else if (e.getSource() == victor.btnGrito) {
			try {
				
				Clip sonido = AudioSystem.getClip();
				sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/VICTOR.wav")));
				
				sonido.start();
				
		        } catch (Exception u) {
		            u.printStackTrace();
		        }
		}
		
	}
}
