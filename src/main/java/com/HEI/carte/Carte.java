package com.HEI.carte;

import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Data
public class Carte {

private Set<Rue> rues;
public  Carte(){
    this.rues=new HashSet<>();

}
public void ajouterRue(Rue rue){
    rues.add(rue);
}

}
