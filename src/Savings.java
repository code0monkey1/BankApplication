
public class Savings extends Account {

    public static int COUNT=100;
    private int safetyID;
    private int accessCode;

    public Savings(String name,String socialSecurityNumber, String accountbalance) {
        super(name,socialSecurityNumber, accountbalance);
        setSafetyID();
        setAccessCode();

        accountNumber="1"+accountNumber;
    }

    public void setSafetyID() {
        this.safetyID = COUNT++;
    }

    public void setAccessCode() {
        this.accessCode = Integer.parseInt(utilities.RandomNumber.lengthOfRandomNumber(4));
    }

    public int getSafetyID() {
        return safetyID;
    }
   public void setRate(){
        rate=getBaseRate()-0.25;
   }
    public int getAccessCode() {
        return accessCode;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("The saftey ID is: "+getSafetyID()+
                "\n The accessCode is: "+
                getAccessCode());
        System.out.println("**********************");
    }


}
