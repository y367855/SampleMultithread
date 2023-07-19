public class TestYYY {
    TestXXX testXxx;

    //デッドロックが発生せずに表示される
    synchronized void testy1() {
        System.out.println("y1:表示される");
        testXxx.testX2();
    }

    //x1から呼ばれるが、x1が実行完了するまで待機
    synchronized void testy2() {
        System.out.println("y2:表示されない");

    }
}
