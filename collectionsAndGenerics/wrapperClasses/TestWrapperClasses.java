package collectionsAndGenerics.wrapperClasses;

public class TestWrapperClasses {
    public static void main(String[] args) {
        // the value of wrapper object can't be changed
        int a = 6;
        a = 10; // allowed with primitives but not with wrapper object.
        Integer b = Integer.valueOf(7); // new Integer(int val) is depricated in new versions so use this systax

        /*
         * Autoboxing : Automatic conversion of primitives types to their correspondig
         * wrapper class object. eg. see below
         */
        Integer c = 55; // this is also another method. here java automatically creates object for value
                        // 55; Autoboxing
        /*
         * Unboxing : Automatic conversion of wrapper class object back to its
         * corresponding primitive type
         */
        int d = c; // eg. Unboxing
    }
}
