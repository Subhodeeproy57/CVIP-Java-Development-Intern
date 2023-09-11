import java.util.Scanner;
class Calculate {
    float kg, cm, bmi, meters;

    Calculate(float kg, float cm) {
        this.kg = kg;
        this.cm = cm;
    }

    void conversion() {
        meters = cm / 100;
        bmi = kg / (meters * meters);
    }
}
public class BMI_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t *BMI CALCULATOR*");
        System.out.print("Enter your weight (in kilograms): ");
        float kg = sc.nextFloat();
        System.out.print("Enter your height (in centimeters): ");
        float cm = sc.nextFloat();

        Calculate c1 = new Calculate(kg, cm);
        c1.conversion();
        
        if(c1.bmi<16){
            System.out.println("\nYOU ARE IN SEVERE THINNESS CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");
        }
        else if(c1.bmi>=16 && c1.bmi<17){
         System.out.println("\nYOU ARE IN MODERATE THINNESS CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        }
         else if(c1.bmi>=17 && c1.bmi<18.5){
         System.out.println("\nYOU ARE IN MILD THINNESS CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        } 
        else if(c1.bmi>=18.5 && c1.bmi<25){
         System.out.println("\nYOU ARE IN NORMAL(HEALTHY WEIGHT) CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        }
         else if(c1.bmi>=25 && c1.bmi<30){
         System.out.println("\nYOU ARE IN OVERWEIGHT CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        }
         else if(c1.bmi>=30 && c1.bmi<35){
         System.out.println("\nYOU ARE IN OBESE CLASS I CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        }
         else if(c1.bmi>=35 && c1.bmi<40){
         System.out.println("\nYOU ARE IN OBESE CLASS II CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        }
         else if(c1.bmi>=40){
         System.out.println("\nYOU ARE IN OBESE CLASS III CATEGORY!\nYour BMI is: " + c1.bmi +" kg/m^2");   
        }
        else{
            System.out.println("Provide valid information!!");
        }

        sc.close();
    }
}
