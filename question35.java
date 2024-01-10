package patterns;

public class question35 {
public static void main(String[] args) {
	int n=7;
	int mid=(n/2)+1;
	int space=mid-1;
	int star=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			if(i==3 && k%2==0  || i==5 && k%2==0 )
			{
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		if(mid>i)
		{
			star+=2;
			space--;
		}
		else {
			star-=2;
			space++;
		}
		System.out.println();
		System.out.println();
	}
}
}
