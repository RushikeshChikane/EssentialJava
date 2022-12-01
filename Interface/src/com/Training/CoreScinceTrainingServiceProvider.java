package com.Training;

public class CoreScinceTrainingServiceProvider implements TrainingInterface{

	@Override
	public void Teach() {
		System.out.println("Candidate have been taught Physis, Chemistry, Biology Subjects ");
		
	}

	@Override
	public void Evaluate() {
		System.out.println("Candidate have been evaluated agaist physics, Chemisty, Biology");
		
	}

	@Override
	public void ConductPractical() {
	    System.out.println("Conducting Physics, Chemistry, Biological Practical");
		
	}
	
	

}
