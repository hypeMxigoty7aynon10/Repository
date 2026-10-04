public class person {
    private String Name;
    private int Geburtsjahr;
    public person(String name, int geburtsjahr) {
        Name = name;
        Geburtsjahr = geburtsjahr;
    }

    public String getName() {
        return Name;
    }

    public int getGeburtsjahr() {
        return Geburtsjahr;
    }
}
