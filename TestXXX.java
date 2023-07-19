public class TestXXX {
    TestYYY testYyy;

    synchronized void testX1(){
        System.out.println("X:表示される");
        testYyy.testy2();
    }
    synchronized void testX2(){
        System.out.println("X:表示されない");

    }
}
