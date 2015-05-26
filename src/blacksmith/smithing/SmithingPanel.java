package blacksmith.smithing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class SmithingPanel extends JFrame implements ActionListener{
    private Shop shopscreen;
    private JPanel smithingPanel;
    private JPanel leftcenterPanel;
    private JLabel iconLabel;
    private JPanel personalPanel;
    private TitledBorder personalTitle;    
    private JLabel leftupLabel;
    private JPanel bottomLeft;
    private JPanel rightPanel;    
    private JLabel name;
    private JLabel level;
    private JLabel reputation;
    private JLabel skilled;
    private JLabel money;
    
    private TextArea text;
    
    private JButton blacksmithing;
    private JButton shop;
    private JButton store;
    private JPanel workPanel;
    
    
    public SmithingPanel() {
        super();
        this.setLayout(new BorderLayout());
        
        shopscreen = new Shop();
        
        smithingPanel = new JPanel();
        smithingPanel.setBounds(0, 0, 1280, 1080);
        
        bottomLeft = new JPanel(new GridLayout(3,1)); 
        
        rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        
        
        Icon Pic = new ImageIcon( getClass().getResource( "MIA_Blacksmith.jpg" ) );
        leftupLabel = new JLabel (Pic,JLabel.CENTER);
        //leftLabel.add(leftLabel);
        
        
       
        
        personalPanel = new JPanel(new GridLayout(5,1));  
        
        Icon Pic2 = new ImageIcon( getClass().getResource( "Teemo.jpg" ) );
        iconLabel = new JLabel (Pic2,JLabel.CENTER);
        bottomLeft.add(iconLabel);
        //personalPanel.setLocation(100, 100);
        Border blackLine = BorderFactory.createLineBorder(Color.black);  
        Font font = new Font(Font.MONOSPACED, Font.ITALIC, 18);        
        personalTitle = BorderFactory.createTitledBorder(blackLine,"Role Data", 0 ,0 , font, Color.BLUE);
        personalPanel.setBorder(personalTitle);
        
        
        
        name = new JLabel("Name:");      
        personalPanel.add(name);
        level = new JLabel("Level:");        
        personalPanel.add(level);
        reputation = new JLabel("Reputation:");        
        personalPanel.add(reputation);
        skilled = new JLabel("Skilled:");        
        personalPanel.add(skilled);
        money = new JLabel("Money:");        
        personalPanel.add(money);
        bottomLeft.add(personalPanel);
        
        workPanel = new JPanel(new GridLayout(1,3));
        blacksmithing = new JButton("Smithing");
        blacksmithing.addActionListener(this);
        workPanel.add(blacksmithing);
        shop = new JButton("Shop");
        shop.addActionListener(this);
        workPanel.add(shop);
        store = new JButton("Store");
        store.addActionListener(this);
        workPanel.add(store);
        
        
       // Icon Pic2 = new ImageIcon( getClass().getResource( "role_1.png" ) );
        rightPanel = new JPanel();
        
        
        
        //rightPanel.add(rightLabel);
        
        String s = "Welcome to Blacksmith!"; 
        text = new TextArea(s, 10, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
        text.setFont(new Font("Arial", Font.PLAIN,20)); 
        text.setSize(300,500);
        bottomLeft.add(text);
        
        
        //add(workPanel, BorderLayout.CENTER);
        //add(leftPanel, BorderLayout.WEST);
        //add(rightPanel, BorderLayout.CENTER);
        
        JSplitPane top = new JSplitPane(JSplitPane.VERTICAL_SPLIT,leftupLabel,bottomLeft);
        top.setOneTouchExpandable(true);
        top.setDividerLocation(200);
        
        JSplitPane bottom = new JSplitPane(JSplitPane.VERTICAL_SPLIT,workPanel,rightPanel);
        top.setOneTouchExpandable(true);
        top.setDividerLocation(200);
        
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,top,bottom);
        top.setOneTouchExpandable(true);
        top.setDividerLocation(200);
        
        add(split);
        
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blacksmithing){
            
        }else if(e.getSource()==shop){
            rightPanel=shopscreen.Shop();
        }else if(e.getSource()==store){
            
        }
    }
}
