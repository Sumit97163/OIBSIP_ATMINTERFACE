package atm;
import java.util.Scanner;

class ATMInterface {
    public static void main(String[] args){
        int balance = 100000,withdraw,deposit;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdrew");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform:");

            // get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter money to be Withdrawn:");
                    
                withdraw = sc.nextInt();

                if(balance>=withdraw){
                    balance = balance-withdraw;
                    System.out.println("Please collect your Money");
                }else{
                    System.out.println("Insufficent Balance");
                }
                System.out.println("");
                    break;

                    case 2:
                    System.out.println("Enter money to be deposited");
                    deposit = sc.nextInt();

                    balance = balance+deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                        break;

                        case 3:
                        System.out.println("Balance:"+balance);
                        System.out.println("");
                        break;
                        case 4:
                        System.exit(0);
                // default:
                   
                    // break;
            }
            // sc.close();
        }
        // sc.close();
    }
    
}