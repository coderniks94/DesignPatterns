public class ShapeFactory implements AbstractFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        else if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        else return null;
    }
}
