package Task;

import java.util.List;

import Task.Award;

 class Dignitary {
	
	String name;
	
	List<String> knownFor;

	List<Award> awards;
	
	
	 Dignitary(String name,List<String> knownFor, List<Award> awards ) {
		this.name = name;
		this.knownFor = knownFor;
		this.awards = awards;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(name).append("\n").append("Known For: \n");
		for (String known: knownFor) {
			sb.append("\t" + known).append("\n");
		}
		
		sb.append("Awards: \n");
		for(Award award: awards) {
			sb.append(award.toString()).append("\n");
		}
		return sb.toString();
	}
	
	
	
}