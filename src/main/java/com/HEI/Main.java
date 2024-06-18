package com.HEI;

import com.HEI.carte.Carte;
import com.HEI.carte.Lieu;
import com.HEI.carte.Rue;
import com.HEI.marcheur.Marcheur;

public class Main {

    public static void main(String[] args) {
       Carte carte=new Carte();

        Lieu marais=new Lieu("marais");
        Lieu sekolintiska=new Lieu("sekolintsika");
        Lieu hei=new Lieu("hei");
        Lieu pullman=new Lieu("pullman");
        Lieu nexta=new Lieu("nexta");
        Lieu balancoire=new Lieu("balancoire");
        Lieu ESTI=new Lieu("esti");
        Lieu boulevardDeLEurope=new Lieu("boulevard de l'europe");


       Rue rue=new Rue(marais,sekolintiska);
       Rue rue1=new Rue(sekolintiska,hei);
       Rue rue2=new Rue("rue andriatsihoarana",hei,pullman);
       Rue rue3=new Rue(hei,balancoire);
       Rue rue4=new Rue("Ranaivo",pullman,balancoire);
       Rue rue5=new Rue(pullman,nexta);
       Rue rue6=new Rue(balancoire,ESTI);
       Rue rue7=new Rue(balancoire,boulevardDeLEurope);
       Rue rue8=new Rue(boulevardDeLEurope,ESTI);
       carte.ajouterRue(rue);
       carte.ajouterRue(rue1);
       carte.ajouterRue(rue2);
       carte.ajouterRue(rue3);
       carte.ajouterRue(rue4);
       carte.ajouterRue(rue5);
       carte.ajouterRue(rue6);
       carte.ajouterRue(rue7);
       carte.ajouterRue(rue8);

        Marcheur marcheur=new Marcheur("marc");
        marcheur.marcher(hei,ESTI,carte);
    }
}