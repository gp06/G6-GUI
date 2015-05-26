package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import blacksmith.smithing.SmithingPanel;
import blacksmith.upstep.UpStepPanel;

public class JTabbedPaneFrame extends JFrame{
    public JTabbedPaneFrame(){
        super("Blacksmith");
        JTabbedPane tabbedPanel = new JTabbedPane();
        
    //    UpStepPanel upstepPanel = new UpStepPanel();
    //    tabbedPanel.addTab( "�ɶ�", null, upstepPanel, "First Panel" );
        
        SmithingPanel smithingPanel = new SmithingPanel();
       
        tabbedPanel.addTab( "��y", null, smithingPanel, "Scecond Panel" );
        
        add( tabbedPanel );
    }
}
