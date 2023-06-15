import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws NoSuchElementException {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         
         str = str.replaceAll("[^0-9]"," ");
         str = str.trim();
         str = str.replaceAll(" + "," ");
         if(str.equals("")){
             System.out.println("-1");
         }
         else{
             System.out.println(str + "\n");
         }
         StringTokenizer sep = new StringTokenizer(str," ");
         int count = sep.countTokens();
         System.out.println("Number of tokens:" + count + "\n");
         String[] arr = new String[count];
         String temp="";
         for(int i =0; i<count; i++){
             temp=sep.nextToken();
             arr[i]=temp;
             
         }
         /*int k=0;
         while(sep.hasMoreTokens()){
             System.out.println(sep.nextToken());
             arr[k++] = sep.nextToken();
         }
         */
         //for(int i=0; i<count; i++){
          //  
         //}
         for(int i=0; i<count; i++){
             System.out.println(arr[i]);
         }
         System.out.println(Arrays.toString(arr));
        }
}
