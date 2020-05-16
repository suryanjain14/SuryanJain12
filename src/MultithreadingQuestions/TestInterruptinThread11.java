package MultithreadingQuestions;

class TestInterruptinThread11 {
    class TestInterruptingThread11 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("task");
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread interrupted..." + e);
            }

        }

        public void main(String args[]) {
            TestInterruptingThread11 t1 = new TestInterruptingThread11();
            t1.start();
            try {
                t1.interrupt();
            } catch (Exception e) {
                System.out.println("Exception handled " + e);
            }

        }
    }
}
