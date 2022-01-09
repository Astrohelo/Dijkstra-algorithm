package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
class Csucs {

    private int eddigiTav;
    public Csucs(int tav) {
        this.eddigiTav = tav;
    }
/*
    private List<Node> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }*/



    // getters and setters
}

public class Main {

    public static void main(String[] args)  {
        int utvonalDarab=0;
        int keresztezodesDarab=0;
        int elDarab=0;
        ArrayList<Integer> kivantUtvonal = new ArrayList<>();
        ArrayList<Integer> keresztezodesek = new ArrayList<>();
        ArrayList<Integer> elek = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        utvonalDarab = in.nextInt();
        keresztezodesDarab= in.nextInt();
        elDarab= in.nextInt();
        for(int i = 0; i<utvonalDarab*2;i++){
            kivantUtvonal.add(in.nextInt());
        }
        for(int i = 0; i<keresztezodesDarab*2;i++){
            keresztezodesek.add(in.nextInt());
        }
        for(int i = 0; i<elDarab*2;i++){
            elek.add(in.nextInt());
        }
        in.close();
        System.out.println(utvonalDarab+" "+keresztezodesDarab+" "+elDarab);


    }


}

