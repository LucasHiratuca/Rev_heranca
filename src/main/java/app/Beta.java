package app;

public class Beta {
    private String skill;
    private int aura;

    public void setSkill(String skill){
        this.skill = skill;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setAura(int aura){
        this.aura = aura;
    }

    public int getAura() {
        return this.aura;
    }
    public Beta(String skill, int aura){
        setSkill(skill);
        setAura(aura);
    }

    public Beta(){}
}