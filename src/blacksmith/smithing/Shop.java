package blacksmith.smithing;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shop extends JPanel{
    
    private JLabel iconLabel;
    public Shop(){
        Icon Pic2 = new ImageIcon( getClass().getResource( "bear.jpg" ) );
        iconLabel = new JLabel (Pic2,JLabel.CENTER);
        add(iconLabel);
    }

    
}
