package sort.bubble;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortGeneric<E extends Comparable<E>> {
	Scanner scan = new Scanner(System.in);

	public void sortInt(ArrayList<Integer> list) {
		System.out.println("Sorting Integers\n");
		int numberOfElements = getSize();
		
		getInputInt(list, numberOfElements);
		System.out.println("Original Input : ");
		printList(list);
		System.out.println("After Bubble Sorted : ");
		bubbleSort(list);
		printList(list);
	}
	
	public void sortDouble(ArrayList<Double> list) {
		System.out.println("Sorting Doubles\n");
		int numberOfElements = getSize();
		
		getInputDouble(list, numberOfElements);
		System.out.println("Original Input : ");
		printList(list);
		System.out.println("After Bubble Sorted : ");
		bubbleSort(list);
		printList(list);
	}
	
	public void sortFloat(ArrayList<Float> list) {
		System.out.println("Sorting Floats\n");
		int numberOfElements = getSize();
		
		getInputFloat(list, numberOfElements);
		System.out.println("Original Input : ");
		printList(list);
		System.out.println("After Bubble Sorted : ");
		bubbleSort(list);
		printList(list);
	}
	
	public void sortString(ArrayList<String> list) {
		System.out.println("Sorting Strings\n");
		int numberOfElements = getSize();
		
		getInputString(list, numberOfElements);
		System.out.println("Original Input : ");
		printList(list);
		System.out.println("After Bubble Sorted : ");
		bubbleSort(list);
		printList(list);
	}
	
	public void getInputInt(ArrayList<Integer> list, int numberOfElements) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the integer elements to be sorted : ");
		for (int counter = 0; counter < numberOfElements; counter++)
			list.add(scan.nextInt());
	}
	
	public void getInputDouble(ArrayList<Double> list, int numberOfElements) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the double elements to be sorted : ");
		for (int counter = 0; counter < numberOfElements; counter++)
			list.add(scan.nextDouble());
	}
	
	public void getInputFloat(ArrayList<Float> list, int numberOfElements) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the float elements to be sorted : ");
		for (int counter = 0; counter < numberOfElements; counter++)
			list.add(scan.nextFloat());
	}
	
	public void getInputString(ArrayList<String> list, int numberOfElements) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the string elements to be sorted : ");
		for (int counter = 0; counter < numberOfElements; counter++)
			list.add(scan.nextLine());
	}
	
	public int getSize() {
		System.out.print("\nEnter the number of elements to be sorted : ");
		int numberOfElements = scan.nextInt();
		
		return numberOfElements;
	}
	
	public <E> void bubbleSort(ArrayList<E> list) {
		
		boolean isSwapped = false;
		
		for (int counter = 0; counter < (list.size() - 1); counter++) {
			for (int index = 0; index < (list.size() - counter - 1); index++) {
				if (((Comparable<E>) list.get(index)).compareTo(list.get(index+1)) > 0)
				{
					E temp = list.get(index);
					list.set(index, list.get(index+1));
					list.set((index+1), temp);
					isSwapped = true;
				}
			}
		}
	}
	
	public <E> void printList(ArrayList<E> list) {
		for (E element : list)
		{
			System.out.print(element + "\s\s");
		}
		System.out.println("\n");
	}
}
