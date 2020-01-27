package sweets4;

/**
 * @author ShiryaevAK
 */
public class Jellybean4 extends Sweetness4 {
    private String taste;

    public Jellybean4(String name, int weightGrams, double price, String taste) {
        super(name, weightGrams, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Мармелад " + super.toString() + ", вкус " + taste + ".";
    }
}
