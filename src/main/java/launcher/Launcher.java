package launcher;

import cli.CliController;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by fendta on 07.07.14.
 */
public class Launcher {

    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream("settings.properties"));
            String launcher = properties.getProperty("launcher");
            switch (launcher) {
                case "cli":
                    CliController cliController = new CliController();
                    cliController.start(args);
                    break;
                case "gui":

                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
