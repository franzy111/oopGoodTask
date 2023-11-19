package ru.oop;

public class Bus implements Transport {
    /**
     * Посадка человека в автобус
     * @param number номер
     * @param person человек
     */
    public Bus(String number, Person person) {
        // TODO
    }

    /**
     * Текущее местоположение
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * Добраться, как можно ближе, до места назначения
     *
     * @param destination место назначения
     */
    @Override
    public void driveToNear(Position destination) {

    }
}
