public class ThreadXXX extends Thread {
    TestXXX testXxx;

    ThreadXXX(TestXXX testXxx){
        this.testXxx = testXxx;
    }

    public void run() {
        for(int i = 0; i < 100000; i++) {
            testXxx.testX1();
        }
    }
}
