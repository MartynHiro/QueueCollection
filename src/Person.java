public class Person {
    private String name;
    private String surname;
    private int ticketsAmount;

    public Person(String name, String surname, int ticketsAmount) {
        this.name = name;
        this.surname = surname;
        this.ticketsAmount = ticketsAmount;
    }

    public int getTicketsAmount() {
        return ticketsAmount;
    }

    public String getName() {
        return name + " " + surname;
    }

    public void setTicketsAmount(int newTicketsAmount) {
        this.ticketsAmount = newTicketsAmount;
    }
}
