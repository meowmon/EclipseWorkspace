
public class Stack {
	private Node top;
	private int size;
	Stack(){
		this.top = null;
		this.size = 0;
	}
	public void push(int item) {
		size++;
		Node sample = new Node();
		sample.setItem(item);
		sample.setNext(top);
		this.top = sample;
	}
	public int numOfElement() {
		return size;
	}
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else 
			return false;
	}
	public int pop() {
		if(isEmpty())
			return -1;
		else {
			int a = top.getItem();
			this.top = top.getNext();
			return a; 
		}
	}
	public void Display() {
		Node sample = top;
		for(int i=1; i<= this.size;i++){
			System.out.print(sample.getItem()+" ");
			sample = sample.getNext();
		}
		System.out.println(" ");
	}
	public int search(int item) {
		Node sample = top;
		try {
		for(int i=1; i<= this.size;i++){
			if(sample.getItem()==item)
				return i;
			sample = sample.getNext();
		}
		System.out.println(" ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
