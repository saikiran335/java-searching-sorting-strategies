public class linearsearch
{
public static void main(String[] args)
{
int[] arr=new int[]{10,20,30,40,50,60,70,80,90};
int k=60;
int i;

for(i=0;i<arr.length;i++)
{
if(arr[i]==k)
{
System.out.println(k +" is found at index "+i);
break;
}

}
if(i==arr.length)
{
System.out.println(k+" is not present in the array");

}
}
}