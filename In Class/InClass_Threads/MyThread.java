class MyThread implements Runnable {
    public void run() {
        System.out.println(" this thread is running...");
    }
}

class ThreadEx2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}