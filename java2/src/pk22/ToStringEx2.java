package pk22;

class Bk{
	
	int bookNumber;
	String bookTitle;
	
	Bk(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	
}
public class ToStringEx2 {

	public static void main(String[] args) {
		Bk book1 = new Bk(200, "����");
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
