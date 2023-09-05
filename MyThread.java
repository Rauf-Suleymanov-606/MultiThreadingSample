public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            getArrayElements();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getArrayElements() throws Exception {
        int[] array = {1, 3, 5, 2, 4, 6, 7, 9, 11, 8, 10, 12, 15, 13, 14};
        if (Thread.currentThread().getName().equals("First thread")) {
            for (int i = 0; i <= array[4]; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + array[i]);
            }
        } else if (Thread.currentThread().getName().equals("Second thread")) {
            for (int j = 5; j < array[10]; j++) {
                System.out.println(Thread.currentThread().getName() + ":" + array[j]);
            }
        } else if (Thread.currentThread().getName().equals("Third thread")) {
            for (int k = 10; k <= array[14]; k++) {
                System.out.println(Thread.currentThread().getName() + ":" + array[k]);


            }

        } else {
            System.out.println("Invalid thread!");
        }
    }
}
