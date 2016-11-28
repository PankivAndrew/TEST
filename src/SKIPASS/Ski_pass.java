package SKIPASS;

/**
 * Created by Pankiv on 28.11.2016.
 */
public class Ski_pass {
    protected int Amount_of_passes;
    protected boolean Card_for_days;
    protected int Amount_of_days;
    protected int Price;
    protected long Number;

    public Ski_pass(int amount_of_passes, boolean card_for_days, int amount_of_days, int price,long number) {
        Amount_of_passes = amount_of_passes;
        Card_for_days = card_for_days;
        Amount_of_days = amount_of_days;
        Price = price;
        Number = number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public long getNumber() {

        return Number;
    }

    public int getAmount_of_passes() {
        return Amount_of_passes;
    }

    public boolean isCard_for_days() {
        return Card_for_days;
    }

    public int getAmount_of_days() {
        return Amount_of_days;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPrice() {

        return Price;
    }

    public void setAmount_of_passes(int amount_of_passes) {
        Amount_of_passes = amount_of_passes;
    }

    public void setCard_for_days(boolean card_for_days) {
        Card_for_days = card_for_days;
    }

    public void setAmount_of_days(int amount_of_days) {
        Amount_of_days = amount_of_days;
    }
}
