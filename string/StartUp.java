public class StartUp
{
    public static void main(String args[])
    { 
        String str = "abc";
        str += "def";
        str += "ghi";
        str += "jkl";
        System.out.println(str);

        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        sb.append("ghi");
        sb.append("jkl");
        System.out.println(sb); 
    }
}
