/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Lucas
 */
public class MenuDificultad extends JMenu{
    private JMenu menu;
    private JMenuItem item, item2, item3, item4;
    
    public MenuDificultad(){
        super("Dificultad");
        item = new JMenuItem("Facil");
        item2 = new JMenuItem("Media");
        item3 = new JMenuItem("Dificil");
        item4 = new JMenuItem("Dificultad personalizada");
        
        add(item);
        add(item2);
        add(item3);
        add(item4);

    }
    
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item2.addActionListener(actionListener);
        item3.addActionListener(actionListener);
        item4.addActionListener(actionListener);
    }
}
