public class Insurance {
    private String insuranceName;
    private String insuranceNo;
    private double amountCovered;

    public Insurance(String insuranceName, String insuranceNo, double amountCovered) {
        setInsuranceName(insuranceName);
        setInsuranceNo(insuranceNo);
        setAmountCovered(amountCovered);
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    public String getInsuranceNo() {
        return insuranceNo;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public void setAmountCovered(double amountCovered) {
        this.amountCovered = amountCovered;
    }
    public double getAmountCovered() {
        return amountCovered;
    }

}

class MotorInsurance extends Insurance{

    private float depPercent;

    public MotorInsurance( float depPercent, String insuranceName,String insuranceNo, double amountCovered) {
        super(insuranceName, insuranceNo, amountCovered);

        this.depPercent = depPercent;
    }

   public float getDepPercent(){
        return depPercent;
   }
   public void setDepPercent(float depPercent){
        this.depPercent = depPercent;
   }


    public void calculatePremium(double amountCovered){
        double idv=amountCovered-((amountCovered*depPercent)/100);
        double prem=0.03*idv;
        System.out.println("Premium"+prem);


   }
   public void display()
   {
       System.out.println("Insurance Name: " + getInsuranceName());
       System.out.println("Insurance No: " + getInsuranceNo());
       System.out.println("Amount Covered: " + getAmountCovered());
       System.out.println("Depreciation Percent: " + getDepPercent());

   }
}

class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;
    public LifeInsurance(int policyTerm, float benefitPercent, String insuranceName,String insuranceNo, double amountCovered) {
        super(insuranceName, insuranceNo, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }
    public int getPolicyTerm(){
        return policyTerm;
    }
    public void setPolicyTerm(int policyTerm){
        this.policyTerm = policyTerm;
    }
    public float getBenefitPercent(){
        return benefitPercent;
    }
    public void setBenefitPercent(float benefitPercent){
        this.benefitPercent = benefitPercent;
    }


    public void calculatePremium(double amountCovered){
        double prem=amountCovered-((amountCovered*policyTerm)/100);
        System.out.println("Premium"+prem);
    }
    public void display()
    {
        System.out.println("Insurance Name: " + getInsuranceName());
        System.out.println("Insurance No: " + getInsuranceNo());
        System.out.println("Amount Covered: " + getAmountCovered());
        System.out.println("Policy Term: " + getPolicyTerm());
        System.out.println("Benefit Percent: " + getBenefitPercent());

    }

}

