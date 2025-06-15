class car {
    int model_number;
    String brand;
    car (int model_number) {
        this.model_number = model_number;
    }
    car (int model_number, String brand) {
        this.model_number = model_number;
        this.brand = brand;
    }
    void show() {
        System.out.println("Model Number: " + model_number);
        System.out.println("Brand: " + brand);
    }
    
    public static void main(String[] args) {
        car Volkswagen = new car(2015,"Volkswagen");
        Volkswagen.show();
        Volkswagen.show();
    }
}