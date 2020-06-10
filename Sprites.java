import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
//En esta clase para los personajes
public class Sprites extends JPanel{

	BufferedImage imagen;

	public Sprites(BufferedImage imagen)
	{
		this.imagen = imagen;
	}

	@Override
	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);

		g.setColor(Color.WHITE);
		g.fillOval(10,10,50,50);
		g.drawImage(imagen,0,0,64,64,null);
	}
}