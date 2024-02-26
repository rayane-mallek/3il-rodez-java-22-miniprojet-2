package fr.ecole3il.rodez2023.carte.elements;

import java.util.ArrayList;
import java.util.List;

public class Noeud<E> {
    private E valeur;
    private List<Noeud<E>> voisins;

    public Noeud(E valeur) {
        this.valeur = valeur;
        voisins = new ArrayList<Noeud<E>>();
    }

    public List<Noeud<E>> getVoisins() {
        return voisins;
    }

    public void ajouterVoisin(Noeud<E> voisin) {
        voisins.add(voisin);
    }
}
