import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descrição curso JavaScript", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        Dev dev2 = new Dev("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}
