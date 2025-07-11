/*
FizzBuzz
En este reto reforzaras tus conocimientos en Java, manejando ciclos, condicionales e impresión por consola.

1.- Construye un programa que imprima números del 1 al 100.

2.- Cuando el número sea múltiplo de 3 imprimir Fizz en lugar del número.

3.- Cuando el número sea un múltiplo de 5 imprimir Buzz en lugar del número.

4.- Cuando el número sea múltiplo de 3 y de 5 imprimir FizzBuzz en lugar del número.

5.- El programa no recibira inputs y cada número debe ir impreso en una línea.

6.- Debes escribir el código en una clase llamada FizzBuzz que contenga por lo menos un método, imprimir.

7.- En una clase Main, debes crear un objeto de dicha clase para imprimir el resultado.

Reglas
Debes compartir tu pantalla y mantener encendida tu cámara web
Durante el desafío debes explicar todos los pasos que realices.
Debes responder a las preguntas que haga el entrevistador.
*/
public class FizzBuzz {
    //No se tienen parametros

    public FizzBuzz() {
    }

    public void imprimir(){
        for(int i = 1; i < 101; i++){
            boolean multiplo3 = false;
            boolean multiplo5 = false;

            if(i % 3 == 0) {
                multiplo3 = true;
            }
            if(i % 5 == 0) {
                multiplo5 = true;
            }

            if(multiplo3 && multiplo5){
                System.out.println("FizzBuzz");
            } else if (multiplo3) {
                System.out.println("Fizz");
            } else if(multiplo5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

}
