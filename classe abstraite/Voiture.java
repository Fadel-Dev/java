package sn.fadel.objetsLearning;

public class Voiture extends Vehicule{
    public Voiture(String name, int vitesse) {
        super(name, vitesse);
    }

    @Override
    public void Demarrer() {
        System.out.println(this.getName() + " a demarre en levant le frein a main");
    }
}
