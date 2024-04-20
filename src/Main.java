//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("ABCDEF","Riccardo","Colafrancesco","2000");
        System.out.println(p.getNome());
        System.out.println(p.getCf());
        System.out.println(p.getCognome());
        System.out.println(p.getAnno_nascita());
        p.setCf("FEDCBA");
        System.out.println(p.getCf());
        p.setNome("Luca");
        System.out.println(p.getNome());
    }
}