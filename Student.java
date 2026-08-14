import java.util.Scanner;

class bankOperation{
    double balance = 10000.00;

    String type[] = new String[10];
    int amount[] = new int[10];

    public void checkBalance(){
        System.out.print("Current Balance: " + balance);
    }
    public void depositMoney() {
        Scanner scan = new Scanner(System.in);
        double depoMoney;
        System.out.print("Enter the amount you want to deposit: ");
        depoMoney = scan.nextDouble();
        System.out.println("Congratulations you have deposited "+ depoMoney);
        balance += depoMoney;
        System.out.print("Your updated balance is: " + balance);
    }
    public void withDraw() {
        Scanner scan = new Scanner(System.in);
        double drawMoney;
        System.out.print("Enter the amount you want to withdraw: ");
        drawMoney = scan.nextDouble();
        if (drawMoney <= balance){
            balance -= drawMoney;
            System.out.print("You have withdrawn: " + drawMoney + "\n");
            System.out.print("\nYour new current balance is: " + balance);
        }
        else{
            System.out.println("\nInsufficient balance");
        }
    }
}

public class Student {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        bankOperation opr = new bankOperation();
        //initilaize the variables
        int input;

        //Ask for the inputs
        do{
        System.out.println("\n===== MINI ATM =====");
        System.out.println("\nChoose the option:\n1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Transaction History\n5. Exit");
        input = scan.nextInt();

        //Check the options
        switch(input){
            case 1:
                opr.checkBalance();
                break;
            case 2:
                opr.depositMoney();
                break;
            case 3:
                opr.withDraw();
                break;
            case 4:
                System.out.print("Transaction History");
                break;
            case 5:
                System.out.print("Exit");
                break;
            default:
                System.out.print("Option not specified");
        }
        }while (input != 5);
    }
}
