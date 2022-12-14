package employees;

public class Trainer {
	
	
	
	Trainer(String name,int trainingHour)
	{
		this.name = name;
		this.trainingHour = trainingHour;
	}
	
	
	
	
	private String name;
	private int trainingHour;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTrainingHour() {
		return trainingHour;
	}
	public void setTrainingHour(int trainingHour) {
		this.trainingHour = trainingHour;
	}

}
