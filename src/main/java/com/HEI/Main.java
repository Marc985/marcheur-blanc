package com.HEI;

import com.HEI.carte.Carte;
import com.HEI.carte.Lieu;
import com.HEI.carte.Rue;
import com.HEI.marcheur.Marcheur;

public class Main {

    public static void main(String[] args) {
       Carte carte=new Carte();

        Lieu marais=new Lieu("marais");
        Lieu sekolintiska=new Lieu("");
        Lieu hei=new Lieu("hei");
        Lieu pullman=new Lieu("pullman");

       Rue rue=new Rue("test",marais,sekolintiska);
       Rue rue1=new Rue("test2",sekolintiska,hei);
       Rue rue2=new Rue("test3",hei,pullman);
       carte.ajouterRue(rue);
       carte.ajouterRue(rue1);
       carte.ajouterRue(rue2);

        Marcheur marcheur=new Marcheur("marc",marais);
        marcheur.marcher(pullman,carte);
    }
}