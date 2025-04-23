package Colors;
import Figures.Figure;

public class Blue extends FillColor{
    public Blue(Figure figure) {
        super(figure);
    }

    public void FillFigure() {
        System.out.print("Drawing blue");
    }
}
