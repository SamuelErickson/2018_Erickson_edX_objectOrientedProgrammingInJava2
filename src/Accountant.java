public class Accountant extends BusinessEmployee {
    public TechnicalLead TeamSupported;
    public double BonusBudget;


    public Accountant(String name){
        super(name);
        this.BonusBudget = 0;
    }

    public TechnicalLead getTeamSupported() {
        return TeamSupported;
    }

    public void supportTeam(TechnicalLead lead){
        TeamSupported = lead;
        double newBudget = 0;
        for (int i=0; i < lead.DirectReports.size();i++){
            newBudget = newBudget + lead.DirectReports.get(i).baseSalary;
        }
        this.BonusBudget = newBudget*1.10; // add 10%
    }

    public boolean approveBonus(double bonus){
        if (bonus>BonusBudget||TeamSupported==null){
            return false;
        } else {
            return true;
        }
    }

    public String employeeStatus(){
        return(this.getEmployeeID()+" "+this.getName()+" with a budget of "+this.getBonusBudget()+" is supporting "+this.getTeamSupported());
    }






}
