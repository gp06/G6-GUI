package blacksmith.smithing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shop extends JPanel{
    
    
    private JPanel buttonPanel;
    private JButton Mineral;
    private JButton Equipment;
    private JButton Katana;
    public Shop(){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        Icon pic1 = new ImageIcon(getClass().getResource("diamond.jpg"));
        Icon pic2 = new ImageIcon(getClass().getResource("weapon.jpg"));
        Icon pic3 = new ImageIcon(getClass().getResource("sword.jpg"));
        
        Mineral = new JButton("Mineral",pic1);
        Equipment = new JButton("Equipment",pic2);
        Katana = new JButton("Katana",pic3);
        
        buttonPanel.add(Mineral);
        buttonPanel.add(Equipment);
        buttonPanel.add(Katana);
        
        
        Mineral.setBackground(Color.WHITE);
        Equipment.setBackground(Color.WHITE);
        Katana.setBackground(Color.WHITE);
        
        
        add(buttonPanel);
    }

    
}
