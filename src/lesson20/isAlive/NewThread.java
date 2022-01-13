package lesson20.isAlive;

 class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + "прерван.");
            }
            System.out.println(name + " завершен.");
        }
    }
}
