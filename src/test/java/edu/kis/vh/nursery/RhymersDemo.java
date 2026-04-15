package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        // TODO: brak obsługi błędów (np. gdy factory zwróci null)
        testRhymes(factory);

    }

    private static void testRhymes(RhymersFactory factory) {
        // TODO: lepiej użyć listy zamiast tablicy dla większej elastyczności
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        // TODO: "magiczne liczby" (15, 3) – powinny być stałymi
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);

        // TODO: Random tworzony bez ziarna – utrudnia testowanie
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].isEmpty())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        // TODO: rzutowanie może być niebezpieczne – brak sprawdzenia typu
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

}