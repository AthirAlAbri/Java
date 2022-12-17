public class QueueTester {
    public static void main(String[] args) {
        Queue supermarket = new Queue();

        supermarket.enqueue("Ali");
        supermarket.enqueue("Ahmed");
        String x = supermarket.dequeue();
        supermarket.enqueue("Mohammed");
        supermarket.enqueue("Hamed");

        while (supermarket.getCount() !=0) {
            String served = supermarket.dequeue();
            System.out.println(served);
        }


            //String nextServed = supermarket.dequeue();
            //System.out.println("Expect: Ahmed - " + nextServed);


    }

}
