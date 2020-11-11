package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionJesus;
import vista.Jugadores;

public class ControladorJesus implements ActionListener{
	InformacionJesus jesus = new InformacionJesus();

	public ControladorJesus(InformacionJesus jesus) {
		super();
		this.jesus = jesus;
		this.jesus.btnGrito.addActionListener(this);
		this.jesus.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		jesus.setTitle("Información Jesús");
		jesus.setLocationRelativeTo(null);
		jesus.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jesus.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			jesus.setVisible(false);
		
		}else if (e.getSource() == jesus.btnGrito) {
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
