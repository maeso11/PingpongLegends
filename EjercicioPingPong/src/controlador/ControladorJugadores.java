package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ModeloLogin;
import vista.Clasificacion;
import vista.InformacionCarlos;
import vista.InformacionDavid;
import vista.InformacionJesus;
import vista.InformacionMaeso;
import vista.InformacionManuel;
import vista.InformacionPaco;
import vista.InformacionTony;
import vista.InformacionVictor;
import vista.Jugadores;
import vista.Login;
import vista.MenuUsuario;
import vista.Resultados;
import vista.Simulacion;

public class ControladorJugadores implements ActionListener{

	Jugadores jugadores = new Jugadores();

	public ControladorJugadores(Jugadores jugadores) {
		super();
		this.jugadores = jugadores;
		this.jugadores.btnVolver.addActionListener(this);
		this.jugadores.btnCarlos.addActionListener(this);
		this.jugadores.btnDavid.addActionListener(this);
		this.jugadores.btnJesus.addActionListener(this);
		this.jugadores.btnMaeso.addActionListener(this);
		this.jugadores.btnManuel.addActionListener(this);
		this.jugadores.btnPaco.addActionListener(this);
		this.jugadores.btnTony.addActionListener(this);
		this.jugadores.btnVictor.addActionListener(this);
	}

	public void iniciar() {
		jugadores.setTitle("Equipos");
		jugadores.setLocationRelativeTo(null);
		jugadores.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == jugadores.btnVolver) {
			MenuUsuario mUser = new MenuUsuario();
			ControladorUser cUser = new ControladorUser(mUser);
			cUser.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnCarlos) {
			InformacionCarlos carlos = new InformacionCarlos();
			ControladorCarlos cCarlos = new ControladorCarlos(carlos);
			cCarlos.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnDavid) {
			InformacionDavid david = new InformacionDavid();
			ControladorDavid cDavid = new ControladorDavid(david);
			cDavid.iniciar();
			jugadores.setVisible(false);	
		}else if (e.getSource() == jugadores.btnJesus) {
			InformacionJesus jesus = new InformacionJesus();
			ControladorJesus cJesus = new ControladorJesus(jesus);
			cJesus.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnMaeso) {
			InformacionMaeso maeso = new InformacionMaeso();
			ControladorMaeso cMaeso= new ControladorMaeso(maeso);
			cMaeso.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnManuel) {
			InformacionManuel manuel = new InformacionManuel();
			ControladorManuel cManuel = new ControladorManuel(manuel);
			cManuel.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnPaco) {
			InformacionPaco paco = new InformacionPaco();
			ControladorPaco cPaco = new ControladorPaco(paco);
			cPaco.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnTony) {
			InformacionTony tony = new InformacionTony();
			ControladorTony cTony = new ControladorTony(tony);
			cTony.iniciar();
			jugadores.setVisible(false);
		}else if (e.getSource() == jugadores.btnVictor) {
			InformacionVictor victor = new InformacionVictor();
			ControladorVictor cVictor = new ControladorVictor(victor);
			cVictor.iniciar();
			jugadores.setVisible(false);
		}
		
	}

}
