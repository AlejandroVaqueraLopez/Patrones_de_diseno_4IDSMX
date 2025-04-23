package Colors;
import Figures.Figure;

public abstract class FillColor {
    protected Figure figure;

    protected FillColor(Figure figure){
        this.figure = figure;
    }
    public abstract void FillFigure();
}
