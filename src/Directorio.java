import java.util.ArrayList;
import java.util.List;

public class Directorio implements Component {
    private final String name;
    private final List<Component> children;

    public Directorio(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void agregar(Component c) {
        children.add(c);
    }

    public void quitar(Component c) {
        children.remove(c);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (Component c : children) {
            total += c.getSize(); // recursión clave
        }
        return total;
    }

    public String getName() {
        return name;
    }
}