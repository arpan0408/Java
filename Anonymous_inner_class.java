/**
 * The difference between regular class(normal classes) and Anonymous Inner class

 * A normal class can implement any number of interfaces but the anonymous inner class can implement only one interface at a time.
 * A regular class can extend a class and implement any number of interfaces simultaneously. But anonymous Inner class can extend a class or can implement an interface but not both at a time.
 * For regular/normal class, we can write any number of constructors but we can’t write any constructor for anonymous Inner class because the anonymous class does not have any name and while defining constructor class name and constructor name must be same.
 */

interface test
{
    String name = "Arpan";
    int roll_no = 21;
    void show();
}

class Anonymous_inner_class
{
    public static void main(String[]args)
    {
        test obj = new test() //obj of inner class
        {
            public void show()
            {
                System.out.println(name+"\n"+roll_no);
            }
        };

        obj.show();
    }
}