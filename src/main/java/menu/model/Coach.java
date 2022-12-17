package menu.model;

import menu.constants.ExceptionMessage;

public class Coach {
    private static final int MINIMUM_NAME_LENGTH = 2;
    private static final int MAXIMUM_NAME_LENGTH = 4;

    private final String name;

    public Coach(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (isLessThanTwo(name.length())) {
            ExceptionMessage.NAME_LESS_THAN_TWO.throwException();
        }
        if (isMoreThanFour(name.length())) {
            ExceptionMessage.NAME_MORE_THAN_FOUR.throwException();
        }
    }

    private boolean isLessThanTwo(int length) {
        return length < MINIMUM_NAME_LENGTH;
    }

    private boolean isMoreThanFour(int length) {
        return MAXIMUM_NAME_LENGTH < length;
    }
}
