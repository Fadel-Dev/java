package sn.fadel.objetsLearning;

public abstract class  Vehicule {
   private String name;
   private int vitesse;

    public Vehicule(String name, int vitesse) {
        this.name = name;
        this.vitesse = vitesse;
    }

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

    public abstract void Demarrer();
}
