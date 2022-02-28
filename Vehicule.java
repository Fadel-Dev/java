package sn.fadel_dev;

public class Vehicule {

    public String name;
    public int Speed;

    public Vehicule(String name, int speed) {
        this.name = name;
        Speed = speed;}

      public void Start() {
        System.out.println(" the " + name + "start to run ");
    }
    public void Stop () {
        System.out.println(this.name + " has stop");
    }

}
