import java.util.Scanner
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
class DequeExample
{
    // Queue elements after sortIndex are 
    // already sorted. This function returns
    // index of minimum element from front to
    // sortIndex
    public static int minIndex(Queue<Integer> list,
                                     int sortIndex)
    {
    int min_index = -1;
    int min_value = Integer.MAX_VALUE;
    int s = list.size();
    for (int i = 0; i < s; i++)
    {
        int current = list.peek();
         
        // This is dequeue() in Java STL
        list.poll();
 
        // we add the condition i <= sortIndex
        // because we don't want to traverse
        // on the sorted part of the queue,
        // which is the right part.
        if (current <= min_value && i <= sortIndex)
        {
            min_index = i;
            min_value = current;
        }
        list.add(current); 
    }
    return min_index;
}
     
    // Moves given minimum element 
    // to rear of queue
    public static void insertMinToRear(Queue<Integer> list,
                                             int min_index)
     {
        int min_value = 0; 
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
        int current = list.peek();
        list.poll();
        if (i != min_index)
            list.add(current);
        else
            min_value = current;
        }
        list.add(min_value);
    }
     
    public static void sortQueue(Queue<Integer> list)
    {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = minIndex(list,list.size() + i);
            insertMinToRear(list, min_index);
        }
    }
 
    //Driver function
    public static void main (String[] args) 
    {
        
        Queue<Integer> list = new LinkedList<>();
        
        list.add(30);
        list.add(11);
        list.add(15);
        list.add(4);
        list.add(3);
        System.out.println("Original Queue is " + list);
        
        
        sortQueue(list);
        System.out.println("Original Queue is " + list);
        
        while(!list.isEmpty())
        {
           // sortQueue(list);
            System.out.print(list.poll() + " ");
            //list.remove();
        }
        
       
        int integerNumber, HpI, LpI;
        //Sort Queue
       // sortQueue(list);
        
        System.out.println("Original Queue is " + list);
        System.out.print("Enter an item to be added to the queue ");
       
        //declare size
        Scanner N=new Scanner(System.in);
        integerNumber=N.nextInt();
        list.add(integerNumber);
       // sortQueue(list);
        System.out.println("New queue is " + list);
        
        
        //System.out.println("Original Queue is " + list);
        System.out.print("Enter an item to be removed ");
        //declare size
        Scanner S=new Scanner(System.in);
        integerNumber=S.nextInt();
        list.remove(integerNumber);
        //sortQueue(list);
        System.out.println("New queue is " + list);
        
        System.out.println("");
        System.out.println("Higher Priority Index = Current Integer + Index");
        System.out.print("Please enter an integer to be changed with a higher priority ");
        Scanner Hp=new Scanner(System.in);
        integerNumber=Hp.nextInt();
        list.remove(integerNumber);
        System.out.print("Please enter a priority index ");
        Scanner SHpI=new Scanner(System.in);
        HpI=SHpI.nextInt();
        
        int m=HpI+integerNumber;
        list.add(m);
        System.out.println("Integer  " + integerNumber + "  got added a priority index of " + HpI + "  and it became " + m);
        //sortQueue(list);
        System.out.println("After Priority was changed, current queue is " + list);
        
        System.out.println("");
        System.out.println("Lower Priority Index = Current Integer - Index");
        System.out.print("Please enter an integer to be changed with a lower priority ");
        Scanner Lp=new Scanner(System.in);
        integerNumber=Hp.nextInt();
        list.remove(integerNumber);
        System.out.print("Please enter a lower priority index ");
        Scanner LHpI=new Scanner(System.in);
        LpI=LHpI.nextInt();
        
        int n=integerNumber-LpI;
        
        list.add(n);
        System.out.println("Integer  " + integerNumber + "  got substracted a priority index of " + LpI + "  and it became " + m);
        //sortQueue(list);
        System.out.println("After Priority was changed, current queue is " + list);
        
        //print sorted Queue
        while(list.isEmpty()== false)
        {
            System.out.print(list.peek() + " ");
            list.poll();
        }
        
    }
    //Searching for an item in the Queue


}