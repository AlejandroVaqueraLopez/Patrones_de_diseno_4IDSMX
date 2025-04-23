import Colors.Blue;
import Colors.Red;
import Figures.Circle;
import Figures.Triangle;

public class Main {
    //it helps to connect 2 class structures
    public static void main(String[] args) {
        Triangle figure = new Triangle();
        figure.draw();
        Blue color = new Blue(figure);
        color.FillFigure();

        System.out.println("\n");
        Circle figure2 = new Circle();
        figure2.draw();
        Red color2 = new Red(figure2);
        color2.FillFigure();

    }
}