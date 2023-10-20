package ParteIIProgramacionEstructurada.ClaseII;

// Dado un limite inferior n y un limite superior N,
// indicar si los numeros que van desde el 1 al N son primos

public class EjercicioNumerosPrimos {
    public static void main(String[] args) {

        int n = 10, N = 11, primeCount = 0;

        for (int i = n; i <= N; i++){
            if (i < 2){
                continue;
            }
            boolean isPrime = true;
            for (int j = i-1; j >= 2; j--){
                
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("El numero " + i + " es primo");
                primeCount++;
            }
        }

        System.out.printf("La cantidad de numeros primos en el rango entre %d y %d es %d", n, N, primeCount);

    }
}
