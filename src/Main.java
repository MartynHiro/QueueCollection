import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey", "Martynov", 5);
        Person nadya = new Person("Nadezhda", "Ryaguzova", 3);
        Person andrey = new Person("Andrey", "Shumakov", 1);
        Person julia = new Person("Julia", "Bobrovskaya", 7);
        Person matvey = new Person("Matvey", "Kutateladze", 2);

        Queue<Person> list = generateClients(sergey, nadya, andrey, julia, matvey);

        while (!list.isEmpty()) {
            Person nextClient = list.poll();
            System.out.println(nextClient.getName() + " прокатился на аттракционе");
            nextClient.setTicketsAmount(nextClient.getTicketsAmount() - 1);

            if (nextClient.getTicketsAmount() != 0) {
                list.offer(nextClient);
            }
        }
        System.out.println("Клиенты в очереди кончились");

    }

    public static Queue<Person> generateClients(Person first, Person second, Person third, Person fourth, Person fifth) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(first);
        queue.offer(second);
        queue.offer(third);
        queue.offer(fourth);
        queue.offer(fifth);
        return queue;
    }
}