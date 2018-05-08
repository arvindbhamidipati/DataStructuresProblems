package hw1a;

import java.util.ArrayList;

public class ArrayOps
{
   /**
       This method goes through the given array of integers,
       yielding a new ArrayList from the array that contains the
       elements of the original array, with duplicates removed.
       @param theArray, an array of integer
       @return the new ArrayList

   */
   public static ArrayList<Integer> copyArray(int[] anArray)
   {
      // Complete this for the draft
	  System.out.println("Original array:");
	  for(int i = 0; i < anArray.length; i++) {
		  System.out.print(anArray[i] + " ");  
	  }
	  System.out.println("");
	   
	  ArrayList<Integer> newArrayList = new ArrayList<Integer>();
	  for(int i = 0; i < anArray.length; i++) {
		  while(!newArrayList.contains(anArray[i])) {
			  newArrayList.add(anArray[i]);
		  }
		 
	  }
	  System.out.println("New Arraylist: ");
	  for(int i = 0; i < newArrayList.size(); i++) {
		  System.out.print(newArrayList.get(i) + " ");
		  
	  }
      return (newArrayList);
   } 

   /**
       This method goes through the given array list of integers,
       yielding a new array from the array list that contains the
       elements of the original array list, with duplicates removed.
       @param theArrayList, an array list of integer
       @return the new array

   */
   public static int[] copyArrayList(ArrayList<Integer> anArrayList)
   {
	   
	   
	   System.out.println("");
	   System.out.println("Original Arraylist: ");
	   
	  for(int i = 0; i < anArrayList.size(); i++) {
		  System.out.print(anArrayList.get(i) + " ");
	  }
	   
      // Complete this for the final version
	  ArrayList<Integer> newArrayList = new ArrayList<Integer>();
	  for(int i = 0; i < anArrayList.size(); i++) {
		  while(!newArrayList.contains(anArrayList.get(i))) {
			  newArrayList.add(anArrayList.get(i));
		  }
	  }
	  System.out.println(" ");
	  System.out.println("New Array List: ");
	  
	  	  
	  int[] newArray = new int[newArrayList.size()];
	 
	  
	  for(int i = 0; i < newArray.length; i++) {
		  newArray[i]= newArrayList.get(i);
	  }

	  for(int i = 0; i < newArray.length; i++) {
		  System.out.print(newArray[i] + " ");
	  }
	  
      return newArray;
   }
   
   public static void main (String[] args) {
	   int [] anArray = { 2, 14, 9, 15, 9, 7, 3, 17, 14 };
	   ArrayList<Integer> arrayList = new ArrayList<Integer>();
	   arrayList.add(2);
	   arrayList.add(14);
	   arrayList.add(9);
	   arrayList.add(15);
	   arrayList.add(9);
	   arrayList.add(7);
	   arrayList.add(3);
	   arrayList.add(17);
	   arrayList.add(14);

	   copyArray(anArray);
	   copyArrayList(arrayList);
   }
	   
   
}