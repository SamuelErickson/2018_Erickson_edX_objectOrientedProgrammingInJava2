import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    public int HeadCount = 4;
    public ArrayList<SoftwareEngineer> DirectReports = new ArrayList<SoftwareEngineer>();


    public TechnicalLead(String name){
        super(name);
        this.baseSalary=this.baseSalary*1.3;

    }

    public boolean hasHeadCount(){
        return (DirectReports.size()<HeadCount);
    }

    public boolean addReport(SoftwareEngineer softwareEng){
        if (hasHeadCount()){
            DirectReports.add(softwareEng);
            softwareEng.Manager = this;
            return true;
        } else {
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer softwareEng){
        if (softwareEng.CodeAccess==true && DirectReports.contains(softwareEng)){
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus){
        // Do after completing business lead
        System.out.println("requestBonus not complete method");
        return true;
        //just a placeholder
    }

    public String getTeamStatus(){
        if (DirectReports.size()==0) {
            return(this.employeeStatus()+" and no direct reports yet");
        } else {
            String o = new String(this.employeeStatus()+" and is managing: ");
            for(int i=0; i <DirectReports.size(); i++){
                o = o+("\n"+DirectReports.get(i).employeeStatus());
            }
            return o;
        }
    }

}
