public class Word {
    private String uno;

    public Word(String uno ){
        this.uno = uno;
    }

    public String getUno() {
        return uno;
    }

    @Override
    public String toString() {
        return "Word{" +
                "uno='" + uno + '\'' +
                '}';
    }
}
