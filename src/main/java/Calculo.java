public class Calculo {
    //Suma de dos numeros
    public static int suma(int a, int b){
        return a+b;
    }
    //Resta de dos numeros
    public static int resta(int a, int b){
        return a-b;
    }
    //División de dos numeros
    public static float division(double a, double b){
        double division = a/b;
        return division;
    }
    //Potenciación de dos numeros
    public static double potenciacion(double a,double b){
        double elevado = Math.pow(a,b);
        return elevado;
    }
    //Raiz cuadrada de un numero
    public static double raizCuadrada(double a){
        double raiz = Math.sqrt(a);
        return raiz;
    }

}
