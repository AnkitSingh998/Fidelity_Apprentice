public class Temporary extends Employee {
    int dailywages;
    int noofdays;
    public Temporary(int dailywages,int noofdays , int id, String name, float basicsalary ) {
        super(id, name, basicsalary);

        this.dailywages = dailywages;
        this.noofdays = noofdays;
    }
    float netsalary=0;
    float bonus=0;
    public void calculate()
    {

            netsalary=dailywages*noofdays;
            if(dailywages<1000)
                bonus=(float)0.15*netsalary;
            else if(dailywages>=1000 && dailywages<1500)
                bonus=(float).12*netsalary;
            else if(dailywages>=1500 && dailywages<1700)
                bonus=(float).11*netsalary;
            else
                bonus=(float).15*netsalary;
            netsalary+=bonus;

    }
    public void display()
    {
        System.out.println("Details are:");
        System.out.println("Employee ID " + id);
        System.out.println("Employee Name " + name);
        System.out.println("Daily Wages " + dailywages);
        System.out.println("No Of Days Worked " + noofdays);
        System.out.println("Bonus" +bonus);
        System.out.println("NetSalary " + netsalary);
    }
}
