/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class ImagenInicio extends JPanel{
    private BufferedImage imagen;
    private String imagenFileName = "";
    public void paintComponent(Graphics g){
       super.paintComponent(g);
        try {
            imagenFileName = "quienesquien.gif";
            imagen = ImageIO.read(new File(imagenFileName));
        }
        catch (IOException e) {
            System.out.println("Problemas leyendo la imagen '" + this.imagenFileName + "'.");
            System.out.println("Motivo: " + e.getLocalizedMessage());
        }
        
        g.drawImage(imagen, 200, 200, 1000, 750, this);
    }
}
