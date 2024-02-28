package fr.ecole3il.rodez2023.carte.algorithmes;

import fr.ecole3il.rodez2023.carte.elements.Graphe;
import fr.ecole3il.rodez2023.carte.elements.Noeud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class AlgorithmeDijkstra<E> implements AlgorithmeChemin {
    @Override
    public List<Noeud> trouverChemin(Graphe graphe, Noeud depart, Noeud arrivee) {
        Map<Noeud<E>, Double> couts = new HashMap<>();
        Map<Noeud<E>, Noeud<E>> predecesseurs = new HashMap<>();
        PriorityQueue<Noeud<E>> filePriorite = new PriorityQueue<>();
    }
}
