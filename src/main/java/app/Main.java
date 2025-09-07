package app;

public class Main{
    public static void main(String [] args) {
        Beta[] betas = new Beta[2];
        Sigma[] sigmas = new Sigma[1];
        Moggador[] moggadores = new Moggador[4];

        betas[1] = new Beta("Nula", 0);
        sigmas[0] = new Sigma("Faker?!?", 999999999, true);
        moggadores[3] = new Moggador("Absoluta", 100, true);

        System.out.println("Atributos do beta:" + betas[1].getSkill() + " Skill\n" + betas[1].getAura() + " Aura");
    }
}