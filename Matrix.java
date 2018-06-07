public class Matrix{
	public static void main(String[] args){
	int[][] MatrixFirst;
        MatrixFirst = new int[2][2];

        MatrixFirst[0][0] = 5;
        MatrixFirst[1][0] = 2;
        MatrixFirst[1][0] = 3;
        MatrixFirst[1][1] = 5;

	int[][] MatrixTwo = {
	{1,2},
	{2,3}
	};

	int[][] MatrixResult;
  MatrixResult = new int[2][2];

  for (int i = 0; i<2;i++){
          for (int j=0; j<2;j++){
			MatrixResult[i][j] = MatrixFirst[i][j] + MatrixTwo[i][j];
	}
}
        System.out.println("первая матрица\n");

        for (int i = 0; i<2;i++){
                for (int j=0; j<2;j++){
        System.out.print(MatrixFirst[i][j] + "\t");
        }
        System.out.println();
        }
        System.out.println("вторая матрица\n");


	 for (int i = 0; i<2;i++){
                for (int j=0; j<2;j++){
        System.out.print(MatrixTwo[i][j] + "\t");
        }
        System.out.println();
        }

        System.out.println("сумма матриц\n");

	for (int i = 0; i<2; i++){
                for (int j=0; j<2; j++){
        System.out.print(MatrixResult[i][j] + "\t");
        }
        System.out.println();
        }


	}
}
