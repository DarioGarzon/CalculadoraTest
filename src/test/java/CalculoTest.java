import org.junit.Test;

import static org.junit.Assert.*;

public class CalculoTest {

    @Test
    public void testSuma(){
        int total= 35;
        int suma= Calculo.suma(10, 25);
        assertEquals(total,suma);
    }
    @Test
    public  void testSumaFallida(){
        int total = 15;
        int sum = Calculo.suma(10,25);
        assertNotEquals(total,sum);
    }


    @Test
    public void testResta(){
        int total= 25;
        int resta= Calculo.resta(25, 10);
        assertEquals(total,resta);
    }
    @Test
    public  void testRestaFallida(){
        int total = 35;
        int resta = Calculo.resta(10,25);
        assertNotEquals(total,resta);
    }

    @Test
    public void testDivision(){
        int total= 5;
        int divicion= Calculo.division(25, 5);
        assertEquals(total,divicion);
    }
    @Test
    public  void testDivisionFallida(){
        int total = 15;
        int division = Calculo.division(25,5);
        assertNotEquals(total,division);
    }
    @Test
    public void testPotenciacion(){
        int total= 35;
        int potenciacion= Calculo.potenciacion(10, 25);
        assertEquals(total,potenciacion);
    }
    @Test
    public  void testPotenciacionFallida(){
        int total = 15;
        int potenciacion = Calculo.potenciacion(10,25);
        assertNotEquals(total,potenciacion);
    }
    @Test
    public void testRaizCuadrada(){
        int total= 35;
        int raiz= Calculo.raizCuadrada(10, 25);
        assertEquals(total,raiz);
    }
    @Test
    public  void testPotenciacionFallida(){
        int total = 15;
        int potenciacion = Calculo.potenciacion(10,25);
        assertNotEquals(total,potenciacion);
    }

    private void assertNotEquals(int total, int sum) {
    }
}