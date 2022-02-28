package sn.fadel.objetsLearning;

public class Moto extends Vehicule {
    public Moto(String name, int vitesse) {
        super(name, vitesse);
    }

    @Override
    public void Demarrer() {
        System.out.println(this.getName() + " a demarre en levant le bekille");
    }
}
