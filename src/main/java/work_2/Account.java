package work_2;

import java.util.Scanner;

public class Account extends Bill{

    public Account(String name, String family, String phone, int amount) {
        super(name, family, phone, amount);
    }

    public Account() {
    }

    @Override
    public String toString() {
        return  name + " "+ family + " " + phone + " " + amount;
    }
}
