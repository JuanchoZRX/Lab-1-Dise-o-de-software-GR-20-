public class Archivo implements Component {
    private final String name;
    private final int size;

    public Archivo(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}