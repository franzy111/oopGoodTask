package ru.oop;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Выбор транспорта в зависимости от местаположения
     * @param destination
     * @return
     */
    Transport chooseTransport(Position destination);
}
