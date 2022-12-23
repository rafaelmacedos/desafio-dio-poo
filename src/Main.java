import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", "Curso básico da linguagem JAVA", 25);
        Mentoria mentoria1 = new Mentoria("Mentoria de Java Básico", "Mentoria para tirar dúvidas de JAVA Básico");
        Curso curso2 = new Curso("Java Avançado", "Curso avançado da linguagem JAVA", 45);
        Mentoria mentoria2 = new Mentoria("Mentoria de Java Avançado", "Mentoria para tirar dúvidas de JAVA Avançado");

//        System.out.println(curso2.toString());
//        System.out.println(mentoria2.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);



        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + devCamila.getNome());
        System.out.println("Conteúdos inscritos:"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:"+ devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--- Após progressão");
        System.out.println("Conteúdos inscritos:"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:"+ devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


        System.out.println("");
        System.out.println("--------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + devJoao.getNome());
        System.out.println("Conteúdos inscritos:"+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("---- Após progressão");
        System.out.println("Conteúdos inscritos:"+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
