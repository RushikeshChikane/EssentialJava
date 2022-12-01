package com.Training;

public class AutomobileTrainingServiceProvider implements TrainingInterface{

	@Override
	public void Teach() {
		System.out.println("Candidate have been taught SOM, Tom, Dynamics Subjects");
		
	}

	@Override
	public void Evaluate() {
		System.out.println("Candidate havr been evaluated against Elements of Mechanical Engg");
		
	}

	@Override
	public void ConductPractical() {
		System.out.println("Conduct two stroke, four stroke practical");
		
	}
	
	

}
