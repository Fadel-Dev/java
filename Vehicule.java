package sn.fadel.objetsLearning;

public class Vehicule {
   private String name;

    public Vehicule(String name, int vitesse) {
        this.name = name;
        this.vitesse = vitesse;
    }

    private int vitesse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;

    }
    public void Demarrer() {
        System.out.println(this.name + " a demarrer");
    }


}
