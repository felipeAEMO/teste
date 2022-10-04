package persistence;
import java.util.ArrayList;
import java.util.List;
import domain.Cliente;
import domain.Veiculo;

public class ClienteDAO {

     static List<Cliente> clientes = new ArrayList<>();

    public static void incluir(Cliente cliente) {
        if(clientes.isEmpty()) {
            clientes.add(cliente);
        }
    }

    public static void validar(Cliente cliente) {
        if(cliente.equals(null)) {
            clientes.notify();
        }
    }

    public static void remover(Cliente cliente) {
        boolean isFull = true;
        if(clientes.contains(isFull)) {
            clientes.remove(cliente);
        }
    }

    public static List<Cliente> obterTodos() {
        return new ArrayList<>(clientes);
    }
}
