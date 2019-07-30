package views;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMap extends JPanel{
    
    private static final String MAP_IMAGE = "/data/Tunja.png";
    
    private JLabel jlMap;

    public PanelMap() {
        jlMap = new JLabel(new ImageIcon(getClass().getResource(MAP_IMAGE)));
        add(jlMap);
    }
}