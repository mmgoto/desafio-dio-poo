
package br.com.deio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("ArrayIndexOutOfBounds", "Aprenda Java na pratica", 50);
        cursoJava.setTitulo("Curso de Java");
        Curso cursoJS = new Curso("JS não é Java!", "Aprendendo JS, porque a vida não é feita só de backend", 35);
        
        Mentoria mentoria = new Mentoria("Full Marketing", "Venda tudo pela metade do dobro", LocalDate.now());
        mentoria.setDescricao("Venda tudo");
        
        Bootcamp bootcamp = new Bootcamp("Java #0", "O melhor Bootcamp da DIO");
        
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria);
        
        Dev mick = new Dev("Michael Jéguisom");
        Dev billy = new Dev("Bily Jeans");
        
        mick.inscreverBootcamp(bootcamp);
        billy.inscreverBootcamp(bootcamp);
        
        mick.progredir();
        billy.progredir();
        billy.progredir();
        
        System.out.println("Mick");
        System.out.println("Incrito: "+ mick.getConteudosInscritos());
        System.out.println("Concluido: "+ mick.getConteudosConcluidos());
        System.out.println("XP: "+ mick.calcularXpTotal());
                
        System.out.println("\nBilly");
        System.out.println("Incrito: "+ billy.getConteudosInscritos());
        System.out.println("Concluido: "+ billy.getConteudosConcluidos());
        System.out.println("XP: "+ billy.calcularXpTotal());
        
    }
}
