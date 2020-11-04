public class selectionsort
{
public static void main(String[] args)
{
int arr[]=new int[]{12,7,5,3,9,4,8,6};
int n=arr.length;

int i,j;
for(i=0;i<n-1;i++)
{
int index=i;
for(j=i+1;j<n;j++)
{
if(arr[j]<arr[index])
{
index=j;
}
}
int temp=arr[i];
arr[i]=arr[index];
arr[index]=temp;
}
for(i=0;i<n;i++)
{
System.out.print(arr[i]+ " " );
}
}
}