import java.util.*;
public class twodArry
{
    public static void main(String[] args)
    {
        int num1[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{2,3,4,5},
                        {4,5,55,6},
                       {99,3,44,5}};
        sprialMatrix(matrix);
//        for (int i = 0; i <num1.length ; i++)// no of row
//        {
//            for (int j = 0; j < num1[0].length; j++)//no of column
//            {
//               num1[i][j]=sc.nextInt();
//
//            }
//
//        }
//        for (int n = 0; n <num1.length ; n++)
//        {
//            for (int i = 0; i < num1[0].length; i++)
//            {
//                System.out.print(num1[n][i]+ "    ");
//            }
//            System.out.println();
//
//        }
    }
    // lest print the sprial matrix
    // for that we will take four variable'
    public static void sprialMatrix(int matrix[][])
    {
        int SizeOfRaw=matrix.length;
        int SizeOfcoumn=matrix[0].length;
        int startingRow=0;
        int endingRow=SizeOfRaw-1;
        int startingcolumn=0;
        int endingcolumn=SizeOfcoumn-1;
        while (startingRow<=endingcolumn && startingcolumn<=endingRow)// very very important line
        {

//                //top all colum  // here stating raw fixed
                for (int j = startingcolumn; j <= endingcolumn; j++) {
                    System.out.print(matrix[startingRow][j]+ " ");

                }
                //now for top top to bottom from right conner
                // here ending column will be fixed ..only row will move
                //we start with sarting raw +1 as one element as been printed of [1][end column]
                for (int j = startingRow + 1; j <= endingRow; j++) {
                    System.out.print(matrix[j][endingcolumn]+ " ");

                }// now bootom from rghr to left
                //last raw will be fixed// and ended last column has been prented soo start from endingcolumn-1
                for (int k = endingcolumn - 1; k >= startingcolumn; k--) {
                    System.out.print(matrix[endingRow][k]+ " ");

                }// bottom to top from left side
                // sating endraw -1 and will end stating rAW=1 // sating column will be fixed
                for (int l = endingRow - 1; l >= startingRow + 1; l--) {
                    System.out.print(matrix[l][startingcolumn]+" ");

                }
                startingcolumn++;
                startingRow++;
                endingcolumn--;
                endingRow--;
            }
        }

    }





