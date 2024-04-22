public class Oggetto {
    private String identificativo;
    private String nome;
    private String classificazione;
    private String azienda;
    private Double costo;

    public Oggetto(String identificativo, String nome, String classificazione, String azienda, Double costo) {
        this.identificativo = identificativo;
        this.nome = nome;
        this.classificazione = classificazione;
        this.azienda = azienda;
        this.costo = costo;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificazione() {
        return classificazione;
    }

    public void setClassificazione(String classificazione) {
        this.classificazione = classificazione;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
