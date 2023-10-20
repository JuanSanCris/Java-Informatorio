package ParteIIProgramacionEstructurada.ClaseI;


public class EstructuraWhile {
    public static void main(String[] args) {
        //while "comun"
        int i = 11;
        while (i < 11){
            System.out.print("While comun: " + i);
            i++;
        }

        System.out.println("");

        i = 10;
        while (i < 11){
            i++;
            System.out.print("While raro: " + i);
        }

        System.out.println();

        i = 11;
        do {
            System.out.print("Do While: " + i);
            i++;
        } while (i < 11);

        // Convertir un while en un do while
        /*  En terminos puramente conceptuales, lo que hacemos para que un While se comporte como un 
        Do While es asegurandonos de que la primera iteracion vaya a entrar si o si al While,
        "manipulando" la condición para que se cumpla ésta primera vez. Una vez dentro, modificamos
        el contador o variable asociado a la condicion primero, antes que cualquier otra operacion. 
        De esta forma, si el siguiente valor de verdad de la condicion será False, el While recien 
        lo analizara una vez que la iteracion ya se realizó, logrando este comportamiento atípico. */ 


        

    }
}
