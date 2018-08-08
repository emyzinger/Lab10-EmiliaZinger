package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;


public class Main {

    public static void main(final String[] args) {
        final  String UA = CountryCodes.UA;
        final  String RU = CountryCodes.RU;
        final String PL = CountryCodes.PL;
        final String BY = CountryCodes.BY;
        final String RO = CountryCodes.RO;
        final String MD = CountryCodes.MD;

        final Graph<String,DefaultEdge>myMap= new SimpleGraph<>(DefaultEdge.class);

        myMap.addVertex(UA);
        myMap.addVertex(RU);
        myMap.addVertex(PL);
        myMap.addVertex(BY);
        myMap.addVertex(RO);
        myMap.addVertex(MD);

        myMap.addEdge(UA, RU);
        myMap.addEdge(UA, BY);
        myMap.addEdge(UA, PL);
        myMap.addEdge(UA, RO);
        myMap.addEdge(UA, MD);
        myMap.addEdge(RU, BY);
        myMap.addEdge(BY, PL);
        myMap.addEdge(RO, MD);

        System.out.println(myMap);

        final Iterator<String> bf = new BreadthFirstIterator<>(myMap, UA);
        System.out.println(" \nBF Starting with UA");
        while (bf.hasNext()) {
            final String country = bf.next();
            System.out.println(country);
        }

        final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, MD);
        System.out.println(" \nBF Starting with MD");
        while (bf2.hasNext()) {
            final String country = bf2.next();
            System.out.println(country);
        }

        final Iterator<String> cf = new ClosestFirstIterator<>(myMap, UA);
        System.out.println(" \nCF Starting with UA");
        while (cf.hasNext()) {
            final String country = cf.next();
            System.out.println(country);
        }

        final Iterator<String> cf2 = new ClosestFirstIterator<>(myMap, MD);
        System.out.println(" \nCF Starting with MD");
        while (cf2.hasNext()) {
            final String country = cf2.next();
            System.out.println(country);
        }

        final Iterator<String> df = new DepthFirstIterator<>(myMap, UA);
        System.out.println(" \nDF Starting with UA");
        while (df.hasNext()) {
            final String country = df.next();
            System.out.println(country);
        }

        final Iterator<String> df2 = new DepthFirstIterator<>(myMap, MD);
        System.out.println(" \nDF Starting with MD");
        while (df2.hasNext()) {
            final String country = df2.next();
            System.out.println(country);
        }

        final Iterator<String> rw = new RandomWalkIterator<>(myMap, UA);
        System.out.println(" \nRW Starting with UA");
        Set<String> set1 = new HashSet<> ();
        set1.add("Ukraine");
        set1.add("Russia");
        set1.add("Belarus");
        set1.add("Poland");
        set1.add("Romania");
        set1.add("Moldova");
        Set<String> set2 = new HashSet<> ();
        while (!(set1.equals(set2))) {
            final String country = rw.next();
            System.out.println(country);
            set2.add(country);
        }

        final Iterator<String> rw2 = new RandomWalkIterator<>(myMap, MD);
        System.out.println(" \nRW Starting with MD");
        Set<String> set3 = new HashSet<> ();
        while (!(set1.equals(set3))) {
            final String country = rw2.next();
            System.out.println(country);
            set3.add(country);
        }

        GreedyColoring color = new GreedyColoring(myMap);
        System.out.println(color.getColoring());
    }
}
