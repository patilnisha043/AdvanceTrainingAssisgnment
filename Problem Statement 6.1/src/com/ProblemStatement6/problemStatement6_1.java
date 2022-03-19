package com.ProblemStatement6;

import java.util.* ;
public class problemStatement6_1 {
public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<String>();//Creating arraylist  
    alist.add("Ravi");//Adding object in arraylist  
    alist.add("Vijay");  
    alist.add("Anuj");  
    alist.add("Ajay");
    alist.add("kamlesh");
    alist.add("pooja");
    System.out.println(alist);
    
    if (alist.contains("Ravi"))
        System.out.println("Ravi exists in the ArrayList");

    else
        System.out.println("Ravi does not exist in the ArrayList");

    if (alist.contains("Priya"))
        System.out.println("Priya exists in the ArrayList");

    else
        System.out.println("Priya does not exist in the ArrayList");
    
}
}
