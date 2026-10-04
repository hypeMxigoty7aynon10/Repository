public class Schüler extends person {
    private int Schulnote;

    public Schüler(int schulnote, String name, int geburtsjahr) {
        super(name, geburtsjahr);
        Schulnote = schulnote;
    }

    public int getSchulnote() {
        return Schulnote;
    }
}
