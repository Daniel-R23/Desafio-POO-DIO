import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Daniel");
        dev1.inscrever(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev1.getNome() + ": " + dev1.getConsteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());


        Dev dev2 = new Dev();
        dev2.setNome("Levi");
        dev2.inscrever(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev2.getNome() + ": " + dev2.getConsteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

    }
}
