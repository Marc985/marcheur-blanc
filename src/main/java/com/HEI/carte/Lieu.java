package com.HEI.carte;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static java.lang.Math.random;

@Data
public class Lieu {
private String nom;

public Lieu(String nom){
    this.nom=nom;
}



}
