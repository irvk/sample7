
public class TestHarness {

	public static void main(String[] args) {
		
		MessagePost messagePost = new MessagePost("jeff", "dont take a dog named shark to the beach");
		messagePost.like();
		messagePost.display();
		
		PhotoPost photoPost = new PhotoPost("jeff",  "sillyPhoto.jpg", "silly photo");
		String caption = photoPost.getCaption();
		photoPost.unlike();
		photoPost.unlike();
		
		System.out.println("caption: " + caption);
		photoPost.display();
		
	}
	
	
}
