public class TechnicalEmployee extends Employee {
    public int CodeCheckIns = 0;

    public TechnicalEmployee(String name){
        super(name,75000);
    }

    public String employeeStatus(){
        return(this.getEmployeeID()+" "+this.getName()+" has "+CodeCheckIns+ " successful check ins");
    }

// Need to add check in code here.

}
