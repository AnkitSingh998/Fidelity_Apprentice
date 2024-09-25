public class Permanent extends Employee {
    float pf;
    public Permanent(float pf,int id, String name, float basicsalary ) {
        super(id, name, basicsalary);

        this.pf = pf;
    }
    float netsalary=0;
    float bonus=0;
    public void calculate()
    {
        if(pf<1000)
            bonus=(float)0.1 *basicsalary;
        else if(pf>=1000 && pf<1500)
            bonus=(float) 0.115 * basicsalary;
        else if(pf>=1500 && pf<1800)
            bonus=(float) 0.12 * basicsalary;
        else
            bonus=(float) 0.15 * basicsalary;


        netsalary=basicsalary+bonus-pf;
    }
    public void display()
    {
        System.out.println("Details are:");
        System.out.println("Employee ID " + id);
        System.out.println("Employee Name " + name);
        System.out.println("Basic Salary " + basicsalary);
        System.out.println("Bonus " + bonus);
        System.out.println("PF" +pf);
        System.out.println("NetSalary " + netsalary);

    }

}
