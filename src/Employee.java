public class Employee {

    int EmpId;
    String EmpName;
    String Dept;
    static String orgname="Fideliy";
    private int EmpSalary;

    public void Initialize(int EmpSalary)
    {
        this.EmpSalary=EmpSalary;
    }
    public void Display()
    {
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
        System.out.println("Employee Dept: " + Dept);
        System.out.println("Employee Salary: " + EmpSalary);

    }
    public static void show()
    {
        System.out.println("Organisation Name: " + orgname);
    }
}
