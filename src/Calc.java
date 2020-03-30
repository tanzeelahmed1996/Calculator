public class Calc {

    double firstVar ;
    double secondVar ;

    Calc(double first, double second){
        this.firstVar=first;
        this.secondVar=second;
    }

    public void addition(){
        double add = firstVar + secondVar;
        System.out.println(add);

    }

    public void subtraction(){
        double sub = firstVar - secondVar;
        System.out.println(sub);

    }

    public void multiply(){
        double times = firstVar * secondVar;
        System.out.println(times);

    }

    public void divide(){
        double divide = firstVar / secondVar;
        System.out.println(divide);

    }
}
