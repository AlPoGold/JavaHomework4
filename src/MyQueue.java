import java.util.Iterator;
import java.util.LinkedList;

public class MyQueue {

    LinkedList<Object> list = new LinkedList<>();
    int size;

    void enqueue(Object element){
        /**
         * @params Object , but need initialize accurate type
         * @return move to the end of queue
         * @author Polina
         */

        list.add(element);
    }

    Object dequeue(){
        /**
         * @params No arguments
         * @return return first element and remove it
         * @author Polina
         */
        Object elem = list.getFirst();
        Object element = elem;
        list.remove(elem);
        return element;
    }

    Object first(){
        /**
         * @params No arguments
         * @return return first element and don't remove it
         * @author Polina
         */
        Object elem = list.getFirst();
        return elem;
    }

    void iteratorMyQueue() {

        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println(" ");
    }
}
