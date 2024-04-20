public class Persona {
    private String cf;
    private String nome;
    private String cognome;
    private String anno_nascita;
    public Persona(String cf, String nome, String cognome, String anno_nascita){
        this.cf=cf;
        this.nome=nome;
        this.cognome=cognome;
        this.anno_nascita=anno_nascita;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getAnno_nascita() {
        return anno_nascita;
    }

    public void setAnno_nascita(String anno_nascita) {
        this.anno_nascita = anno_nascita;
    }
}
