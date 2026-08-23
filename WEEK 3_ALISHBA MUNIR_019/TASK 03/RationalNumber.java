package OOP.WEEK03;

public class RationalNumber {
//    attributes
    private int numerator;
    private int denominator;
//    object count
    public static int count = 0;
//    null constructor
    public RationalNumber(){
        this.numerator = 2;
        this.denominator = 4;
        count++;
    }
//    parametrized constructor
    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        count++;
    }
//    copy constructor
    public RationalNumber(RationalNumber R){
        this.numerator = R.numerator;
        this.denominator = R.denominator;
        count++;
    }
//    setter methods
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
//    getter method
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public static int getCount(){
        return count;
    }

// METHOD 1: GCD (Greatest Common Divisor / Sab Se Bada Common Factor)

// Yeh method check karta hai ke wo sab se bada konsa number hai
// jo 'a' aur 'b' dono ko poori tarah divide (cut) kar sake.
    private int gcd(int a, int b) {
        // Negative numbers ko positive banate hain (kyun ke GCD hamesha positive hota hai)
        a = Math.abs(a);
        b = Math.abs(b);

        // Loop tab tak chalega jab tak remainder (b) 0 na ho jaye
        while (b != 0) {
            int temp = b;    // Temporary variable mein 'b' ki value save ki
            b = a % b;       // 'a' ko 'b' se divide kar ke remainder 'b' mein rakha
            a = temp;        // Purani 'b' ki value ko 'a' mein shift kiya
        }
        // Example: gcd(6, 8)
        //
        // Truth Table / Dry Run:
        //
        // ┌─────────┬───────┬───────┬─────────┬─────────┐
        // │ Step    │   a   │   b   │ temp    │ a % b   │
        // ├─────────┼───────┼───────┼─────────┼─────────┤
        // │ Start   │   6   │   8   │    -    │    -    │
        // │ 1       │   6   │   8   │    8    │    6    │
        // │ 2       │   8   │   6   │    6    │    2    │
        // │ 3       │   6   │   2   │    2    │    0    │
        // │ End     │   2   │   0   │    -    │    -    │
        // └─────────┴───────┴───────┴─────────┴─────────┘
        //
        // Jab b = 0 ho jata hai, loop stop hota hai.
        // Us waqt a = 2, jo GCD hai.

        // Jab b == 0 ho jaye, toh 'a' ke andar sab se bada common factor hota hai
        return a;
    }


// METHOD 2: SIMPLIFY (Fraction ko chota / lowest form mein lana)

// Yeh method GCD ko use kar ke numerator aur denominator dono ko
// chota karta hai taake fraction simplified ho jaye.
    public void simplify() {
        // 1. Numerator aur Denominator ka sab se bada common factor nikalte hain
        int commonFactor = gcd(this.numerator, this.denominator);

        // 2. Dono ko us common factor se divide kar ke chota banate hain
        // Example: Agar 6/9 hai aur factor 3 hai, toh 6/3 = 2 aur 9/3 = 3 ho jayega
        this.numerator = this.numerator / commonFactor;
        this.denominator = this.denominator / commonFactor;

        // 3. Extra Safety: Agar denominator minus (-) mein ho,
        // toh minus ko upar (numerator) mein shift kar dete hain.
        // Standard math mein 1/-2 ke bajaye -1/2 likha jata hai.
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

//     add method
    public RationalNumber add(RationalNumber t){
        int newNumerator = (this.numerator * t.denominator) + (t.numerator * this.denominator); // a/b + c/d = (a*d)+(c*b)/b*d crossmultiply
        int newDenominator = this.denominator * t.denominator;                        // here a/b is this and c/d is t
        RationalNumber answer = new RationalNumber(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }
//    subtract method
    public RationalNumber subtract(RationalNumber t){
        int newNumerator = (this.numerator *  t.denominator) - (t.numerator * this.denominator);
        int newDenominator = this.denominator * t.denominator;
        RationalNumber answer = new RationalNumber(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }
// multiply method
    public RationalNumber multiply(RationalNumber t){
        int newNumerator = this.numerator * t.numerator; // a/b * c/d = a*c / b*d
        int newDenominator = this.denominator * t.denominator;
        RationalNumber answer = new RationalNumber(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }
// divide method
    public RationalNumber divide(RationalNumber t){
        int newNumerator = this.numerator * t.denominator; // a/b divide c/d = a/b * d/c = a*d /b*c
        int newDenominator = this.denominator * t.numerator;
        RationalNumber answer = new RationalNumber(newNumerator, newDenominator);
        answer.simplify();
        return answer;
    }
//    toDecimal method
    public double Decimal(){
        double decimal = (double) numerator / denominator; // return type double use kiya tw isiliye decimal
        return decimal;                           // mai return karega
    }
//    Equals method
    public boolean equals(RationalNumber r){
        // Cross multiplication kar rahe hain
        // Example:
        // 1/2 and 2/4
        //
        // 1 × 4 = 4
        // 2 × 2 = 4
        //
        // Dono equal hain, isliye true return hoga
        return (numerator * r.denominator == r.numerator * denominator);
    }
// display method
    public void display(){
        System.out.println(this.numerator + "/" + this.denominator);
    }
//    toString method
    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
