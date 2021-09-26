package patterns;

import java.util.List;

public interface Observer {
    void handle(List<String> cryptoMoney, List<Integer> amount);
}
