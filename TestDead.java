public class TestDead {
    public static void main(String args[]) {


        TestXXX testXxx = new TestXXX();
        TestYYY testYyy = new TestYYY();

        testXxx.testYyy = testYyy;
        testYyy.testXxx = testXxx;

        ThreadXXX tx = new ThreadXXX(testXxx);
        ThreadYYY ty = new ThreadYYY(testYyy);

        tx.start();
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
