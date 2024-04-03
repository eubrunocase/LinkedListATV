
public class ListaEncadeada {
	// Representação
    private ListNode head; 
    private ListNode tail;
    private ListNode previous;
    private int size; 
    private class ListNode {
            private Object element;
            private ListNode next;
            private ListNode(Object e, ListNode n) {
                  element=e; 
                  next=n;
             }
    }
    // Construtores
    public ListaEncadeada () {
    	size=0; 
        head=tail=previous=null;
    }
    // Métodos
    public int size() {
        return size;
    } 
    public boolean isEmpty() {
      	return (head==null);        
    }
    public boolean add (Object elem) {
        ListNode newElement = new ListNode(elem,null);
        if (head==null)       // insere em uma lista vazia
             head=tail=newElement;
        else 
             tail.next=newElement;
        tail=newElement;
        size++;
        return true;
    }
    public void clear() {
        head=tail=null;
        size=0;
    }
    public void print() {
		if (size==0) 
			System.out.println("<----Lista Vazia---->");
		else {
			System.out.println("<----Início---->");
			ListNode itr=head;
    			while (itr!=null) {
       			System.out.println(itr.element);
       			itr=itr.next;
    			}
			System.out.println("<----Fim---->");				
		}
		
    }
    public Object get (int index) {
       	if (index<0 || index>size-1)
    	   throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
     	else {
     		if (index == 0)  // caso particular (previous = null)
             		return head.element;
         		findPrevious(index);   
         		return previous.next.element;  	
    	}
    }
    private void findPrevious (int index) {
        ListNode itr=head;
        previous=null;
        for (int i=0;i<size;i++) {
           if (i==index)
              return;
           previous=itr;
           itr=itr.next;
        }
        return;  
    }
    public int indexOf (Object elem ) {
        ListNode itr=head;
        previous=null;
        for (int i=0;i<size;i++) {
              if (itr.element.equals(elem)) {
                 return i;
              }
              else {
                previous=itr;
                itr=itr.next;
              } 
        }
        previous=null;
        return -1;
    }

    public void add (int index, Object elem) {
    	if (index<0 || index>size)
     	   throw new IndexOutOfBoundsException("Index="+index+" e Size="+size );
    	else {
    		if (index==0) {                 //insere o elemento na posicao head
    			if (head==null)  {        // insere em uma lista vazia
    				ListNode newElement=new ListNode(elem,null);
    	            head=tail=newElement;
    	        }
    	        else {                  // insere em uma lista com um ou mais elementos
    	        	ListNode newElement=new ListNode(elem,head);
    	            head=newElement;    
    	        }
    		}
    	    else {
    	    	findPrevious(index);
    	        ListNode newElement=new ListNode(elem,previous.next);
    	        previous.next=newElement;
    	        if (newElement.next==null)  // o novo elemento e o novo tail
    	        	tail=newElement;
    	   }
    	}
    	size++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + size);
        } else {
            Object removedElement;
            if (index == 0) {
                removedElement = head.element;
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                findPrevious(index);
                removedElement = previous.next.element;
                previous.next = previous.next.next;
                if (previous.next == null) {
                    tail = previous;
                }
            }
            size--;
            return removedElement;
        }
    }

    public boolean remove(Object elem) {
        if (head == null) {
            return false;
        }
        if (head.element.equals(elem)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return true;
        }
        

}
