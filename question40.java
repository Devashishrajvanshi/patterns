package patterns;

public class question40 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 && j==2 ||i==1 && j==3 ||i==1 && j==4 ||i==1 && j==5  )
				{
					System.out.print(" ");
				}
				else if(i==2 && j==3 ||i==2 && j==4 ||i==2 && j==5)
				{
					System.out.print(" ");
				}
				else if(i==3 && j==4 ||i==3 && j==5)
				{
					System.out.print(" ");
				}
				else if(i==4 && j==5)
				{
					System.out.print(" ");
				}
				else {
					System.out.print(j);
				}
			}
			for(int k=n-1;k>=1;k--)
			{
				if(i==1 && k==4 || i==1 && k==3|| i==1 && k==2)
				{
					System.out.print(" ");
				}
				else if(i==2 && k==4 || i==2 && k==3)
				{
					System.out.print(" ");
				}
				else if(i==3 && k==4)
				{
					System.out.print(" ");
				}
				else {
					System.out.print(k);
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}
