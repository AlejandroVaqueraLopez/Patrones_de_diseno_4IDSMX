package Colors;
import Figures.Figure;

public class Green extends FillColor{
    public Green(Figure figure) {
        super(figure);
    }

    public void FillFigure() {
        System.out.print("Drawing green");
    }
}
