// import java.util.ArrayList;
// import java.util.Collections;


import java.util.*;

public class Sort_ArrayList {

    public static void main(String args[]){
         ArrayList<Integer>list = new ArrayList<>();

        list.add(3);
        list.add(14);
        list.add(7);
        list.add(9);
        list.add(1);

        // by default it will sort list in ascending oreder
        // Collections.sort(list);
        // System.out.print(list);


        //for sorting in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
        
    }


    
}
