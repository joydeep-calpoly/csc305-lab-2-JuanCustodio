package Task;

 class Award {
	
	String award_Name;
	
	int year;
	
	Award(String award_Name, int year) {
		this.award_Name = award_Name;
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return award_Name + ", " + year;
	}
}