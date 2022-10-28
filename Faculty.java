    public class Faculty extends Employee {
    private boolean status;
    
    public void setIsRegular(boolean reg){
        this.status = reg;
    }   
    public boolean isRegular(){
        return this.status;
    }
    
}
