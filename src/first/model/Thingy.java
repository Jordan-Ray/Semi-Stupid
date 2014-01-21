package first.model;

public class Thingy
{
	// declaration section

	private String name;
	
	public Thingy()
	{
		name = "Thingy o' Destiny"; 
		name = "spicy hot tastiness";
		name = "lots of plot";
	}
 

	
	
	private String movie;
	
	public void setFood(String food)
	{
		this.food = food;
		
	}
	
	
	private String food;
	
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	
	public String getMovie()
	{
		return movie;
	}
	
	public String getFood()
	{
		return food;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}

	public String getName()
	{
		return name;
	}

}