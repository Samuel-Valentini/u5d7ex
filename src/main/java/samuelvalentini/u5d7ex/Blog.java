package samuelvalentini.u5d7ex;

import samuelvalentini.u5d7ex.enumeration.Categoria;

import java.util.Random;

public class Blog {
    private long id;
    private Categoria categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;


    public Blog(Categoria categoria, String titolo, String contenuto) {
        Random random = new Random();
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.id = random.nextLong();
        this.cover = "https://picsum.photos/200/300";
        //stimo il tempo di lettura in 200 parole al minuto
        this.tempoDiLettura = (int) Math.ceil((double) (contenuto.trim().split("\\s+").length) / 200);
    }

    public long getId() {
        return id;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getTempoDiLettura() {
        return tempoDiLettura;
    }

    public void setTempoDiLettura(int tempoDiLettura) {
        this.tempoDiLettura = tempoDiLettura;
    }
}
