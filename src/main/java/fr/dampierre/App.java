package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int salaire = 400;
        int prime = 250;
        int quota = 10;

        System.out.print("Combien de vente avez vous effecturer cette semaine ?");
        Scanner clavier = new Scanner(System.in);
        int nbvente = clavier.nextInt();
        clavier.close();

        if (nbvente >= quota) {
            salaire = salaire + prime;
        }

        System.out.print("Votre salaire est de : " + salaire + " €");

    }
    
}
