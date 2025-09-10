import java.util.Scanner;

public class Number {
    private double value;
    public Number(double num) {
        this.value = num;
    }
    public boolean isZero(){
        return this.value == 0;
    }
    public boolean isPositive(){
        return this.value  >= 0 ;
    }
    public boolean isNegative(){
        return this.value < 0 ;
    }
    public boolean isOdd(){
        return this.value % 2 != 0 ;
    }
    public boolean isEven(){
        return this.value % 2 == 0 ;
    }
    public boolean isPrime(){
        if(this.value <= 1){
            return false;
        }
        for(int i = 2 ; i * i <= this.value ; i++){
            if(this.value % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        int sum = 0, temp = (int)this.value;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        return sum == this.value;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        Number number = new Number(num);
        
        System.out.println("Is Zero: " + number.isZero());
        System.out.println("Is Positive: " + number.isPositive());
        System.out.println("Negative = " + number.isNegative());
        System.out.println("Odd = " + number.isOdd());
        System.out.println("Even = " + number.isEven());
        System.out.println("Prime = " + number.isPrime());
        System.out.println("Armstrong = " + number.isArmstrong());

        scanner.close();
    }
}
