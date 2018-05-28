
import java.util.HashSet;

public abstract class Account implements InterestRate {
    public String name;
    private long socialSecurityNumber;

    private int accountType;
    private double accountBalance;
    public double rate;
    String accountNumber;

    public static HashSet<String> uniques = new HashSet<>();

    public Account(String name, String socialSecurityNumber, String accountBalance) {
        createUniqueID();
        setRate();
        this.name=name;
        this.accountBalance = Double.parseDouble(accountBalance);
        this.socialSecurityNumber = Long.parseLong(socialSecurityNumber);

    }

    public abstract void setRate();

    private String createUniqueID() {

        long socialSecurityNumber = getSocialSecurityNumber();
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(socialSecurityNumber / 100);

        String unique = "";

        do {
            unique = utilities.RandomNumber.lengthOfRandomNumber(5);
        } while (Account.uniques.contains(unique));


        unique += utilities.RandomNumber.lengthOfRandomNumber(3);

        stringBuffer.append(unique);

        return stringBuffer.toString();
    }


    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public void showInfo() {
        System.out.println("Name:" + name + "\nSocial Security Number:"
                + socialSecurityNumber +
                "\nAccount type:" + (accountType == 1 ? "Savings" : "Checking") +
                "\nAccount Balance :" + accountBalance +
                "\nAccount Rate:" + String.format("%.2f",rate));

    }

    public void trasfer(String toWhere, double amount) {

        if (withdraw(amount)) System.out.println(amount + " transfered to" + toWhere);


    }

    public void showBalance() {
        System.out.println("The remaining balance is : " + accountBalance);
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Amount deposited:" + amount);
        showBalance();
    }

    public boolean withdraw(double amount) {
        if (accountBalance - amount < 0.0) {
            System.out.println("Insufficient Funds!");
            showBalance();
            return false;
        }
        accountBalance -= amount;
        showBalance();
        return true;

    }

}
