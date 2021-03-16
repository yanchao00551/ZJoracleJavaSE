

class TestFactory01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = Factory.getInstance("ComputerBook");
		System.out.println(book.getTitle());
	}

}

