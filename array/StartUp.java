public class StartUp
{
    public static void main(String args[])
    { 
        //配列宣言
        int[] num1;

        //配列を生成
        num1 = new int[5];

        num1[0] = 12;
        num1[1] = 34;
        num1[2] = 56;
        num1[3] = 78;
        num1[4] = 90;

        System.out.println(num1[0]);
        System.out.println(num1[1]);
        System.out.println(num1[2]);
        System.out.println(num1[3]);
        System.out.println(num1[4]);
        
        //配列宣言＆初期化
        int[] num2 = {123, 456, 789, 0, 1}; 

        System.out.println(num2[0]);
        System.out.println(num2[1]);
        System.out.println(num2[2]);
        System.out.println(num2[3]);
        System.out.println(num2[4]);
    }
}
