package blacksmith.smithing;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Smithing extends JPanel{
    private JLabel role;
    private JPanel rolePanel;
    
    public Smithing(){    
        
        rolePanel = new JPanel();
        
        Icon Pic = new ImageIcon( getClass().getResource( "role_1.png"));
        role = new JLabel(Pic);
        role.setLocation(500, 500);
        rolePanel.add(role);
        rolePanel.setBackground(Color.white);
        
        add(rolePanel);
    }
    
}
