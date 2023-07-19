public class TestXXX {
    TestYYY testYyy;
    //デッドロックが発生せずに表示される
    synchronized void testX1(){
        System.out.println("X1:表示される");
        //testy2を実行しようとする
        testYyy.testy2();
    }
    //デッドロックが発生して表示されない
    synchronized void testX2(){
        System.out.println("X2:表示されない");

    }
}
