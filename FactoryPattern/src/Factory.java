public class Factory {

   //Returns an object with the type
    public Comida getInstance(String select){//it has to be "comida" type cause it return an implement of that class
        switch (select){
            case "a":
                return new Pizza();
            case "b":
                return new Taco();
            case "c":
                return new Ceviche();
            default:
                return null;
        }
    }

}
