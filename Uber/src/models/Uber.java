package models;

public class Uber{
    
    public static final int VALUE_FOR_KM = 7520;
    
    private double userCoordinateInX;
    private double userCoordinateInY;
    private double driverCoordinateInX;
    private double driverCoordinateInY;
    
    public void registorDriver(int travelsNumber, boolean isAvailable){
        driverCoordinateInX = (Math.random() * 10);
        driverCoordinateInY = (Math.random() * 10);
    }
    
    public void requestService(int x, int y){
        userCoordinateInX = x;
        userCoordinateInY = y;
    }
    
    private double calculateDistance(){
        return Math.sqrt(Math.pow(driverCoordinateInX - userCoordinateInX,2) + Math.pow(driverCoordinateInY - userCoordinateInY,2));
    }
    
    public double collectTrip(){
        return calculateDistance() * VALUE_FOR_KM;
    }
}