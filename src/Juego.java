import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Juego extends JFrame implements Runnable{
	//dimensiones de la iterfaz del juego
	public static final int WIDTH = 800, HEIGHT = 800;
	private Canvas canvas;
	private Thread hilo;
	private boolean running = false; //booleano para correr o parar el programa en el bucle while
	//objetos para dibujar e importar con ctrl+shift+o
	
	private BufferStrategy bs;
	private Graphics graf;
	//para controlar la cantidad de fotogramas por sg.
	private final int FPS = 60;
	private double TARGETIME = 1000000000/FPS; //para controlar el tiempo en nanosg
	private double delta = 0;
	private int FPS_ = FPS;
	
	public Juego() {
		setTitle("Universo Marvel");
		setSize(WIDTH, HEIGHT);
		//para poder cerrar la ventana cuando presionemos la X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setFocusable(true);
		
		add(canvas);
		
	}
	public static void main(String[] args) {
		new Juego().start();
	}
	
	int x = 0; double y = 0.2;
	private void actualizar() {
		x ++;
	}
	private void dibujar() {
		bs = canvas.getBufferStrategy();
		if(bs == null) {
			canvas.createBufferStrategy(3);
			return;
		}
		graf = bs.getDrawGraphics();
		//Comienzo del dibujo
		//graf.drawRect(HEIGHT, HEIGHT, WIDTH, HEIGHT);
		graf.clearRect(0, 0, WIDTH, HEIGHT);
		//hacia donde se mueve el objeto con un contador dentro de actualizar
		graf.drawRect(x, x, 50, 50);
		//graf.clearRect(0, 0, WIDTH, HEIGHT);
		graf.drawRect(700-x, 700-x, 50, 50);
		graf.drawRect(x, 700-x, 50, 50);
		graf.drawRect(700-x, x, 50, 50);
		//graf.draw3DRect(20, 30, 10, 50, running);
		//Fin del dibujo
		graf.dispose();
		bs.show();
	}
	@Override
	public void run() {
		
		long now = 0;
		long lastTime = System.nanoTime();
		int newPar = 0; //parameto nuevo
		long time = 0;
		
		//ciclo pricipal con bucle while
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime)/TARGETIME;
			lastTime = now;
			if(delta >= 1) {
				actualizar();
				dibujar();
				delta --;
				newPar ++;
			}
			//para cuando haya pasado 1sg del fotograma
			if(time >= 1000000000) {
				FPS_ = newPar;
				newPar = 0;
			}
		}
		stop();
	}
	private void start() {
		hilo = new Thread(this);
		hilo.start();
		running = true;
	}
	private void stop() {
		try {
			hilo.join();
			running = false;
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}