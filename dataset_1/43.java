/*
 * @author Jayarathina
 * @date May, 06, 2009
 * Website: http://www.madharasan.com/
 * This program implements All Pairs Shortest Path algorithm by dynamic programming.
 */


import java.io.*;

class AllPairsShortestPath
{
	public static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
	static int [][] G;
	static int n;
	
	public static void main (String[] args) throws IOException
	{
		System.out.println("\t\t\t\tAll Pairs Shortest Path");
		
		System.out.print("\nEnter the number of the vertices: ");
		n = Integer.parseInt(br.readLine());
		
		G = new int[n+1][n+1];
		
		System.out.print("\nIf edge between the start and end nodes and its distance (enter -1 to quit) :\n");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				if(i != j)
					G[i][j]= 400000;//+ve infinity
				else
					G[i][j] = 0;
			}
				
		int i =0, j=0;
		do{
			System.out.print("Enter start node: ");
			i = Integer.parseInt(br.readLine());
			if((i<=0)||(i>n))
			{
				if(i==-1)
					break;
				System.out.println("Invalid start node!");
				continue;
			}
			System.out.print("Enter end node: ");
			j = Integer.parseInt(br.readLine());
			
			if((j<=0)||(j>n))
			{
				if(j==-1)
					break;
				System.out.println("Invalid end node!");
				continue;
			}
			if(j == i)
			{
				System.out.println("Start and end node cant be same!");
				continue;
			}
				
			System.out.print("Enter distance between "+i+" and "+j+": ");
			G[i][j] = Integer.parseInt(br.readLine());	
	
		}while( (i !=-1 ) && (j!=-1) );
		
		System.out.println("\n\nSolution :");
		APSP();
	}
	static void APSP()
	{
			int [][] A = new int[n+1][n+1];
			for(int i=1; i<=n; i++)
				for(int j=1; j<= n; j++)
					A[i][j] = G[i][j];

			for(int k=1; k<=n; k++)
				for(int i=1; i<= n; i++)
					for(int j=1; j<= n; j++)
						A[i][j] = Math.min(A[i][j], A[i][k]+A[k][j]);
						
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<= n; j++)
				{
					System.out.print(A[i][j]+"\t");
				}
				System.out.println();
			}

	}
}