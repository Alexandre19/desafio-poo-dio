import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Curso de JavaScript avancado");
        curso2.setCargaHoraria(25);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java para iniciantes");
        mentoria.setDescricao("Para quem esta comecando a carreira em java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp voltado para desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos: " + devAlexandre.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devAlexandre.getConteudosConcluidos());
        System.out.println("XP:" + devAlexandre.calcularTotalXp());

        System.out.println("-----------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("----");
        System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());




    }
}
