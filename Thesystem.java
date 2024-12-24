public class Thesystem extends Bankaccount{
    String targetAccount;
    double ammount;
   
    public void transferAmmount(String targetAccount, double ammount) {
        if(ammount <= 0) {
            System.out.println("You can't transfer below zero!");
            return;
        }
        if (ammount > getBalance()) {
            System.out.println("Insufficient balance to complete the process");
            return;
        }

        double updatedBalance = getBalance() - ammount;
        setBalance(updatedBalance);
        System.out.println("Transferring "+ ammount +" to "+ targetAccount);
        System.out.println("Your current balance is "+ getBalance()+ " pesos");
    }
    public void inDeposit(double userDeposit){
        if(userDeposit < 500) {
            System.out.println("You cannot deposit below 500");
            return;
        }
        
        double updatedBalance = getBalance() + userDeposit;
        setBalance(updatedBalance);
        System.out.println("You have deposited " + userDeposit + " pesos");
        System.out.println("Your new balance is " + getBalance() + " pesos");
    }
    public void withDrawal(double userWidthdrawal) {
        if(userWidthdrawal <= 0) {
            System.out.println("You can't withdraw below zero!");
        }else if(userWidthdrawal > getBalance()) {
            System.out.println("insufficient balance to withdraw");
        }
        else{
            double updatedBalance = getBalance() - userWidthdrawal;
            setBalance(updatedBalance);
        }
        System.out.println("You withdraw "+ userWidthdrawal + " pesos.");
        System.out.println("Your current balance is "+ getBalance()+ " pesos.");
    }
}
