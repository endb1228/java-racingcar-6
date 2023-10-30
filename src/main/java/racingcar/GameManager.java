package racingcar;

import java.util.List;

public class GameManager {

    private static GameManager gameManager;

    private GameManager() {}

    public static GameManager getInstance() {
        if (gameManager == null) {
            gameManager = new GameManager();
        }
        return gameManager;
    }

    public void startGame() {
        List<String> nameList = IOManager.getInstance().readCarNameList();
        Cars cars = new Cars(nameList);
    }
}
