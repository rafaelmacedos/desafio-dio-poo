import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Python");
        curso1.setDescricao("Curso de Python Básico");
        curso1.setCargaHoraria(30);
        System.out.println(curso1.toString());

        System.out.println("");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Python");
        mentoria1.setDescricao("Mentoria para dúvidas em python");
        LocalDateTime dataHora = LocalDateTime.now();
        mentoria1.setDataHora(dataHora);
        System.out.println(mentoria1.toString());

        System.out.println("");

        Curso curso2 = new Curso("Java Básico", "Curso básico da linguagem JAVA", 25);
        Mentoria mentoria2 = new Mentoria("Mentoria de Java", "Mentoria para tirar dúvidas de JAVA");

        System.out.println(curso2.toString());
        System.out.println(mentoria2.toString());
    }
}
