import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Java Sintaxe");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("-");
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteúdos Inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas" + devLucas.getConteudosConcluidos());

        System.out.println("-------");

        Dev devDuda = new Dev();
        devDuda.setNome("Maria Eduarda");
        devDuda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Duda" + devDuda.getConteudosInscritos());
        System.out.println("-");
        devDuda.progredir();
        System.out.println("Conteúdos Inscritos Duda" + devDuda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Duda" + devDuda.getConteudosConcluidos());


    }


}
