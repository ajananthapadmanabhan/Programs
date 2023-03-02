//program to find the 2nd largest number
import java.util.Arrays;
public class SecondLargestInArray{  
public static int findSecondLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];  
}  
public static void main(String args[]){  
int a[]={67,789,90,1,37,23};  
System.out.println("The second largest element is : "+findSecondLargest(a,6));  
}
}
