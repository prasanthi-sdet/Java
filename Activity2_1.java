package javasession2;

class Activity2_1 extends Book{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Activity2_1 book1=new Activity2_1();
		book1.setTitle("Java");
		System.out.println("Title of the book: "+book1.getTitle());

	}

	@Override
	void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title=title;
	}
	

}
