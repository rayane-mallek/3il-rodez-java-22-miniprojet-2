package fr.ecole3il.rodez2023.carte.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphe<E> {
    private Map<Noeud<E>, Map<Noeud<E>, Double>> adjacences;

    public Graphe() {
        this.adjacences = new HashMap<>();
    }

    public void ajouterNoeud(Noeud<E> noeud) {
        if (! adjacences.containsKey(noeud)) {
            adjacences.put(noeud, new HashMap<>());
        }
    }

    public void ajouterArete(Noeud<E> depart, Noeud<E> arrivee, double cout) {
        ajouterNoeud(depart);
        ajouterNoeud(arrivee);
        adjacences.get(depart).put(arrivee, cout);
    }

    public double getCoutArete(Noeud<E> depart, Noeud<E> arrivee) {
        if (adjacences.containsKey(depart) && adjacences.get(depart).containsKey(arrivee)) {
            return adjacences.get(depart).get(arrivee);
        }

        return -1;
    }

    public List<Noeud<E>> getNoeuds() {
        return new ArrayList<>(adjacences.keySet());
    }

    public List<Noeud<E>> getVoisins(Noeud<E> noeud) {
        if (adjacences.containsKey(noeud)) {
            return new ArrayList<>(adjacences.get(noeud).keySet());
        }

        return new ArrayList<>();
    }
}