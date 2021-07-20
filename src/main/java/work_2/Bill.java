package work_2;

public class Bill extends Person{

    int amount;

    public Bill() {

    }

    public Bill(String name, String family, String phone, int amount) {
        super(name, family, phone);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
