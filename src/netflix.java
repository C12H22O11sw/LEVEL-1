//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.

	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
public class netflix {
	public static void main(String[] args) {
		Movie movieOne = new Movie("Star Wars",4);
		Movie movieTwo = new Movie("Lord of the Rings",5);
		Movie movieThree = new Movie("indiana Jones",4);
		Movie movieFour = new Movie("some other movie",1);
		Movie movieFive = new Movie("some other other movie",1);
		
		System.out.println( "this movie costs"+movieOne.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movieOne);
		queue.addMovie(movieTwo);
		queue.addMovie(movieThree);
		queue.addMovie(movieFour);
		queue.addMovie(movieFive);
		
		System.out.println(movieOne.getTitle()+","+movieTwo.getTitle()+","+movieThree.getTitle()+","+movieFour.getTitle()+","+movieFive.getTitle());
		System.out.println("the best movie is "	+ queue.getBestMovie());
		System.out.println("the second best movie is "+ queue.getSecoundBestMovie());
	}
}
