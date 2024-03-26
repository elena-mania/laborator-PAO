package exercitii_lab;
public class Demonstratie {
    public static void main(String[] args) {
        String text="a";
        System.out.println(text.matches("[abc]"));
        String txt2,txt3,txt4,txt5,txt6,txt7,txt8;
        txt2="p";
        System.out.println(txt2.matches("[^abc]"));
        System.out.println(txt2.matches("[a-z]"));
        txt3="B";
        System.out.println(txt3.matches("[a-zA-Z]"));
        txt4="abbaca";
        System.out.println(txt4.matches("[abc]+"));
        txt5="";
        System.out.println(txt5.matches("[abc]*"));
        txt6="ababc";
        System.out.println(txt6.matches("[abc]{5}"));
        txt7="aaaabbbbcccc";
        System.out.println(txt7.matches("[abc]{5,}"));
        txt8="aabbcc";
        System.out.println(txt8.matches("[abc]{5,10}"));

        String sir="Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println("Lungimea sirului este: "+sir.length());

        //afisare daca textul are doar litere mari sau doar litere mici
        boolean lowercase=sir.matches("[a-z]+");
        boolean uppercase=sir.matches("[A-Z]+");
        if(lowercase&&uppercase){
            System.out.println("Textul contine doar litere mari si mici!");
        }
        else System.out.println("Textul nu contine doar litere mari si mici");
        String[] splitSir=sir.split("[ .?!,:;]");

        if(splitSir.length%2==0){
            System.out.println("Cuvintele din mijloc sunt: "+splitSir[splitSir.length/2-1]+" "+splitSir[splitSir.length/2]);
        }
        else System.out.println("Cuvantul din mijloc este: "+splitSir[splitSir.length/2]);

        StringBuilder sirReverse=new StringBuilder(sir).reverse();
        System.out.println("Sirul inversat este: "+sirReverse);

        System.out.println("\n");

        ///DEMONSTRATIE SINGLETON:
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        // Verif daca sunt diferite instantele
        if (singletonInstance1 == singletonInstance2) {
            System.out.println("Cele două instanțe sunt identice.");
        } else {
            System.out.println("Cele două instanțe sunt diferite.");
        }

    }
}
