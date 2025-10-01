import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Moyenne");
        System.out.println("4. Trouver le plus grand");
        System.out.println("0. Quitter");


        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.print("Choisissez une option : ");
            choix = sc.nextInt();
        } while (choix < 0);


        // Controle de flux
        switch (choix) {
            case 1:
                System.out.print("Entrez deux entiers : ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println("Résultat : " + addition(a1, b1));
                break;

            case 2:
                System.out.print("Entrez deux entiers : ");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println("Résultat : " + multiplication(a2, b2));
                break;

            case 3:
                System.out.print("Combien de valeurs ? ");
                int n = sc.nextInt();
                int[] valeurs = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Valeur " + (i + 1) + " : ");
                    valeurs[i] = sc.nextInt();
                }
                System.out.println("Moyenne : " + moyenne(valeurs));
                break;

            case 4:
                System.out.print("Combien de nombres ? ");
                int m = sc.nextInt();
                int[] entiers = new int[m];
                for (int i = 0; i < m; i++) {
                    System.out.print("Nombre " + (i + 1) + " : ");
                    entiers[i] = sc.nextInt();
                }
                System.out.println("Maximum : " + maximum(entiers));
                break;

            case 0:
                System.out.println("Fin du programme.");
                break;

            default:
                System.out.println("Option invalide !");
        }





    }


//============== Les Méthodes ====================

    // add Methode
    public static int addition(int a, int b) {
        return a + b;
    }


    // Multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // La moyenne
    public static double moyenne(int... valeurs) {
        int total = 0;
        for (int v : valeurs) {
            total += v;
        }
        return (double) total / valeurs.length;
    }

    // Le plus grand nombre
    public static int maximum(int... valeurs) {
        int max = valeurs[0];
        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }







}



