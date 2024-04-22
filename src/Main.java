//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("ABCDEF","Riccardo","Colafrancesco","2000");
        System.out.println(p.getNome());
        System.out.println(p.getCf());
        System.out.println(p.getCognome());
        System.out.println(p.getAnno_nascita());

        Oggetto o = new Oggetto("BED120","Materasso","Casa","Lettiecuscini",30.50);
        printallobjects(o);
    }

    public static void printallobjects(Oggetto P){
        System.out.println(P.getIdentificativo());
        System.out.println(P.getNome());
        System.out.println(P.getClassificazione());
        System.out.println(P.getAzienda());
        System.out.println(P.getCosto());
    }
    public static void printall(Persona Q){
        System.out.println(Q.getNome());
        System.out.println(Q.getCf());
        System.out.println(Q.getCognome());
        System.out.println(Q.getAnno_nascita());
    }
}