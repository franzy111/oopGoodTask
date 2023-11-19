package ru.oop;

public class Car implements Transport{
    /**
     * Посадка человека в машину
     * @param person человек
     */
    public Car(Person person) {
        // TODO
    }

    /**
     * Добраться, как можно ближе, до места назначения
     *
     * @param destination место назаначения
     */
    @Override
    public void driveToNear(Position destination) {
        // TODO
    }

    @Override
    public Position getPosition(){
        // TODO
        return null;
    }
}
