public class Checking extends Account {
    private static long COUNT = 100000000000l;
    private long cardNumber;
    private int pin;

    public Checking(String name, String socialSecurityNumber, String accountbalance) {
        super(name, socialSecurityNumber, accountbalance);
        accountNumber = "2" + accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = COUNT++;
    }

    public int getPin() {
        return pin;
    }

    public void setRate() {
        rate = (getBaseRate() * 0.15);
    }

    public void setPin() {
        this.pin = Integer.parseInt(utilities.RandomNumber.lengthOfRandomNumber(4));
    }

    public void showInfro() {
        super.showInfo();
        System.out.println("The card number is: " +
                getCardNumber() + "\nThe pin is: " +
                getPin());
        System.out.println("**********************");
    }

}
