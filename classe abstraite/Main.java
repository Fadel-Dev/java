package sn.fadel_dev;


import com.sun.deploy.security.SelectableSecurityManager;
import sn.fadel.objetsLearning.Moto;
import sn.fadel.objetsLearning.Voiture;
import sn.fadel.traveauxPratique.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Voiture fatherVoiture = new Voiture("ferrari",200);
            fatherVoiture.Demarrer();

        Moto fatherMoto = new Moto("T-max",250);
            fatherMoto.Demarrer();
    }

}
