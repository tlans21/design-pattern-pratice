package square;

public class SquareHole {
    private double width;
    public SquareHole(double width) {
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }

    public boolean fits(SquarePeg peg){
        boolean result;
        result = (this.getWidth() >= peg.getWidth());
        return result;
    }
}
