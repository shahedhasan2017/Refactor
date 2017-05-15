package refactoring;

public class Refactorable {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	void printOwing() {
		Enumeration<E> e = _orders.elements();
		double outstanding = 0.0;
		
		// print banner
		printBanna();
		
		// calculate outstanding
		outstanding = calculateOutstanding(e, outstanding);
		
		// print details
		printDetails(outstanding);
	}

	public double calculateOutstanding(Enumeration<E> e, double outstanding) {
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}

	public void printDetails(double outstanding) {
		System.out.println("Name : " + _name);
		System.out.println("Amount : " + outstanding);
	}

	public void printBanna() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}

}