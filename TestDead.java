public class TestDead {
    public static void main(String args[]) {


        TestXXX testXxx = new TestXXX();
        TestYYY testYyy = new TestYYY();

        testXxx.testYyy = testYyy;
        testYyy.testXxx = testXxx;
       
        ThreadXXX tx = new ThreadXXX(testXxx);
        
        ThreadYYY ty = new ThreadYYY(testYyy);
        //threadXXXは、メソッドx1を実行後、メソッドy2を呼ぶ
        tx.start();
        //threadYYYは、メソッドx2を実行しようとx1が実行完了するまで待っている
        ty.start();

        try {
            tx.join();
            ty.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("終わり");
    }
}
