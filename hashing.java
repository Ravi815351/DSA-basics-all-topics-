import java.util.*;
//import java.util.HashMap;
public class hashing
 {
     public static void main(String[] args)
     {
         //crteate
         HashMap<String,Integer>hm=new HashMap<>();
         //insert
         hm.put("india",150);
         hm.put("china",50);
         hm.put("us",100);
         System.out.println(hm);
         //get
         int pop=hm.get("us");
         System.out.println(pop);
         // contain hoo rha ha ya nhi
         System.out.println(hm.containsValue("indooon"));// ye exist kre ga too  return true else  return False
         // remove any key // means values k sat hi remove ho jae ga
         hm.remove("us");
         System.out.println(hm.containsValue("us"));// check kr rhe k us remove hua ya nhi remove hua hoo ga false aae ga
         


     }
 }