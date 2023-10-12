package quizz;

import java.util.ArrayList;

public class Stats {

	public static double findMax(ArrayList<Double> numArray) {
		
		double maxNumber = numArray.get(0);
		
		for (int arrayIndex=0; arrayIndex < numArray.size(); arrayIndex++) {
			
			maxNumber = getGreatestNumber(maxNumber, numArray.get(arrayIndex));
			
		}
		return maxNumber;
	}
	
	
	public static double calculateSum(ArrayList<Double> numArray) {
		
		double finalSum = 0;
		
		for (double num : numArray) {
			finalSum += num;
		}
		
		return finalSum;
	}
	
	public static double calculateMean(ArrayList<Double> numArray) {
		return calculateSum(numArray) / numArray.size();
	}
	
	
	public static double calculateVariance(ArrayList<Double> numArray) {
		
		double mean = calculateMean(numArray);
		double finalVariance = 0;
		for (double num : numArray) {
			finalVariance += Math.pow(num - mean, 2);
		}
		return finalVariance / numArray.size();
	}
	
	
	public static double calculateStandardDeviation(ArrayList<Double> numArray) {
		double variance = calculateVariance(numArray);
		return Math.sqrt(variance);
	}
	
	public static double getGreatestNumber(double num1, double num2) {
		return num1 > num2 ? num1 : num2;
	}

}
