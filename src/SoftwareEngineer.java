public class SoftwareEngineer extends TechnicalEmployee {
    public boolean CodeAccess = false;

    public SoftwareEngineer(String name){
        // I wonder if I actually need this constructor, maybe can remove
        super(name);
    }

    public boolean getCodeAccess(){
        return this.CodeAccess;
    }

    public void setCodeAccess(boolean access){
        this.CodeAccess=access;
    }

    public int getSuccessfulCheckIns(){
        return CodeCheckIns;
    }

    public boolean checkInCode(){
        System.out.println("Still need to complete");
        if (true){ // need to add criteria
            CodeCheckIns++;
            return true;
        } else {
            this.CodeAccess = false;
            return false;
        }
        // not sure how to proceed
        /*
Should check if this SoftwareEngineer's manager approves of their check in. If the check in is approved their successful checkin count should be increased and the method should return "true". If the manager does not approve the check in the SoftwareEngineer's code access should be changed to false and the method should return "false"

         */
    }

}
