package Colors;
import Figures.Figure;

public class Red extends FillColor{
    public Red(Figure figure) {
        super(figure);
    }

    public void FillFigure() {
        System.out.print("Drawing red");
    }
}
