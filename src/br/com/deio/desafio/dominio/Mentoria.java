package br.com.deio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(String t, String s, LocalDate d) {
        setTitulo(t);
        setDescricao(s);
        this.data = d;
    }

    @Override
    public String toString() {
        return "Mentoria{titulo=" + this.getTitulo() + ", descricao="+ this.getDescricao() + ", data=" + data + '}';
    }

//    @Override
//    public String toString() {
//        return "Mentoria: \t" + this.getTitulo() + 
//                "\ndescricao: \t" + getDescricao() + 
//                "\ndata: \t\t" + getData();
//    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
