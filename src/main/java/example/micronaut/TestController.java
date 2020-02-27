package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Map;

@Controller("/test")
public class TestController {

    private final ExampleFunctionClient exampleFunctionClient;

    public TestController(ExampleFunctionClient exampleFunctionClient) {
        this.exampleFunctionClient = exampleFunctionClient;
    }

    @Post("/function")
    Map callFunction() {
        return exampleFunctionClient.call();
    }
}
