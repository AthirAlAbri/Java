/**
 * Model a queue = First in First out
 */
public class Queue {
    private String[] customers;
    private int capacity;
    private int front;

    /**
     * Creates a queue having capacity = 10
     */
    public Queue(){
        this.capacity = 10;
        this.customers = new String[capacity];
        this.front = -1;
    }

    /**
     * Creat a queue having given size
     * @param size
     */
    public Queue(int size){
       this.capacity = size;
       this.customers = new String[capacity];
       this.front = -1;
    }

    /**
     * insert a new	customer at	the	end	of	the	queue
     * @param name
     */
    public void enqueue(String name){
        if (this.front == -1){
            this.front++;
            this.customers[front] = name;
        } else {
            //shift all customers to the right
            if (front == this.capacity - 1){
                System.out.println("Queue if fall !!");
            } else{
                for (int i = front; i>=0; i--){
                    this.customers[i+1]= this.customers[i];
                }
                this.front++;
                this.customers[0] = name;
            }
        }
    }

    /**
     * which	will insert	a	new	customer at	the	end	of	the	queue
     * @return
     */
    public String dequeue(){
        if (front == -1){ //check queue is not emptu
            System.out.println("Queue is empty");
            return null;

        }else {
            String name = this.customers[this.front];
            this.customers[front] = null;
            this.front--;
            return name;
        }
    }

    /**
     * 	return	the	total	number	of customers	currently	on	the	queue
     * @return
     */
    public int getCount() {
        return this.front+1;
    }
}
