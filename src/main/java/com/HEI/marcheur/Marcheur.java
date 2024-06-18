package com.HEI.marcheur;

import com.HEI.carte.Carte;
import com.HEI.carte.Lieu;
import com.HEI.carte.Rue;
import lombok.Data;

import java.util.*;


public class Marcheur {
   private String nom;

   public  Marcheur(String nom){
       this.nom=nom;
   }
    public void marcher(Lieu depart,Lieu arrivee,Carte carte){

    Lieu positionActuel=depart;
        Set<Rue> rueParcourues=new HashSet<>();

      while (!positionActuel.equals(arrivee)){

          List<Rue> rueDisponible=new ArrayList<>();

          for(Rue rue: carte.getRues()){
              if(rue.getLieuDeDepart().equals(positionActuel)||rue.getLieuDarivee().equals(positionActuel)){
                  rueDisponible.add(rue);
              }

          }
        int choisirRueAleatoirement=new Random().nextInt(0,rueDisponible.size());
        Rue rueChoisi=rueDisponible.get(choisirRueAleatoirement);
        rueParcourues.add(rueChoisi);
        positionActuel=rueChoisi.lieuOppose(positionActuel);
          System.out.println(positionActuel);

      }


    };

}
