public class stringp {
    public static void main(String[] args) {
        String s = "Kavan";
        char t='e';
        System.out.println(check(s,t));
        System.out.println(check1(s,t));
    }

    public static boolean check1(String st,char c)
    {
        for(char ch:st.toCharArray())
        if(ch==c)
        {
            return true;
        }

    }
    return false;


    public static boolean check(String st,char c)
    {
        for(int i=0;i<st.length();i++)
        {
            if(c==st.charAt(i))
            {
                return true;
            }

        }
        return false;
    }
}
