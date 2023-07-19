public class TestYYY {
    TestXXX testXxx;

    synchronized void testy1() {
        System.out.println("y:表示される");
        testXxx.testX2();
    }

    synchronized void testy2() {
        System.out.println("y:表示されない");

    }
}
