class outer {
    private String Z = "Private Message";
    class inner {
        void display() {
            System.out.println(Z);
        }
    }
}
public class outerclass {
    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner inobj = obj.new inner();
        inobj.display();
    }
}