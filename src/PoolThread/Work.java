package PoolThread;

class Work implements Runnable {
        public int id;

        public Work(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Work " + id + " was completed");
        }

}
