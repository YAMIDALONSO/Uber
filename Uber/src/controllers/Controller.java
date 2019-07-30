package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Uber;
import views.WindowUber;

public class Controller implements ActionListener{

    private Uber uber;
    private WindowUber windowUber;
    
    public Controller() {
        uber = new Uber();
        uber.registorDriver(0, true);
        windowUber = new WindowUber(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Events.valueOf(e.getActionCommand())) {
            case REQUEST_SERVICE:
                requestService();
                break;
        }
    }

    private void requestService() {
        uber.requestService(windowUber.getXCoordinate(), windowUber.getYCoordinate());
        windowUber.showCost(uber.collectTrip());
    }
}