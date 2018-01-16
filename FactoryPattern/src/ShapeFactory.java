public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        else if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        else return null;
    }
}
