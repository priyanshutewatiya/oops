import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        double basicSalary, hra, da, grossSalary;
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        if(basicSalary < 1500 ){
            hra = basicSalary * 0.10; // 10% of basic salary
            da = basicSalary * 0.90; // 90% of basic salary
        } 
        else {
            hra = 500; 
            da = basicSalary * 0.98; // 98% of basic salary
        }
        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
    }

}
