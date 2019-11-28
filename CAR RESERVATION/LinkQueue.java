public class LinkQueue implements Queue{
	private Node head = new Node(null);
	private int size;
	private static class Node{
		Object object;
		Node prev = this,next = this;
		Node(Object object, Node prev,Node next){
			this.object = object;
			this.next = next;
			this.prev = prev;
		} // end of constructor
		Node(Object object){
			this.object = object;
		} // end of another constructor
	} // end of Node class
	public Object first(){
		if(size == 0) throw new IllegalStateException("Stack is empty");
		return head.next.object;
	} // end of first
	public Object second(){
		if(size == 0) throw new IllegalStateException("Stack is empty");
		Object o = head.next.next.object;
		return o;
	} // end of second
	public Object secondLast(){
		if(size == 0) throw new IllegalStateException("Stack is empty");
		Object o = head.prev.prev.object;
		return o;
	}//end of Secondlast
	public void add(Object obj){
		head.prev = head.prev.next = new Node(obj,head.prev,head);
		++size;
	} // end of add
	public Object remove(){
		if(size == 0) throw new IllegalStateException("Stack is empty");
		Object obj = head.next.object;
		head.next = head.next.next;
		head.next.prev=head;
		--size;
		return obj;
	} // end of remove
	public int size(){
		return size;
	} // end of size
	public void show(){
		for(int i=0;i<size;i++){
			System.out.println(head.next.object);
			head = head.next;
		}head = head.next;
	} // end of show
	public String toString(){
		String s="";
		for(int i=0;i<size;i++){
		s+=head.next.next.object+" ";
			head = head.next;
		}
		return s;
	} // end of toString
	public Object[] toArray(){
		Object arr[] = new Object[size];
		for(int i=0;i<size();i++){
			arr[i] = head.next.object;
			head = head.next;
		}head = head.next;
		return arr;
	} // end of toArray
}