package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;

import java.util.HashMap;

public class UserInterfaceImpl implements IUserInterfaceContract.View, EventHandler<KeyEvent> {
    public final Stage stage;
    private final Group group;

    //keep track of 81 fields
    private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;

    private IUserInterfaceContract.Eventlistener listener


    @Override
    public void handle(KeyEvent keyEvent) {

    }

    @Override
    public void setListener(IUserInterfaceContract.Eventlistener listener) {

    }

    @Override
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String Message) {

    }

    @Override
    public void showError(String message) {

    }
}
