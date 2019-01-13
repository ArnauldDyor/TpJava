package testexcept;

import java.lang.NumberFormatException;



public class Exercice3 {

    public static void main(String[] args){
        String[] array = {"123","5621","1203","450","152"};

        int total = 0;

        try {
            for(int i = 0; i < array.length; i++) {
                total = total + Integer.parseInt(array[i]);
            }
            double avg = total / array.length;
            System.out.println(avg);
        }catch (NumberFormatException e) {

            System.out.println("la chaine de caractere n'est pas parsable");
        }
    }



}

