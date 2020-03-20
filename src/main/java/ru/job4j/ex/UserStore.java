package ru.job4j.ex;

public class UserStore {
    /**
     * Анти - null
     */
    public static final User EMPTY_USER = new User("EMPTY_USER", false);

    /**
     * Поиск пользователя
     * @param users массив
     * @param login ключ
     * @return нашли ? user : EmptyUser
     * @throws UserNotFoundException - вместо EMPTY_USER
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("This user is not validate");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", false)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException eui) {
            System.out.println(eui.getMessage());
            eui.getStackTrace();
        } catch (UserNotFoundException eunf) {
            System.out.println(eunf.getMessage());
            eunf.getStackTrace();
        }

    }
}