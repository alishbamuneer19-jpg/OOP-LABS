package OOP;

public class point {
//    attributes
    private float x;
    private float y;
//    object count
    static int count = 0;
//    null constructor
    public point() {
        this.x = 1;
        this.y = 1;
        count++;
    }
//    parametrized constructor
    public point(float x, float y){
        this.x = x;
        this.y = y;
        count++;
    }
//    copy constructor
    public point (point P){
        this.x = P.x;
        this.y = P.y;
        count++;
    }
//    setter method
    public void setData(float x, float y){
        this.x = x;
        this.y = y;
    }
//    getter method
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public int getCount(){
        return count;
    }
//    locate method
    public void locate(){
        System.out.println("x = " + this.x + " y = " + this.y);
    }
//    add point method
    public point addPoint(point obj){
        float newx = this.x + obj.x;
        float newy = this.y + obj.y;
        return new point(newx, newy);
    }
//    subtract point method
    public point subPoint(point obj) {
        float newx = this.x - obj.x;
        float newy = this.y - obj.y;
        return new point(newx, newy);
    }
//    multiply point method
    public point multiPoint(point obj) {
        float newx = this.x * obj.x;
        float newy = this.y * obj.y;
        return new point(newx, newy);
    }
//     divide point method
    public point divPoint(point obj) {
        float newx = this.x / obj.x;
        float newy = this.y / obj.y;
        return new point(newx, newy);
    }
//    display method (this is known as informal method)
    public void display(){
        System.out.println("x = " + this.x + " y = " + this.y);
        System.out.println("count: " + getCount());
    }
//    toString method ( this is known as formal alternative to user defined display)
    public String toString(){
        String s = "x = " + this.x + " y = " + this.y;
        return s;
    }
}
