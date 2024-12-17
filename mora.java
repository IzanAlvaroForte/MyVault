import java.util.Scanner;

class mora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("BMI");
        System.out.println();
        System.out.print("Enter your weight in KG: ");
        double userKG = scan.nextDouble();
        System.out.print("Now enter your height in CM: ");
        double userHeight = scan.nextDouble();

        double BMI = userKG / userHeight / userHeight * 10000;
        
        if(BMI >= 40) {
            System.out.printf("Your BMI is %.2f -- OBESE", BMI);
        }else if(BMI >= 25 && BMI <= 39.9) {
            System.out.printf("Your BMI is %.2f -- OVERWEIGHT", BMI);
        }else if(BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("Your BMI is %.2f -- NORMAL",BMI);
        }
        else {
            System.out.printf("Your BMI is %.2f -- UNDERWEIGHT", BMI);
        }
        scan.close();
    }
}