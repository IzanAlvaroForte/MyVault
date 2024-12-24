import java.util.Scanner;
import java.util.InputMismatchException;

public class OOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bankaccount bankAcc = new Bankaccount();
        Thesystem system = new Thesystem();

        System.out.print("Account name: ");
        String accName = scan.nextLine();
        bankAcc.setAccountHolder(accName);
        bankAcc.setBalance(12057);
        system.setBalance(bankAcc.getBalance());

        System.out.println("Greetings " + bankAcc.getAccountHolder());
        System.out.println("Your current balance is " + bankAcc.getBalance() + " pesos.");

        boolean systemRunning = true;

        while (systemRunning) {
            System.out.println(
                "Would you like to: \n" +
                "1.) Transfer \n" +
                "2.) Deposit \n" +
                "3.) Withdraw \n" +
                "4.) Exit \n"
            );
            int choices = -1;

            try {
                choices = scan.nextInt(); 
                scan.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine(); 
                continue; 
            }

            if (choices == 1) {
                System.out.println("Type (no) to cancel this option.");
                System.out.print("Transfer to whom: ");
                String accToTransfer = scan.nextLine();
                if (accToTransfer.equalsIgnoreCase("no")) {
                    System.out.println("Option cancelled.");
                    continue;
                }
                System.out.print("Amount to transfer: ");
                try {
                    double ammountToTransfer = scan.nextDouble();
                    system.transferAmmount(accToTransfer, ammountToTransfer);
                } catch (Exception e) {
                    System.out.println("Invalid amount entered. Please try again.");
                    scan.nextLine();  
                }

            }else if (choices == 2) {
                System.out.println("Type (no) to cancel this option.");
                System.out.print("How much will you deposit: ");
                try {
                    double ammountDeposit = scan.nextDouble();
                    system.inDeposit(ammountDeposit);
                } catch (Exception e) {
                    System.out.println("Invalid amount entered. Please try again.");
                    scan.nextLine();  
                }
            }else if (choices == 3) {
                System.out.println("Type (no) to cancel this option.");
                System.out.print("How much will you withdraw: ");
                try {
                    double ammountWithdraw = scan.nextDouble();
                    system.withDrawal(ammountWithdraw);
                } catch (Exception e) {
                    System.out.println("Invalid amount entered. Please try again.");
                    scan.nextLine();  
                }
            }else if (choices == 4) {
                systemRunning = false;
                System.out.println("Thank you for using the bank system.");
                break;

            }else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        scan.close();
    }
}
