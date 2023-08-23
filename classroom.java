
import java.util.ArrayList;
public class classroom {

    

        public static void main(String args[]){

           // create a ArrayList
            ArrayList<Integer>list1 = new ArrayList<>();
            ArrayList<String>list2 = new ArrayList<>();
            ArrayList<Boolean>list3 = new ArrayList<>();

            // add in arraylist
            list1.add(1);
            list1.add(2);
            list1.add(3);

            System.out.println(list1);

            //get a element in list
            // int element = list1.get(2);
            // System.out.println(element);

            //delete element in list
            // list1.remove(1);
            // System.out.println(list1);

            // set element 
            list1.set(0,10);
            System.out.println(list1);


            System.out.println(list1.size());

            for(int i=0;i<list1.size();i++){

                System.out.print(" "+list1.get(i));

            }
            System.out.println();

        }

    }
    

