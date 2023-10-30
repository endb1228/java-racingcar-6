package racingcar.car;

import camp.nextstep.edu.missionutils.Randoms;

class Car {
    private String name;
    private int moveCount = 0;

    Car(String name) {
        this.name = name;
    }

    void tryOnce() {
        int i = Randoms.pickNumberInRange(0, 9);
        if (i>=4)
            moveCount++;
    }
}