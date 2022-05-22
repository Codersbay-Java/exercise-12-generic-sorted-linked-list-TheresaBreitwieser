package list;


public class SortedLinkedList<S extends Comparable<S>> implements SortedList<S> {
	Node<S> head;
	private int size;

	@Override
	public void insert(S element) {
		Node<S> newNode = new Node<>(element);
		if(isEmpty()){
			head=newNode;
		} else {
			Node<S> current = head;
			Node<S> next = head;

			while(next !=null && next.getValue().compareTo(element) <= 0){
				current = next;
				next = next.getNext();
			}

			if(next == head) {
				newNode.setNext(next);
				head = newNode;
			}
			else {
					current.setNext(newNode);
					newNode.setNext(next);
				}
			}
		size++;
		}


	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public boolean delete(int index) {
		if(isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		} else if(index >= size ) {
			throw new IllegalArgumentException("Index not possible");
		} else if(size ==1) {
			head = null;
		} else if (index ==0) {
			head = head.getNext();
		}
		Node <S> current = head;
		for(int i=0; current != null; i++){
			if(i==index-1) {
				current.setNext(current.getNext().getNext());

			}
			current = current.getNext();
		}
		size --;
		return true;
	}

	@Override
	public S get(int index) {
		Node<S> temp = null;
		if(isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		} else if(index >= size ) {
			throw new IllegalArgumentException("Index not possible");
		}
		Node <S> current = head;
		for(int i=0; i<size; i++){
			if(i==index) {
				temp = current;
			}
			current = current.getNext();
		}
		return temp.getValue();
	}


	@Override
	public String toString() {

		String s="";
		Node<S> current = head;
		while(current!=null) {
			s += current.getValue().toString() + " | ";
			current=current.getNext();
		}

		return s;
	}

	@Override
	public int size() {
		return size;
	}

	private class Node<V> {
		private final V value;
		private Node next;

		public Node(V value) {
			this.value = value;
		}

		public V getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "{" +
					value +
					'}';
		}
	}


}
