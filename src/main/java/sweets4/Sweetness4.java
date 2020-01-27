package sweets4;

/**
 * @author ShiryaevAK
 */
public abstract class Sweetness4 {
    private String name;
    private int weightGrams;
    private double price;

    public Sweetness4(String name, int weightGrams, double price) {
        this.name = name;
        this.weightGrams = weightGrams;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightGrams() {
        return weightGrams;
    }

    public void setWeightGrams(int weightGrams) {
        this.weightGrams = weightGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\"" + name + "\", " + weightGrams + " грамм, " + price + " рублей";
    }

}
