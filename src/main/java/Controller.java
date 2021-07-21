import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextArea;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation.ControllerCoffeeMaker;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private MediaView mv;
    private MediaPlayer mediaPlayer;
    private File file;
    private Media media;
    private ControllerCoffeeMaker coffeeMaker;
    @FXML
    private TextArea textAreaField;

    /**
     * Initializes the full videos of the coffee maker.
     *
     * @param url an url.
     * @param rb a resourceBundle.
     */
    @Override
    public void initialize(final URL url, final ResourceBundle rb) {
        file = new File("resources/videos/comercial.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mv.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();
        coffeeMaker = new ControllerCoffeeMaker();
        textAreaField.setText("Welcome Coffee Maker \nConsole Area...");
    }

    @FXML
    private void playVideo() {
        coffeeMaker.initCoffeeMaker();

        if (coffeeMaker.verifyConditionsForCoffeeMaker()) {
            file = new File("resources/videos/startButton.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
            textAreaField.setText("Starting coffee maker...!!!");
        } else {
            textAreaField.setText(coffeeMaker.printForInterface());
        }
    }

    @FXML
    private void playWater() {
        final int waterCups = 12;
        if (coffeeMaker.loadWater(waterCups)) {
            file = new File("resources/videos/water.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
        }
        textAreaField.setText(coffeeMaker.printForInterface());
    }

    @FXML
    private void playCoffee() {
        if (coffeeMaker.loadCoffeeBeans()) {
            file = new File("resources/videos/beansCoffee.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
        }
        textAreaField.setText(coffeeMaker.printForInterface());
    }

    @FXML
    private void playPutPot() {
        if (coffeeMaker.loadPotOverHeaterPlatePot()) {
            file = new File("resources/videos/loadPot.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
        }
        textAreaField.setText(coffeeMaker.printForInterface());
    }

    @FXML
    private void playRemovePot() {
        if (coffeeMaker.removePotOverPlateHeater()) {
            file = new File("resources/videos/removePot.mp4");
            media = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mv.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
        }
        textAreaField.setText(coffeeMaker.printForInterface());
    }

    @FXML
    private void exitCoffee() {
        coffeeMaker.exit();
    }

}
