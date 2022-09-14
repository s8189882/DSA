package sort.bubble;

import java.util.ArrayList;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Welcome to Bubble Sort Program!\n");
		BubbleSortGeneric genericObj = new BubbleSortGeneric<>();
		
		ArrayList<Integer> intList = new ArrayList();
		genericObj.sortInt(intList); 
		
		ArrayList<Double> doubleList = new ArrayList();
		genericObj.sortDouble(doubleList);
		
		ArrayList<Integer> floatList = new ArrayList();
		genericObj.sortFloat(floatList);
		
		ArrayList<Integer> stringList = new ArrayList();
		genericObj.sortString(stringList);
	}
}
