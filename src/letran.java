import java.util.Scanner;

public class letran {

    public void eval(){
        Scanner ingreso = new Scanner(System.in);


        System.out.print("Ingresa un caracter: ");
        char letra = ingreso.next().charAt(0);
        int aski = (int)letra; //aqui esta el nro ascii

        if(aski >= 65 && aski <= 90 ){
            System.out.println("Es una letra");
        }
        if(aski >= 97 && aski <= 122 ){
            System.out.println("Es una letra");
        }
        if(aski >= 48 && aski <= 57 ){
            System.out.println("Es un numero");
        }

        if(Character.isUpperCase(letra)) //utilizamos el método isUpperCase de la clase Character
            System.out.println("Es una letra mayúscula");
        else
            System.out.println("Es una letra minuscula");




    }


    }
