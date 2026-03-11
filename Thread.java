class th extends Thread {
    public void run() {
        System.out.println("Thread is running");

        try {
            Thread.sleep(10000); // Pauses the thread for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Again running");
    }
}

class th1 implements Runnable {
    public void run() {
        System.out.println("Thread is running");

        try {
            Thread.sleep(10000); // Pauses the thread for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Again running");
    }
}

class thy {
    public static void main(String[] args) {
        // Using Thread class
        th t = new th();
        
        // Using Runnable interface
        th1 runnableInstance = new th1();
        Thread thread2 = new Thread(runnableInstance);

        // Starting both threads
        t.start();
        thread2.start();
    }
}
