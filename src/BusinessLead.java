import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    public ArrayList<Accountant> DirectReports;
    public int HeadCount=10;

    public BusinessLead(String name){
        super(name);
        this.baseSalary=this.baseSalary*2; // twice that of accountant (basic business employee)
        DirectReports = new ArrayList<Accountant>();
    }

    public boolean hasHeadCount(){
        return (DirectReports.size()<HeadCount);
    }

    public boolean addReport(Accountant accountant, TechnicalLead lead){
        if (hasHeadCount()){
            DirectReports.add(accountant);
            BonusBudget = BonusBudget + accountant.getBaseSalary()*1.1;
            accountant.Manager = this;
            accountant.TeamSupported = lead;
            return true;
        } else {
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus < this.BonusBudget) {
            this.BonusBudget =- bonus;
            e.baseSalary =+ bonus;
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (int i=0;i<this.DirectReports.size();i++){
            if (this.DirectReports.get(i).getTeamSupported().equals(e.getManager())) {
                if (this.DirectReports.get(i).approveBonus(bonus)){
                    this.DirectReports.get(i).BonusBudget =- bonus;
                    e.baseSalary =+ bonus;
                    return true;
                }
            }
        }
        return false;
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
