package ru.job4j.ex;


import java.util.Arrays;

public class FindEl {
    /**
     * Метод поиска индекса элемента по ключу
     *
     * @param value массив
     * @param key   ключ
     * @return индекс элемента / -1
     * @throws NullPointerException если был null
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int c = 0; c < value.length; c++) {
            if (value[c].equals(key)) {
                rsl = c;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемента нет");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (value.equals(abuse)) {
                throw new ElementAbuseException("Abuse abuse!!!");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            System.out.println(ea.getMessage());
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            System.out.println(en.getMessage());
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"tesst", "abba", "grime"}, "test");
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}