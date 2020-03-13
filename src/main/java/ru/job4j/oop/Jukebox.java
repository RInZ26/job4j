package ru.job4j.oop;

/**
 * Класс проигрыватель
 *
 * @author RinZ26
 */
public class Jukebox {
    /**
     * Вспоминаем классику
     *
     * @param position номер трека
     */
    public void music(int position) {
	System.out.println(position == 1 ? "Пусть бегут неуклюже"
		: position == 2 ? "Спокойной ночи"
		: "Песня не найдена");
    }

    public static void main(String[] args) {
	Jukebox player = new Jukebox();
	for (int c = 0; c < 3; c++) {
	    player.music(c);
	}
    }
}
