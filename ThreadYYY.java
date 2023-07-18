public class ThreadYYY extends Thread {
    TestYYY testYyy;

    ThreadYYY(TestYYY testYyy){
this.testYyy = testYyy;
    }

    public void run() {
        for(int i = 0; i < 100000; i++) {
            testYyy.testy1();
        }
    }
}
