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
public class Menu extends JMenuBar{
    private JMenu menu;
    private JMenuItem item, item2, item3;
    
    public Menu(){
        menu = new JMenu("Configuracion");
        item = new JMenuItem("Cambiar nivel");
        item2 = new JMenuItem("Nivel personalizado");
        item3 = new JMenuItem("Salir");
        
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        add(menu);
    }
    
    public void setActionListener(ActionListener actionListener) {
        item.addActionListener(actionListener);
        item2.addActionListener(actionListener);
        item3.addActionListener(actionListener);
    }
}
