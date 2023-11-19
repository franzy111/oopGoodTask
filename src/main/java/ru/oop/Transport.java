package ru.oop;

public interface Transport extends Positioned{
    /**
     * Доехать, как можно ближе, до места назначения
     * @param destination место назначения
     */
    public void driveToNear(Position destination);

}
