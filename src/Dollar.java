/**
 * Created by admin on 13/10/15.
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int times(int multiplier) {
        amount *= multiplier;
        return amount;
    }
}