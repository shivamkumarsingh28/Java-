package Inner_Class;

class OuterClass {
    int x = 10;


    // cannot access outside object this class
    // private class InnerClass {
    //     int y = 5;
    // }

    // static class InnerClass {
    //     int y = 5;
        
    // }

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        // OuterClass myOuter = new OuterClass();
        // OuterClass.InnerClass myInner = myOuter.new InnerClass();
        
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();

        System.out.println(myInner.y);
    }
}
