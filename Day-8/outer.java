class outer {
    private String Z = "Private Message";
    class inner {
        void display() {
            System.out.println(Z);
        }
    }
    public class StaticInner {
        void display() {
            System.out.println("Hi This is Static Inner Class");
        }
    }
}
public class OuterClass {
    public static void main(String[] args) {
        outer obj = new outer();
        outer.StaticInner sobj = obj.new StaticInner();
        sobj.display();`
    }
}