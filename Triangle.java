public  class Triangle extends Shape {
    private double height;
    private double base;
public Triangle(){

}
    public Triangle(double height, double base)   {

        this.height = height;
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }

    public void setHeight(double height){


        this.height = height;
    }
    public void setBase(double base){

        this.base = base;
    }

    @Override
    public double calculateArea() {

        return 0.5 * height * base;
    }

    @Override
    public double calculateCircumference() {

        if (base != height ){
            System.out.println("the number must be the same");
            double s=2 * height / Math.sqrt(3);
            return s;
        }
        else {
            return base * 3;
        }
    }
}
