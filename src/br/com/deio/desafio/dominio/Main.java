
package br.com.deio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java Ninja", "Aprenda Java na pratica", 50);
        Mentoria mentoria = new Mentoria("Mentoria de Marketing", "Aprenda a como vender areia no deserto, pente para carecas e brócolis para crianças", LocalDate.now());
        
        System.out.println(curso);
        System.out.println(mentoria);
        
    }
}
