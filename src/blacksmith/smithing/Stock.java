package blacksmith.smithing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stock extends JPanel implements ActionListener{
    
    private JLabel text;
    private JPanel Sower;
    private JButton Mineral;
    private JButton Equipment;
    private JButton Katana;
    private JLabel Word;
    
    public Stock(){
        text = new JLabel("the bear");
        this.add(text);
        
        
        Mineral = new JButton("Mineral");
        Equipment = new JButton("Equipment");
        Katana = new JButton("Katana");
        Word = new JLabel("Stock");
        
//        Mineral.setBounds(40,40,50,50);
//        Equipment.setBounds(100,100,50,50);
//        Katana.setBounds(150,150,40,40);
        
        Mineral.addActionListener(this);
        Equipment.addActionListener(this);
        Katana.addActionListener(this);
        
        add(Mineral);
        add(Equipment);
        add(Katana);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
