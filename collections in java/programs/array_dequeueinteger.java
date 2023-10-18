import java.util.*;
 
// ArrayDequeDemo
class array_dequeueinteger{
    public static void main(String[] args)
    {
        // Creating and initializing deque
        // Declaring object of integer type
        Deque<Integer> de_que = new ArrayDeque<Integer>(10);
 
        // Operations 1
        // add() method
 
        // Adding custom elements
        // using add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
 
        // Iterating using for each loop
        for (Integer element : de_que) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }
 
        // Operation 2
        // clear() method
        System.out.println("Using clear() ");
 
        // Clearing all elements using clear() method
        de_que.clear();
 
        // Operations 3
        // addFirst() method
 
        // Inserting at the start
        de_que.addFirst(564);
        de_que.addFirst(291);
 
        // Operation 4
        // addLast() method
        // Inserting at end
        de_que.addLast(24);
        de_que.addLast(14);
 
        // Display message
        System.out.println(
            "Above elements are removed now");
 
        // Iterators
 
        // Display message
        System.out.println(
            "Elements of deque using Iterator :");
 
        for (Iterator itr = de_que.iterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }
 
        // descendingIterator()
        // To reverse the deque order
        System.out.println(
            "Elements of deque in reverse order :");
 
        for (Iterator dItr = de_que.descendingIterator();
             dItr.hasNext();) {
            System.out.println(dItr.next());
        }
 
        // Operation 5
        // element() method : to get Head element
        System.out.println(
            "\nHead Element using element(): "
            + de_que.element());
 
        // Operation 6
        // getFirst() method : to get Head element
        System.out.println("Head Element using getFirst(): "
                           + de_que.getFirst());
 
        // Operation 7
        // getLast() method : to get last element
        System.out.println("Last Element using getLast(): "
                           + de_que.getLast());
 
        // Operation 8
        // toArray() method :
        Object[] arr = de_que.toArray();
        System.out.println("\nArray Size : " + arr.length);
 
        System.out.print("Array elements : ");
 
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
 
        // Operation 9
        // peek() method : to get head
        System.out.println("\nHead element : "
                           + de_que.peek());
 
        // Operation 10
        // poll() method : to get head
        System.out.println("Head element poll : "
                           + de_que.poll());
 
        // Operation 11
        // push() method
        de_que.push(265);
        de_que.push(984);
        de_que.push(2365);
 
        // Operation 12
        // remove() method : to get head
        System.out.println("Head element remove : "
                           + de_que.remove());
 
        System.out.println("The final array is: " + de_que);
		Deque<String> dq = new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("The");
        dq.addFirst("To");
        dq.addLast("Geeks");
 
        // offer() method to insert
        dq.offer("For");
        dq.offerFirst("Welcome");
        dq.offerLast("Geeks");
 
        // Printing Elements of ArrayDeque to the console
        System.out.println("ArrayDeque : " + dq);
		Deque<String> d = new ArrayDeque<String>();
 
        // add() method to insert
        d.add("One");
 
        // addFirst inserts at the front
        d.addFirst("Two");
 
        // addLast inserts at the back
        d.addLast("Three");
 
        // print elements to the console
        System.out.println("ArrayDeque : " + dq);
 
        // remove element as a stack from top/front
        System.out.println(d.pop());
 
        // remove element as a queue from front
        System.out.println(d.poll());
 
        // remove element from front
        System.out.println(d.pollFirst());
 
        // remove element from back
        System.out.println(d.pollLast());
    }
}