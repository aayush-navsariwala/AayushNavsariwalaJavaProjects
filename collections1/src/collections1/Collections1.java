import java.util.*;

public class Collections1 {

    public static void main(String[] args)
{
/*
ArrayList<String> myList = new ArrayList<>();
myList.add("James");
myList.add("Sechaba");
myList.add("Richard");
myList.add("Mary");
myList.add("Mary");
myList.add(0, "Kelly");
myList.add(1, " ");
// Using Enhanced loop

for(String list : myList)
{
System.out.println(list);
}

//or

// using the Iterator class
Iterator tt = myList.iterator();
while(tt.hasNext())
// System.out.println(tt.hasNext());
{
System.out.println(tt.next());
}

*/

//LinkedList can store the duplicate elements, it maintains the insertion order.

    LinkedList<String> ll = new LinkedList<>();

ll.add("David");
ll.add("Janet");
ll.add("Chetty");
ll.add(0, "William");
ll.addFirst("Paul");
ll.add(1, " ");

Iterator tk = ll.iterator();
    while(tk.hasNext())
// System.out.println(tt.hasNext());
{
    System.out.println(tk.next());
}

// Vector uses a dynamic array to store data elements. It is similar to ArrayLis.
// Vector<String> vv = new Vector<String>();
// vv.add(1, "Daniel");
//vv.add("Greg");
//vv.add("Alfred");

// for(String tv : vv)

//{
// System.out.println(tv);
// }

// Stack implements the last- first - out data structure
Stack<String> st = new Stack<>();
st.add("Mike");
st.add("Larry");
st.push("Kelly");

Iterator kk = st.iterator();
    while (kk.hasNext())
{
    System.out.println(kk.next());
}

// Queue interface maintains the first - in - first - out order. It has classes like PriorityQueue
// ArrayDeque
Queue<String> qq1 = new PriorityQueue(); // It does not allow null values to be stored in the queue
Queue<String> qq2 = new ArrayDeque();

qq1.add("Kenneth");
qq2.add("Luke");

// A map is an interface that contains values on the basis of key.
// key and value pair. A Map contains unique keys
// A map is useful if you want to perform a search, update or delete elements on the basis of a key
// There are two interfaces for implementing Map in java
// Map and SortedMap

// And three classes HashMap, TreeMap and LinkedHashMap

//HashMap in Java stores the data in (Key, Value) pairs, and you can access
//them by an index of another type (e.g. an Integer)

// TreeMap stores key-value pairs in a sorted ascending order(based on the key).
//Lets you define a custom sort order.
//The retrieval speed of an element out of a TreeMap is fast, even in a TreeMap with a large number of elements.

Map<Integer, String> map = new HashMap<>();
map.put(100, "Nell");
map.put(101, "Tom");
map.put(102, "BigJohn");

for(Map.Entry m :map.entrySet())
{
    // System.out.println(m.getKey());
    // System.out.println(m.getValue());
    System.out.println(m.getKey()+ " " + m.getValue());
}

// or
// Create an empty hash map
HashMap<String, Integer> map1 = new HashMap<>();
// adding elements to the map using standard put

map1.put("Red", 10 );
map1.put("Green", 20);
map1.put("Blue", 30);
for(HashMap.Entry bb : map1.entrySet())
{
// System.out.println(bb.getKey() + " " + bb.getValue());
}

// To print size and content of the map
System.out.println("Size of map is: " + map.size());
System.out.println("Map content: " + map);

TreeSet set = new TreeSet();
TreeSet anotherSet = new TreeSet();

set.add(10);
set.add(20);
set.add(15);
set.add(5);

System.out.println("\nset is\n" + set);

anotherSet.addAll(set);

System.out.println("\nanotherSet is\n" + anotherSet);
}
}