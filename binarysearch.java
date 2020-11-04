public class binarysearch
{
public static void main(String[] args)
{
int[] arr=new int[]{10,20,30,40,50,60,70,80,90};
int k=60;
int len=arr.length;
int mid;
int first=0;
int last=len-1;
while(first<=last)
{
mid=(first+last)/2;
if(arr[mid]==k)
{
System.out.println(k+"is found at index "+mid);
break;
}
else if(arr[mid]<k)
{
first=mid+1;
}
else
{
last=mid-1;
}

if(first>last)
{
System.out.println(k+" is not present in the array");

}
}
}
}