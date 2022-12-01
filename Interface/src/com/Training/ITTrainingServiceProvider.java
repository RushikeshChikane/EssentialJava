package com.Training;

public class ITTrainingServiceProvider implements TrainingInterface{
	
	@Override
	public void Teach() {
		System.out.println("Candidate have been thought Computer science subjects");
	}
	
	@Override
	public void Evaluate() {
		System.out.println("Candidate have been evaluated against Computer Science ");
	}
	
	
	
	@Override
	public void ConductPractical(){
		System.out.println("Conducting java, .net, mysql, react Practical");
	}

}
