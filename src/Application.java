
import java.util.*;

public class Application {

    public static List<Account> list=new ArrayList<>();

    public Application() {
        ArrayList<String[]> newCuostomers = utilities.ReadCSV.readRecords("C:\\Users\\Chiranjeev\\IdeaProjects\\BankApplication\\NewBankAccounts.csv");
        for(String [] s:newCuostomers){
            System.out.println("Debugging "+s[0]);
           list.add( inflateAccount(s[0],s[1],s[2],s[3]));
        }
    }


    private Account inflateAccount(String name, String socialSecurityNumber, String typeOfAccount, String balance) {
        Account ac;
        if(typeOfAccount.equals("Savings")) ac = new Savings(name,socialSecurityNumber,balance);
        else ac=new Checking(name,socialSecurityNumber,balance);
        return  ac;
    }


    public static void main(String args[]) {
        Application application = new Application();

        for(Account acc: list){
            acc.showInfo();
        }
    }
}
