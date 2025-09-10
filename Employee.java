class Employe{
    private int empNo;
    private String empName;
    private int empBasic;

    public Employe(int empNo, String empName, int empBasic){
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    public int getEmpNo() {
        return empNo;
    }
    public String getEmpName() {
        return empName;
    }
    public int getEmpBasic() {
        return empBasic;
    }
}
public class Employee {
    public static void main(String[] args){
        Employe e = new Employe(1, "john" ,5000);
        System.out.println(e.getEmpName());
        System.out.println(e.getEmpNo());
        System.out.println(e.getEmpBasic());

    }
}
