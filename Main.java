package sn.fadel_dev;


import com.sun.deploy.security.SelectableSecurityManager;
import sn.fadel.traveauxPratique.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /* Cars mothercar = new Cars("ferrari",200);

        mothercar.Start();

        Moto myMoto = new Moto("T_max",250);

        myMoto.Start();
        myMoto.Stop();
        mothercar.Stop();*/
        int choice;

        Patient patient = new Patient("fadel",20);

/*
        Organ organ = new Organ("heart","nice","red");


//EYE
        Eye left_eye = new Eye("eye","myipie","blue");
        Eye right_eye = new Eye("eye","presbisci","blue");
//heart
        Heart heart = new Heart("heat","cardiaque","red");
//Stomach
        Stomach stomach = new Stomach("stomach","good","yellow");
//Skin
        Skin skin =new Skin("skin","pretty_good","black");
*/
        Scanner sc = new Scanner(System.in);
boolean shoudFinnish= false;


        while(!shoudFinnish){
            System.out.println(" Please chose an Organ");
            System.out.println("1.Chose Eye left");
            System.out.println("2.Chose Eye right");
            System.out.println("3.Chose heart");
            System.out.println("4.Chose stomach");
            System.out.println("5.Chose Skin");
            System.out.println("6.close");



            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Organ : " + left_eye.getName() + "\n" +"Condition : " + left_eye.getCondition() + "\n" + "Color :" +left_eye.getColor());
                    System.out.println("1.quit");
                    int select = sc.nextInt();
                    if (select ==1)
                        left_eye.getCondition();
                    else
                        continue;
                    break;



                case 6 :
                    shoudFinnish= true;

            }

        }


  /*  switch (choice) {
        case 1:
            System.out.println("Organ : " + left_eye.getName() + "\n" +"Condition : " + left_eye.getCondition() + "\n" + "Color :" +left_eye.getColor());
    }
*/
    }

}
