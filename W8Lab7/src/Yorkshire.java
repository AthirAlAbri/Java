// ****************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// ****************************************************
public class Yorkshire extends Dog
{
    public Yorkshire(String name, int a)
    {

        super(name, a);
    }

    // ------------------------------------------
//- overrides getName method in Dog
// -------------------------------------------
    public String getName(){
        return super.getName().toLowerCase();
}


    // ------------------------------------------
// Small bark -- overrides speak method in Dog
// -------------------------------------------
    public String speak()
    {
        return "woof";
    }
}
