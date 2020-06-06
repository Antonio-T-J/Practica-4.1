import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import java.util.logging.*;


class RunAway extends JFrame implements KeyListener{

	JPanel panel;
	ImageIcon fondo;
	JLabel panelFondo;

	//Primera ventana
	ImageIcon iTitulo_1;
	JLabel jlTitulo_1;
	ImageIcon iTitulo_2;
	JLabel jlTitulo_2;
	ImageIcon iStart;
	JButton btnInicio;

	JRadioButton nFacil;
	JRadioButton nDificil;

	public RunAway(){

		this.setTitle("RUN AWAY ...");
		this.setSize(450,700); //Tamano de la ventana (x, y)
		this.setLocationRelativeTo(null); //Ventana en el centro

		componentes();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void componentes(){

		colocarFondo();
		colocarEtiquetas();
		colocarBotones();
		colocarRadioBotones();

	}

	private void colocarFondo(){

		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		//Imagen de fondo para el panel
			/*try{
				fondo = new ImageIcon ("./imagenes/wallpaper.png");
				panelFondo = new JLabel();;
				panelFondo.setBounds(0,0,450,700);
				panelFondo.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(panelFondo.getWidth(),panelFondo.getHeight(),Image.SCALE_SMOOTH)));
			}catch(Exception e){
				System.out.println("Error al cargar fondo.");
			}

		panel.add(panelFondo);*/
	}

	private void colocarEtiquetas(){

		//Titulo de la primera ventana
		try{
			iTitulo_1 = new ImageIcon ("./imagenes/titulo_1.png");
			jlTitulo_1 = new JLabel();
			jlTitulo_1.setBounds(30,10,380,200); //(x, y, w, h)
			jlTitulo_1.setIcon(new ImageIcon(iTitulo_1.getImage().getScaledInstance(jlTitulo_1.getWidth(),jlTitulo_1.getHeight(),Image.SCALE_SMOOTH)));
			jlTitulo_1.setHorizontalAlignment(SwingConstants.CENTER);
		}catch(Exception e){
			System.out.println("Error al cargar imagen.");
		} 
		

		//2da parte titulo de la primera ventana
		
		try{
			iTitulo_2 = new ImageIcon ("./imagenes/police.png");
			jlTitulo_2 = new JLabel();
			jlTitulo_2.setBounds(150,240,150,40); //(x, y, w, h)
			jlTitulo_2.setIcon(new ImageIcon(iTitulo_2.getImage().getScaledInstance(jlTitulo_2.getWidth(),jlTitulo_2.getHeight(),Image.SCALE_SMOOTH)));
			jlTitulo_2.setHorizontalAlignment(SwingConstants.RIGHT);
		}catch(Exception e){
			System.out.println("Erro al cargan imagen.");
		}

		panel.add(jlTitulo_1);
		panel.add(jlTitulo_2);
	}

	private void colocarBotones(){
		
		//Boton de Start
		try{
			iStart = new ImageIcon("./imagenes/start.png");
			btnInicio = new JButton();
			btnInicio.setBounds(150,600,100,50); //(x, y, w, h)
			btnInicio.setOpaque(true);
			btnInicio.setIcon(new ImageIcon(iStart.getImage().getScaledInstance(btnInicio.getWidth(),btnInicio.getHeight(),Image.SCALE_SMOOTH)));
			btnInicio.setForeground(Color.BLACK);
		}catch(Exception e){
			System.out.println("Error al cargar imgaen de boton.");
		}

		panel.add(btnInicio); //LA IMAGEN DEL BOTON NO QUEDA CENTRADA Y EL FONDO NO SE PINTA DE NEGRO
	}

	public void colocarRadioBotones(){

		//Boton para nivel facil
		nFacil = new JRadioButton();
		nFacil.setBounds(50,500,200,50); //(x, y, w, h)
		nFacil.setEnabled(true);
		nFacil.setText("Nivel FACIL");
		nFacil.setFont(new Font("Times New Roman",0,18));
		panel.add(nFacil);

		//Boton para nivel dificil
		nDificil = new JRadioButton();
		nDificil.setBounds(50,550,200,50); //(x, y, w, h)
		nDificil.setEnabled(true);
		nDificil.setText("Nivel DIFICIL");
		nDificil.setFont(new Font("Times New Roman",0,18));
		panel.add(nDificil);
	}

	public void keyPressed(KeyEvent e){
	
	}

	public void keyReleased(KeyEvent e){
		
	}

	public void keyTyped(KeyEvent e){
	
	}

}	