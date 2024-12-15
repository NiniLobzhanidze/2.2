import ge.automation;

public class Main {
    public static void main(String[] args) {

        Interface replacer = new Interface();


        String resultA = replacer.replaceSymbolA("Lela");
        System.out.println("After replaceSymbolA: " + resultA);


        String resultB = replacer.replaceSymbolB("Gabelaia");
        System.out.println("After replaceSymbolB: " + resultB);
    }
}

