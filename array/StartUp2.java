public class StartUp
{
    public static void main(String args[])
    { 
        //配列宣言
        int[][] num1 = new int[3][4];

        num1[0][0] = 1;
        num1[0][1] = 2;
        num1[0][2] = 3;
        num1[0][3] = 4;
        num1[1][0] = 5;
        num1[1][1] = 6;
        num1[1][2] = 7;
        num1[1][3] = 8;
        num1[2][0] = 9;
        num1[2][1] = 10;
        num1[2][2] = 11;
        num1[2][3] = 12;

        for(int x = 0; x < 3; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                System.out.println( "[" + x + "][" + y + "] = " num1[x][y]);
            }
        }
    }
}
