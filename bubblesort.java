public class bubblesort
{
public static void main(String[] args)
{
int arr[]=new int[]{10,40,20,30,80,60,50};
int len=arr.length;
int i,j,temp=0;
for(i=0;i<len;i++)
{
for(j=1;j<len;j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}
}
}
for(i=0;i<len;i++)
{
System.out.print(arr[i]+ " ");
}
}
}