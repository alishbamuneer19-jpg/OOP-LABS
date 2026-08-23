package OOP.WEEK03;

//What is a Complex Number?
//A complex number has this form: a+bi
//Where:
//a = real part
//b = imaginary part
//i = imaginary unit
//i^2 = -1
//For example: 3+4i

public class ComplexNumber {
//    attributes
    private int real;
    private int imaginary;
//    object count
    public static int count = 0;
//    null constructor
    public ComplexNumber(){
        this.real = 3;
        this.imaginary = 4;
        count++;
    }
//    parametrized constructor
    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
        count++;
    }
//    copy constructor
    public ComplexNumber(ComplexNumber c){
        this.real = c.real;
        this.imaginary = c.imaginary;
        count++;
    }
//    setters
    public void setNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
//    getters
    public int getReal(){
        return this.real;
    }
    public int getImaginary(){
        return this.imaginary;
    }
    public static int getCount(){
        return count;
    }
//    add method
    public ComplexNumber add(ComplexNumber n){
     int newReal = this.real + n.real;
     int newImaginary = this.imaginary + n.imaginary;
     return new ComplexNumber(newReal, newImaginary);
    }
//    subtract method
    public ComplexNumber sub(ComplexNumber n){
        int newReal = this.real - n.real;
        int newImaginary = this.imaginary - n.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
//    multiply method
    public ComplexNumber multiply(ComplexNumber n){
        int newReal = (this.real * n.real) - (this.imaginary * n.imaginary);
        int newImaginary = (this.real * n.imaginary) + (this.imaginary * n.real);
        return new ComplexNumber(newReal, newImaginary);
    }
//    divide method
    public ComplexNumber divide(ComplexNumber n){
//        denominator
        int denominator =(n.real * n.real) + (n.imaginary * n.imaginary);
//    ensure denominator is not equal to zero before performing division to prevent runtime crash
        if (denominator == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
//        Real part
        int newReal = (this.real * n.real) + (this.imaginary * n.imaginary) / denominator;
//        Imaginary part
        int newImaginary = (this.imaginary * n.real ) - (this.real * n.imaginary) / denominator;

        return new ComplexNumber(newReal, newImaginary);
    }
//   conjugate method
    public ComplexNumber conjugate(){
        // Real part same rahega
        int newReal = this.real;

        // Imaginary part ka sign change hoga ex: 3 + 4i  →  3 - 4i  , 3 - 4i  →  3 + 4i
        int newImaginary = -this.imaginary;

        // New complex number return kar rahe hain
        return new ComplexNumber(newReal, newImaginary);
    }
//    Magnitude method
      public int magnitude() {
    // Formula:
    // |a + bi| = √(a² + b²)
          int magnitude =  (int) Math.sqrt ( this.real * this.real + this.imaginary * this.imaginary);
//          math.sqrt hamesa double mai hota hai lkn hum yahan int return return kr rhy hai that's why int likha
          return magnitude;
      }
//      Equals method
        public boolean equals(ComplexNumber n) {

            // Real parts ko compare kar rahe hain
            boolean realSame = this.real == n.real;

            // Imaginary parts ko compare kar rahe hain
            boolean imaginarySame = this.imaginary == n.imaginary;

            // Dono same hone chahiye
            return realSame && imaginarySame;
        }
//        toString method
    @Override
    public String toString(){
        if(this.imaginary >= 0){
            return "(" + this.real + " + " + this.imaginary + "i)";
        } else{
            return "(" + this.real + " - " + (-this.imaginary) + "i)";
        }
    }
//        display method
    public void display(){
        System.out.println(this.toString());
    }
}















