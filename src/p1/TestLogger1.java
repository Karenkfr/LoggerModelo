package p1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogger1.class);

    public static void main(String[] args) {
        LOGGER.debug("Debug log");
        LOGGER.info("Info log");

    }
}
