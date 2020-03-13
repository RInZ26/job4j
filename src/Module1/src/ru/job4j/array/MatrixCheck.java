package ru.job4j.array;

/**
 * Класс для проверок матриц!
 *
 * @author RinZ26
 */
public class MatrixCheck {
    /**
     * Строка в дмухмерном массиве целиком заполнена символом 'X'
     *
     * @param board проверяемая матрица
     * @param row   проверяемая строка в board
     * @return true - строка заполнена нужным символом, false - нет
     */
    public static boolean monoHorizontal(char[][] board, int row) {
	boolean isRight = true;
	for (int c = 0; c < row; c++) {
	    if (board[row][c] != 'X') {
		isRight = false;
		break;
	    }
	}
	return isRight;
    }

    /**
     * Столбец в двухмерном массиве целиком заполнен символом 'X'
     *
     * @param board  проверяемая матрица
     * @param column проверяемый столбец в board
     * @return true - столбец заполнен нужным символом, false - нет
     */
    public static boolean monoVertical(char[][] board, int column) {
	boolean isRight = true;
	for (char[] chars : board) {
	    if (chars[column] != 'X') {
		isRight = false;
		break;
	    }
	}
	return isRight;
    }

    /**
     * Извлечение диагонали у матрицы
     *
     * @param board заданная матрица
     * @return массив равный диагонали board
     */
    public static char[] extractDiagonal(char[][] board) {
	char[] array = new char[board[0].length];
	for (int c = 0; c < board[0].length; c++) {
	    array[c] = board[c][c];
	}
	return array;
    }

    /**
     * Проверка на выигрышную позицию в игре сокобан
     *
     * @param board матрица
     * @return true - победа, false - нет
     */
    public static boolean isWin(char[][] board) {
	char[] diagArr = extractDiagonal(board);
	boolean isRight = false;
	for (int c = 0; c < diagArr.length; c++) {
	    if (diagArr[c] == 'X') {
		if (monoHorizontal(board, c) || monoVertical(board, c)) {
		    isRight = true;
		    break;
		}
	    }
	}
	return isRight;
    }
}
