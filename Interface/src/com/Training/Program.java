package com.Training;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("ITtrainingServiceProvider Instance");
		
		TrainingInterface transflower=new ITTrainingServiceProvider();
		System.out.println("\ntransflower method invocation");
		transflower.Teach();
		transflower.Evaluate();
		transflower.ConductPractical();
		
		TrainingInterface qSpider=new ITTrainingServiceProvider();
		System.out.println("\nqSpider method invocation");
		qSpider.Teach();
		qSpider.Evaluate();
		qSpider.ConductPractical();
		
		System.out.println("\nCoreScienceTrainingServiceProvider Instance");
		TrainingInterface awateCollege=new CoreScinceTrainingServiceProvider();
		System.out.println("\nawateCollege method incovation");
		awateCollege.Teach();
		awateCollege.Evaluate();
		awateCollege.ConductPractical();
		
		TrainingInterface rajguruCollege=new CoreScinceTrainingServiceProvider();
		System.out.println("\nrajaguruCollege method invocation");
		rajguruCollege.Teach();
		rajguruCollege.Evaluate();
		rajguruCollege.ConductPractical();
		
		System.out.println("\nAuttomobileTrainingServiceProvider Instance");
		 TrainingInterface iitPune=new AutomobileTrainingServiceProvider();
		 System.out.println("\niitPune method invocation");
		 iitPune.Teach();
		 iitPune.Evaluate();
		 iitPune.ConductPractical();
		 
		 TrainingInterface iitNaraya=new AutomobileTrainingServiceProvider();
		 System.out.println("\niitNarayan method invocation");
		 iitNaraya.Teach();
		 iitNaraya.Evaluate();
		 iitNaraya.ConductPractical();
		 */
	    
		
		//This example using collection and interface we are solving 
		//College administration problem
		//empty list created
		//container
		List<TrainingInterface> institutes=new ArrayList<TrainingInterface>();
		
		//creating individual instance
		
		TrainingInterface transflower=new ITTrainingServiceProvider();
		TrainingInterface qSpider=new ITTrainingServiceProvider();
		
		TrainingInterface awateCollege=new CoreScinceTrainingServiceProvider();
		TrainingInterface rajguruCollege=new CoreScinceTrainingServiceProvider();
		
		TrainingInterface iitPune=new AutomobileTrainingServiceProvider();
		TrainingInterface iitNarayangaon=new AutomobileTrainingServiceProvider();
		
		//added Different Object in list
		
		institutes.add(transflower);
		institutes.add(qSpider);
		
		institutes.add(awateCollege);
		institutes.add(rajguruCollege);
		
		institutes.add(iitPune);
		institutes.add(iitNarayangaon);
		
		
		for(TrainingInterface institute : institutes ) {
			institute.Teach();
			institute.Evaluate();
			institute.ConductPractical();
			System.out.println("\n");
			
		}

	}

}
