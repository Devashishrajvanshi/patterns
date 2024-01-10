package patterns;

public class question30 {
public static void main(String[] args) {
	int n=7;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==2 && j==3 || i==2 && j==4 ||i==2 && j==5 )
			{
				System.out.print(" ");
			}
			else if(i==3 && j%2==0)
			{
				System.out.print(" ");
			}
			else if(i==4 && j==2 || i==4 && j==3 ||i==4 && j==5 ||i==4 && j==6 )
			{
				System.out.print(" ");
			}
			else if(i==5 && j%2==0)
			{
				System.out.print(" ");
			}
			else if(i==6 && j==3 || i==6 && j==4 ||i==6 && j==5 )
			{
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println();
	}
}
}
