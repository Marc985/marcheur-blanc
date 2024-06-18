package com.HEI.carte;

import lombok.Data;

@Data
public class Rue {
   private String nom;
   private Lieu lieuDeDepart;
   private Lieu lieuDarivee;
    public Rue(String nom,Lieu lieuDeDepart,Lieu lieuDarrivee){
    this.nom=nom;
    this.lieuDarivee=lieuDarrivee;
    this.lieuDeDepart=lieuDeDepart;

    }
    public Rue(Lieu lieuDeDepart,Lieu lieuDarivee){
        this.lieuDeDepart=lieuDeDepart;
        this.lieuDarivee=lieuDarivee;
    }
    public Lieu lieuOppose(Lieu lieu){
        if(lieu==lieuDeDepart){
            return  lieuDarivee;
        }
        else
            return lieuDeDepart;
    }

}
