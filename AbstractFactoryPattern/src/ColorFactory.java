public class ColorFactory implements AbstractFactory {
    public Color getColor(String colorType){
        if(colorType.equalsIgnoreCase("RED")) return new Red();
        else if(colorType.equalsIgnoreCase("BLUE")) return new Blue();
        else return null;
    }
}
