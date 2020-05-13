public class StartUp
{
    public static void main(String args[])
    { 
        int i = 3;
        while(i < 3)
        {
            System.out.println("Hello,World!!" + i + "/3");
            i++;
        } 
    
        
        String[] str = {"one", "two", "three"}; 

        // 通常のfor文
        for(int i=0; i<str.length; i++)
        {
            System.out.println(str[i]);
        } 

        // 拡張for文
        for(String s : str)
        {
            System.out.println(s);
        }        
    }
}
