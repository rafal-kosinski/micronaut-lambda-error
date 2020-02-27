package example.micronaut;

import io.micronaut.function.FunctionBean;

import java.util.Map;
import java.util.function.Supplier;

@FunctionBean("any-lambda")
public class AnyLambda implements Supplier<Map> {
    @Override
    public Map get() {
        return Map.of("response", "Some response");
    }
}
