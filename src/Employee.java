public class Employee {
    // MAYBE should be abstract
    private String name;
    private double baseSalary;
    private int EmployeeID;
    private static int EmployeeCount = 0;

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
/*
    public String employeeStatus(){
        //not sure what to do here

Should return a String representation of that Employee's current status. This will be different for every subclass of Employee


    }
   */




}
