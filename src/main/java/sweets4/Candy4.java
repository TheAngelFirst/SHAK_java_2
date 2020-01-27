package sweets4;

/**
 * @author ShiryaevAK
 */
public class Candy4 extends Sweetness4 {
    private String color;

    public Candy4(String name, int weightGrams, double price, String color) {
        super(name, weightGrams, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Леденцы " + super.toString() + ", цвет " + color + ".";
    }
}
