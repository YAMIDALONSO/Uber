package views;

import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class WindowUber extends JFrame {

    private static final String TITLE = "Servicio de Uber";
    private static final String ICON = "/data/Icon.png";

    private PanelHeader panelHeader;
    private PanelMap panelMap;

    public WindowUber(ActionListener controller) {
        setTitle(TITLE);
        setIconImage(new ImageIcon(getClass().getResource(ICON)).getImage());
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panelHeader = new PanelHeader(controller);
        add(panelHeader, BorderLayout.PAGE_START);

        panelMap = new PanelMap();
        add(panelMap, BorderLayout.CENTER);

        setVisible(true);
    }

    public int getXCoordinate() {
        return panelHeader.getXCoordinate();
    }

    public int getYCoordinate() {
        return panelHeader.getYCoordinate();
    }

    public void showCost(double cost) {
        panelHeader.showCost(cost);
    }
}
