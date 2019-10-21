package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by lj1218.
 * Date: 2019/10/20
 * Time: 上午10:53
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
