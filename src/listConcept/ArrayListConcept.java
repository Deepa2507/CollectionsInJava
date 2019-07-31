package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3];
		
		//1. dynamic arraylist
		//2. Can store duplicate values
		//3. Maintains insertion order, whatever may be the addition sequence
		//4. Not synchronized	-- slow compared to other collections 
		//5. Allows random access to fetch the any element.		--any location element can be fetched
		//6. 
		
		//non generic Vs Generic
		//Arraylist defined below is non generic arraylist, we can add any datatype value to arraylist 
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(10);
		ar.add(40);
		ar.add(50);
		ar.add("Juice");
		ar.add("Water");
		ar.add(true);
		ar.add(11.33);
		ar.add('P');
		
		System.out.println(ar.size());		//size of arraylist
		System.out.println(ar.get(3));		//to get the value from particular index
		
		//To print all the values from arraylist :: 1. for loop
		//2.iterator
		System.out.println("*************FOR LOOP**************");
		for(int i =0;i<ar.size();i++){
			System.out.print(ar.get(i) + "  ");
		}
		
		//Generic arraylist defined below 
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("FDSF");		-->Not allowed at arraylist is generic
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tea");
		ar2.add("Coffee");
		

		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Tom", 35, "IT");
		Employee e2 = new Employee("Harry", 33, "GBS");
		Employee e3 = new Employee("Roger", 25, "GTS");
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		System.out.println("*************Iterator**************");
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()){
			Employee e= it.next();
			System.out.println("Name : " + e.name + "  Age :" + e.age + "  Dept :" + e.dept);
		}
		
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("Javascript");
		
		ar5.addAll(ar6);
		System.out.println("*************ADDALL Method**************");
		for(int i =0;i<ar5.size();i++){
			System.out.print(ar5.get(i) + "  ");
		}
		System.out.println();
		ar5.removeAll(ar6);
		System.out.println("*************Remove All Method**************");
		for(int i =0;i<ar5.size();i++){
			System.out.print(ar5.get(i) + "  ");
		}
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("dev");
		ar7.add("java");
		ar7.add("Javascript");
		
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		ar8.add("QTP");
		System.out.println();
		ar7.retainAll(ar8);					//Retain only common values between these 2 arraylist
		
		System.out.println("*************Retain All Method**************");
		for(int i =0;i<ar7.size();i++){
			System.out.print(ar7.get(i) + "  ");
		}
		
		System.out.println(" ");
		for(int i =0;i<ar8.size();i++){
			System.out.print(ar8.get(i) + "  ");
		}
		
		
		
		
	}

}
