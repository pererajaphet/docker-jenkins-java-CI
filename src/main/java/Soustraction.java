public class Soustraction extends Operations{
    public Soustraction(Double a, Double b){
        super(a,b);
    }

    public Double moins(){
        return (this.a - this.b);
    }
}
