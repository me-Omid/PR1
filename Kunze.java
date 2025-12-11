import java.util.*;

public class Kunze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] produkte = {
                "Statistik erstellen und Programmende",
                "Beerenmix Fruchtaufstrich 200ml",
                "Pflaume Holunder Fruchtaufstrich 200 ml",
                "Sauerkirsche Fruchtaufstrich",
                "Apfel Birnen Saft 1l",
                "Apfel Schorle 1l",
                "Apfelsaft Familienpackung 10l",
                "Brotzeitbrett Kunze"
        };

        HashMap<String, Map<Double, Integer>> daten = new HashMap<>();

    // hier werden alle Produkte aufgelistet mit der jeweiligen Index im Array
        for (int i = 0; i < produkte.length; i++) {
        System.out.println("<" + i + "> " + produkte[i]);
        }
        System.out.println("");
        while (true) {
            System.out.print("Ihre Wahl? ");
            int wahl = sc.nextInt();
            sc.nextLine();

            if (wahl == 0) break;

            String produkt = produkte[wahl];

            System.out.print("Zu welchem Preis? ");
            double preis = Double.parseDouble(sc.next().replace(",", "."));

            System.out.print("Wie viele Einheiten? ");
            int menge = sc.nextInt();

            daten.putIfAbsent(produkt, new TreeMap<>());
            Map<Double, Integer> preisMap = daten.get(produkt);

            preisMap.put(preis, preisMap.getOrDefault(preis, 0) + menge);

            System.out.println();
        }

        // Ausgabe
        System.out.println("\nStatistik (in der obigen Sortierung)\n");

        for (String produkt : produkte) {
            if (!daten.containsKey(produkt)) continue;

            Map<Double, Integer> preisMap = daten.get(produkt);

            System.out.println("Statistik für " + produkt);
            System.out.println("  Einzelverkäufe (nach Preis aufsteigend sortiert):");

            int gesamt = 0;
            double sum = 0;

            for (Map.Entry<Double, Integer> e : preisMap.entrySet()) {
                double preis = e.getKey();
                int menge = e.getValue();
                System.out.println("    " + menge + " Einheiten zu " + preis + " EUR");

                gesamt += menge;
                sum += preis * menge;
            }

            double avg = gesamt > 0 ? round2(sum / gesamt) : 0;

            System.out.println("  Akkumulierte Werte:");
            System.out.println("    Einheiten (gesamt): " + gesamt);
            System.out.println("    Durchschnittspreis: " + avg + " EUR\n");
        }
    }

    public static double round2(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 100) / 100.0;
    }
}
