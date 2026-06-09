
public class VolumeOfEarth {
    public static void main(String[] args){
        int radius = 6378;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
        double radiusMiles = radius* 0.621371;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of Earth in cubic kilometers is " + volume);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
    
}
