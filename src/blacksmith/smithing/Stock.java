package blacksmith.smithing;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stock extends JPanel{
    private JLabel text;
    public Stock(){
        text = new JLabel("the bear");
        this.add(text);
    }
}
