package views;

import controllers.Events;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class PanelHeader extends JPanel {

    public static final String COORDINATE_Y = "Ingrese la Coordenada en Y: ";
    public static final String COORDINATE_X = "Ingrese la Coordenada en X: ";
    public static final Font UBER_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 26);
    public static final String REQUEST_UBER = "Solicitar Uber";
    public static final String COSTO = "Sin Costo";
    
    private JLabel jlCoordinateX;
    private JLabel jlCoordinateY;
    private JSpinner jsCoordinateX;
    private JSpinner jsCoordinateY;
    private JButton jbRequestService;
    private JLabel jlTravelCost;

    public PanelHeader(ActionListener controller) {

        jlCoordinateX = new JLabel(COORDINATE_X);
        jlCoordinateX.setFont(UBER_FONT);
        add(jlCoordinateX);

        jsCoordinateX = new JSpinner();
        jsCoordinateX.setFont(UBER_FONT);
        add(jsCoordinateX);

        jlCoordinateY = new JLabel(COORDINATE_Y);
        jlCoordinateY.setFont(UBER_FONT);
        add(jlCoordinateY);

        jsCoordinateY = new JSpinner();
        jsCoordinateY.setFont(UBER_FONT);
        add(jsCoordinateY);

        jbRequestService = new JButton(REQUEST_UBER);
        jbRequestService.setFont(UBER_FONT);
        jbRequestService.setBackground(Color.CYAN);
        jbRequestService.addActionListener(controller);
        jbRequestService.setActionCommand(Events.REQUEST_SERVICE.toString());
        add(jbRequestService);
        
        jlTravelCost = new JLabel(COSTO);
        jlTravelCost.setFont(UBER_FONT);
        add(jlTravelCost);
    }

    public int getXCoordinate() {
        return (int) jsCoordinateX.getValue();
    }

    public int getYCoordinate() {
        return (int) jsCoordinateY.getValue();
    }

    public void showCost(double cost) {
        jlTravelCost.setText("Son " + cost + " pesos");
    }
}