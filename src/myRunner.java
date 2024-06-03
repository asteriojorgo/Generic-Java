public class myRunner {
    public static void main(String[] args) {
        DemoClass demoObj = new DemoClass();
        demoObj.genericsMethod(25);
        demoObj.genericsMethod("Hello World");
        demoObj.genericsMethod(3.141592);
        demoObj.genericsMethod('H');


        GMultipleDatatype<String, Integer> objectTwo = new GMultipleDatatype("Hello World", 21);
        System.out.print("Object Two: " + objectTwo.getValueOne() + ", ");
        System.out.println(objectTwo.getValueTwo());

        GMultipleDatatype<String, String> objectThree = new GMultipleDatatype("Hello World", "Hello World Again");
        System.out.print("Object Three: " + objectThree.getValueOne() + ", ");
        System.out.print(objectThree.getValueTwo());
    }
}
