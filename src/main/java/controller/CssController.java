package controller;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import was.annotation.Controller;
import was.annotation.Mapping;
import was.annotation.RequestMethod;
import was.domain.response.Response;

import java.util.Optional;

@Controller
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("unused")
public class CssController {
    private static final Logger logger = LoggerFactory.getLogger(CssController.class);

    @Mapping(method = RequestMethod.GET, path = "/css/styles.css")
    public static Optional<Response> css() {
        return Response.cssFromFile("./static/css/styles.css");
    }

    @Mapping(method = RequestMethod.GET, path = "/css/bootstrap.min.css")
    public static Optional<Response> bootstrapCss() {
        return Response.cssFromFile("./static/css/bootstrap.min.css");
    }
}
