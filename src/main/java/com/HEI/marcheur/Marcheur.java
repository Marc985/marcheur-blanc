package com.HEI.marcheur;

import com.HEI.carte.Carte;
import com.HEI.carte.Lieu;
import com.HEI.carte.Rue;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Marcheur {
   private String nom;
   private Lieu positionActuel;
   public  Marcheur(String nom,Lieu depart){
       this.nom=nom;
       positionActuel=depart;
   }
    public void marcher(Lieu arrivee,Carte carte){



      while (!positionActuel.equals(arrivee)){

          List<Rue> rueDisponible=new ArrayList<>();

          for(Rue rue: carte.getRues()){
              if(rue.getLieuDeDepart().equals(positionActuel)||rue.getLieuDarivee().equals(positionActuel)){
                  rueDisponible.add(rue);
              }

          }
        int choisirRue=new Random().nextInt(0,rueDisponible.size());
        Rue rueChoisi=rueDisponible.get(choisirRue);
        positionActuel=rueChoisi.lieuOppose(positionActuel);
          System.out.println(this.positionActuel);

      }


    };

}
