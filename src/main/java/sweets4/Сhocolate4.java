package sweets4;

/**
 * @author ShiryaevAK
 */
public class Сhocolate4 extends Sweetness4 {
    private boolean white;

    public Сhocolate4(String name, int weightGrams, double price, boolean white) {
        super(name, weightGrams, price);
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    @Override
    public String toString() {
        return (white ? "Белый " : "Черый ") + "шоколад " + super.toString() + ".";
    }
}
