/**
 * String :
 * A string is a sequence of characters. 
 * In java, objects of String are immutable which means a constant and cannot be changed once created. 
 * Initialize a String is one of the important pillars required as a pre-requisite with deeper understanding.
 * If a string is going to remain constant throughout the program, then use the String class object because a String object is immutable.
 * If a string can change (for example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
 * If a string can change and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous, so you have thread-safety.
 * If you don’t want thread-safety than you can also go with StringBuilder class as it is not synchronized.
 */

 class String_Buffer
 {
    public static void string(String str)
    {
        str += "World!";
    }
    public static void stringbuilder(StringBuilder str)
    {
        str.append("World!");
    }
    public static void stringbuffer(StringBuffer str)
    {
        str.append(" World!");
    }
    public static void main(String[]args)
    {
        String str = "Hello";
        string(str);
        System.out.println("String : "+str);
        StringBuffer sb = new StringBuffer("Hello");
        stringbuffer(sb);
        System.out.println("StringBuffer : "+sb);
        StringBuilder s1 = new StringBuilder("Hello ");
        stringbuilder(s1);
        System.out.println("StringBuilder : "+s1);
    }
 }