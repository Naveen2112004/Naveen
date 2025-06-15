class polymorphism {
    int add (int a,int b) {
        return a+b;
    }
    double add (double a,double b) {
        return a+b;
    }
    String add (String a,String b) {
        return a+b;
    }
    public static void main(String[] args) {
        polymorphism p = new polymorphism();
        polymorphism method_over_loading = new polymorphism();
        char a [] = {'a','b'};
        System.out.println(method_over_loading.add(10,20));   }
}