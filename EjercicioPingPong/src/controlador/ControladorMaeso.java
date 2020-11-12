package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import vista.InformacionMaeso;
import vista.Jugadores;

public class ControladorMaeso implements ActionListener{
	InformacionMaeso maeso = new InformacionMaeso();

	public ControladorMaeso(InformacionMaeso maeso) {
		super();
		this.maeso = maeso;
		this.maeso.btnGrito.addActionListener(this);
		this.maeso.btnVolver.addActionListener(this);
	}
	
	public void iniciar() {
		maeso.setTitle("Información Maeso");
		maeso.setLocationRelativeTo(null);
		maeso.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == maeso.btnVolver) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			maeso.setVisible(false);
		
		}else if (e.getSource() == maeso.btnGrito) {
			try {
				
				Clip sonido = AudioSystem.getClip();
				sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/maeso.wav")));
				
				sonido.start();
				
		        } catch (Exception u) {
		            u.printStackTrace();
		        }
		}
		
	}

}
