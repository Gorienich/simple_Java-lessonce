package ClassWork;

	public class Node<T> {

		private T value;
		private Node<T> next;
		
		public Node(T value, Node<T> next) 
		{ 
			this.value= value; 
			this.next= next; 
		} 
		
		public Node<T> getNext()        
		{
			return this.next;
		} 
		
		public void setNext(Node<T> next) 
		{
			this.next=next;
		} 
		
		public T getvalue()              
		{
			return this.value;
		} 
		
		public void setvalue(T value)       
		{
			this.value=value;
		}
	}

