/*Generics means parameterized types. 
The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces.
 Using Generics, it is possible to create classes that work with different data types.
 An entity such as class, interface, or method that operates on a parameterized type is a generic entity. */


 class test<T>
 {
    T value;
    public void setdata(T value) { this.value = value;};
    public void getdata(){ System.out.println(value);}
 }

 class generic
 {
    public static void main(String[]args)
    {
        test<Integer> obj = new test<Integer>();
        test<String> sobj = new test<String>();
        obj.setdata(7);
        sobj.setdata("Arpan");

        obj.getdata();
        sobj.getdata();
    }
 }