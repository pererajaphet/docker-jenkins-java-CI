public class Main {
    public static void main(String[] args) {
        var result1 = testPlus();
        var result2 = testMoins();
        System.out.println(result1 + " & " + result2);

    }
    public static Double testPlus(){
        var operation = new Addition(1.0,2.0);
        return operation.plus();
    }

    public static Double testMoins(){
        var operation2 = new Soustraction(5.0,1.0);
        return operation2.moins();
    }

}