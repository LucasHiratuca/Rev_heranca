package app;

public class Sigma extends Beta{
    private boolean isMewing;

    public boolean isMewing(){
        return this.isMewing;
    }

    public void setMewing(boolean isMewing){
        this.isMewing = isMewing;
    }

    public Sigma(String skill, int aura, boolean isMewing){
        setSkill(skill);
        setAura(aura);
        setMewing(isMewing);
    }  
    
}