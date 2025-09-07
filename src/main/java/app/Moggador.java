package app;

public class Moggador extends Beta {
    private boolean isMogged;

    public boolean isMogged(){
        return isMogged;
    }

    public void setMogged(boolean isMogged) {
        this.isMogged = isMogged;
    }

    public Moggador(String skill, int aura, boolean isMogged){
        setSkill(skill);
        setAura(aura);
        setMogged(isMogged);
    }
}