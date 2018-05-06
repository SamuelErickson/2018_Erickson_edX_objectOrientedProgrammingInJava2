public class Employee {
    // MAYBE should be abstract
    public String name;
    public double baseSalary;
    public int EmployeeID;
    public static int EmployeeCount = 0;
    public Employee Manager;

    public Employee(String name, double baseSalary){
        // this is the constructor
        this.name = name;
        this.baseSalary = baseSalary;
        EmployeeCount++;
        this.EmployeeID = EmployeeCount;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public String getName(){
        return this.name;
    }

    public Employee getManager(){
        return this.Manager;
    }

    public int getEmployeeID(){
        return this.EmployeeID;
    }


    /*
    public Employee getManager(){
//what?

        Should return a reference to the Employee object that represents this employee's manager

    }
    */

    public boolean equals(Employee other){
        if (this.getEmployeeID()==other.getEmployeeID()){
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        return(this.getEmployeeID()+" "+this.getName());
    }

    public String employeeStatus(){
        return("Error: Should print employee status using subclass method ");


    }





}
