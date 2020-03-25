package ru.job4j.tracker;

public class ValidateStubInput extends StubInput {
    public ValidateStubInput(String[] answers) {
        super(answers);
    }

    /**
     * Перегруженный метод, для проверки, что мы не вышли за предел доступных значений
     *
     * @param question ~
     * @param max      ~
     * @return ~
     */
    @Override
    public int askInt(String question, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question, max);
                invalid = false;
            } catch (IllegalStateException ils) {
                System.out.println(ils.getMessage());
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
