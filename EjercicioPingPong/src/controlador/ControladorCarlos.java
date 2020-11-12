package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionCarlos;
import vista.Jugadores;
import vista.Simulacion;

public class ControladorCarlos implements ActionListener {
	InformacionCarlos carlos = new InformacionCarlos();

	public ControladorCarlos(InformacionCarlos carlos) {
		super();
		this.carlos = carlos;
		this.carlos.btnVolver.addActionListener(this);
		this.carlos.btnGrito.addActionListener(this);
	}
	
	public void iniciar() {
		carlos.setTitle("Información Carlos");
		carlos.setLocationRelativeTo(null);
		carlos.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == carlos.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			carlos.setVisible(false);
		
		}else if (e.getSource() == carlos.btnGrito) {
			try {
				
				Clip sonido = AudioSystem.getClip();
				sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/carlos.wav")));
				
				sonido.start();
				
		        } catch (Exception u) {
		            u.printStackTrace();
		        }
		}
		
	}
	

}
