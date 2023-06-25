package WorkWithJava.MVP;

import java.io.IOException;

public class Controller {

    Model model = new Model();

    public void goProgram() throws IOException {
        model.workWithRegistry();
    }

}
