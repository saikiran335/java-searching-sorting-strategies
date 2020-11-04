public class insertionsort 
{
public static void main(String a[])
{    
int[] arr = {8,16,4,7,21,43,5,9};
int n = arr.length;
int i,j;
 
for (j = 1; j < n; j++) 
{ 
int k = arr[j];  
i = j-1;  
  
while ( (i > -1) && ( arr [i] > k ) ) 
{  
arr [i+1] = arr [i];  
i--;  
}  
arr[i+1] = k;  
}  
for(i=0;i<n;i++)
{   
System.out.print(arr[i]+" ");    
}    
}    
}    