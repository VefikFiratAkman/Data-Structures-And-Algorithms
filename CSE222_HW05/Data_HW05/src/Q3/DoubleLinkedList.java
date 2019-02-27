package Q3;

/**
 * DoubleLinkedList Classı
 * Bildigimiz LinkedListin geriye dogru da gidilebilir hali.
 * @param <T> listenin generic olmasi icin
 * implements comparable
 */
public class DoubleLinkedList<T> implements Comparable<T>{
    Node head; // head of list
    private int size = 0;

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(T o) {
        return 0;
    }


    /**
     * İnner classtir.
     * Listeyi olusturan nodelardir.
     *
     */
    class Node
    {
        T data;
        Node prev;
        Node next;

        /**
         * Node classinin parametreli constructoridir.
         * @param d gelen datadir.
         */
        Node(T d){
            data=d;
        }


    }

    /**
     * gelen datayi listenin sonuna yeni node olarak ekler.
     * @param new_data disaridan gelen data
     */
    public void add(T new_data){

        Node temp = new Node(new_data);
        temp.next = null;


        Node headNode = head;
        if(head == null)
        {
            temp.prev = null;
            head = temp;
            ++size;
            return;
        }
        while(headNode.next != null) {
            headNode = headNode.next;
        }

        headNode.next = temp;
        temp.prev = headNode;
        ++size;

    }

    /**
     * baska listenin tum elemanlarini
     * tek seferde listeye eklemek icindşir.
     * @param other disaridan gelen liste
     */
    public void addAll(DoubleLinkedList<T> other){
        for(int i=0; i<other.size();++i){
            add(other.get(i));
        }
    }

    /**
     * listenin icinde verilen indexde ki
     * node'un datasini dondurur.
     * @param index liste de ki elemanin indexi
     * @return index de ki node'un datasi
     */
    public T get(int index){
        Node temp = head;

        if(index == 0) {

            return head.data;
        }
        else {
            for (int i = 0; i < index; ++i) {
                temp = temp.next;
            }
            return temp.data;
        }

    }

    /**
     * @return listenin size'ini return eder.
     */
    public int size(){
        return size;
    }

    /**
     * Tum listeyi sirayla basar
     */
    public void print(){
        Node temp = head;
        while(temp!=null) {
            System.out.println( temp.data);
            temp = temp.next;
        }
    }

    /**
     * listenin basinda ki node'u siler
     * @return silinen node'un datasini return eder.
     */
    public T removeFirst(){

        T reData = head.data;
        head = head.next;
        --size;
        return reData;
    }


}
