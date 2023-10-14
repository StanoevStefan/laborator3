package Liste;

public class parabola {
    private final int a;
    private final int b;
    private final int c;

    public parabola(int a,int b,int c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public String toString(){
        return "parabola{" +
                "a=" + a +
                ", b="+ b +
                ", c="+ c +
                '}';
    }
    public Punct Varful(){
        int x,y;
        x=(-b / (2 * a));
        y=((-b * b + 4 * a * c) / 4 * a);
        return new Punct(x,y);

    }
}


