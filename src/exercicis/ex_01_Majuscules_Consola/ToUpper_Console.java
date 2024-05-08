package exercicis.ex_01_Majuscules_Consola;

import java.io.*;
import classes.Teclat;

public class ToUpper_Console {

    public static void main (String [] args) {
        String filename;
        File file;
        BufferedReader entrada = null;
        String linia;

        System.out.print("Nom de l'arxiu (sense extensio): ");
        filename = Teclat.llegirCadena();
        filename = filename+".txt";

        // vincular i obrir
        file = new File(filename);
        try {
            /* COMPLETAR */
        	entrada = new BufferedReader(new FileReader(file));
        }
        catch (FileNotFoundException e) {
            /* COMPLETAR */
        	System.out.println("Arxiu no trobat");
        	System.exit(0);
        }

        // llegir i mostrar en maj�scules
        System.out.println();
        System.out.println("--------------------------------------------------");
        try {
           /* COMPLETAR */
            // Versió amb un MENTRE (habitual)
            linia = entrada.readLine();
            while(linia!=null){
                System.out.print(linia);
                System.out.print(" ==> ");
                System.out.println(linia.toUpperCase());
                // passar a la línia següent
                linia = entrada.readLine();
            }
            // Versió amb un REPETIR
//            do{
//                linia = entrada.readLine();
//                // processar linia
//                if (linia!=null){
//                    if(linia == "")
//                        System.out.printf("------------------");
//                    else{
//                        System.out.print(linia);
//                        System.out.print(" ==> ");
//                        System.out.println(linia.toUpperCase());
//                    }
//                }
//                // passar a la l�nia seg�ent
//            } while(linia!=null);
            // arxiu exhaurit. Totes les l�nies processades
           
           entrada.close();
        }
        catch (IOException e) {
           /* COMPLETAR */
        	System.err.println("Problemes greus durant el processament de l'arxiu");
        	System.exit(0);
        }
        System.out.println("--------------------------------------------------");
    }

}
