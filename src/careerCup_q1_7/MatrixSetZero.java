package careerCup_q1_7;

public class MatrixSetZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question:
		//Write an algorithm such that if an element in an MxN matrix is 0,
		//its entire row and column is set to 0
		int[][] testMatrix ={{1,5,2,8,7},{5,9,9,0,2},{2,7,0,1,4}};
		
		System.out.println("Orignal one");
		for(int i=0;i<testMatrix.length;i++)
			for(int j=0;j<testMatrix[0].length;j++)
			{
				System.out.print(testMatrix[i][j]);
				if(j == testMatrix[0].length-1)
					System.out.println();
			}
		System.out.println("result one");	
		int[][] zeroMatrix = SetMarixZero(testMatrix);
		for(int i=0;i<zeroMatrix.length;i++)
			for(int j=0;j<zeroMatrix[0].length;j++)
			{
				System.out.print(zeroMatrix[i][j]);
				if(j == zeroMatrix[0].length-1)
					System.out.println();
			}
	}
	
	public static int[][] SetMarixZero(int[][] matrix)
	{
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		
		for (int i=0; i<row.length; i++)
			for(int j=0; j<column.length; j++)
			{
				if(matrix[i][j] ==0)
				{
					row[i] = 1;
					column[j] = 1;
				}
			}
		
		for (int i=0; i<row.length; i++)
			for(int j=0; j<column.length; j++)
			{
				if(row[i]==1 || column[j] == 1)
					matrix[i][j] =0;
			}
		
		return matrix;
	}

}
