package first.model;

public class Friend
{
	private String name;
	private String humorStyle;
	private int age;
	private String interest;
	private boolean likesPinapple;
	private double weight;
	private boolean likesPineapple;

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void sethumorStyle(String humorStyle)
	{
		this.humorStyle = humorStyle;
	}

	public void setage(int age)
	{
		this.age = age;
	}

	public void setinterest(String interest)
	{
		this.interest = interest;
	}

	public void setlikesPineapple(boolean likesPineapple)
	{
		this.likesPinapple = likesPineapple;
	}

	public void setweight(double weight)
	{
		this.weight = weight;
	}

	// Getters
	public String getName()
	{
		return name;
	}

	public String getHumorStyle()
	{
		return humorStyle;
	}

	public int getAge()
	{
		return age;
	}

	public String getInterest()
	{
		return interest;
	}

	public boolean getlikesPineapple()
	{
		return likesPinapple;
	}

	public double getweight()
	{
		return weight;
	}

	/**
	 * Creates a default Friend with bad values
	 * 
	 */

	// Constructors
	public Friend()
	{
		name = "nameless";
		humorStyle = "less than none";
		age = -10;
		interest = "absolutely nothing";
		likesPinapple = false;
		weight = -99.9999999;
	}

	public Friend(String name, String humorStyle, int age, String interest,
			boolean likesPineaple, double weight)
	{
		setName(name);
		sethumorStyle(humorStyle);
		setage(age);
		setinterest(interest);
		setlikesPineapple(likesPineapple);
		setweight(weight);

	}

}
