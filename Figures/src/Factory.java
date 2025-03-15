public class Factory {

    //Returns an object with the type
    public Figure getInstance(String select){//it has to be "comida" type cause it return an implement of that class
        switch (select){
            case "a":
                return new Circle();
            case "b":
                return new Square();
            case "c":
                return new Rectangle();
            case "d":
                return new Triangle();
            case "e":
                return new Oval();
            default:
                return null;
        }
    }

}
