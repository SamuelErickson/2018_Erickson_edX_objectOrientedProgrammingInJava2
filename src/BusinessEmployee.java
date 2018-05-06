public class BusinessEmployee extends Employee {
    public static double BonusBudget;

    public BusinessEmployee(String name){
        super(name,50000);
        BonusBudget = 0;
    }

    public double getBonusBudget(){
      return BonusBudget;
    }

    public String employeeStatus(){
        return(this.getEmployeeID()+" "+this.getName()+" with a budget of "+BonusBudget);
    }
}
