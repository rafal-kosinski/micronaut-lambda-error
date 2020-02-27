package example.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.function.client.FunctionClient;

import javax.inject.Named;
import java.util.List;
import java.util.Map;

@FunctionClient
@Requires(notEnv = Environment.TEST)
public interface ExampleFunctionClient {

    @Named("any-lambda")
    Map call();
}
