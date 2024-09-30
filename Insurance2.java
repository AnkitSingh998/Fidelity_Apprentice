import java.util.Scanner;

public class Insurance2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Insurance Name");
        String name=sc.nextLine();
        System.out.println("Enter Insurance No");
        String no=sc.nextLine();
        System.out.println("Enter Amount Covered");
        double covered=sc.nextInt();
        Insurance insurance=new Insurance (name,no,covered);
        System.out.println("Enter Insurance Type 1 or 2");
        int type=sc.nextInt();
        if(type==1){

            System.out.println("Enter Depreciation value");
            float depreciation=sc.nextFloat();


            MotorInsurance motorInsurance=new MotorInsurance(depreciation,name,no,covered);
            motorInsurance.calculatePremium(covered);
            motorInsurance.display();
        }
        if(type==2){
            System.out.println("Enter policy term");
            int policyTerm=sc.nextInt();
            System.out.println("Enter Benefit Percent");
            float benefitPercent=sc.nextFloat();
            LifeInsurance lifeInsurance=new LifeInsurance(policyTerm,benefitPercent,name,no,covered);
            lifeInsurance.calculatePremium(covered);
            lifeInsurance.display();

        }


    }
}
