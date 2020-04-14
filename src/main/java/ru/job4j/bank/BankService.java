package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс, реализующий взаимосвязную работу Account и User
 *
 * @author RinZ26
 */
public class BankService {
    /**
     * Мапа пользователей, Пользователь - лист аккаунтов
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляем пользователя в систему map users
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавляем пользователю по паспорту аккаунт в лист аккаунтов
     *
     * @param passport ключ юзера
     * @param account  аккаунт
     */
    public void addAccount(String passport, Account account) {
        for (Map.Entry<User, List<Account>> userListEntry : users.entrySet()) {
            if (userListEntry.getKey().getPassport().equals(passport)) {
                userListEntry.getValue().add(account);
                break;
            }
        }
    }

    /**
     * Поиск пользователя по паспорту
     *
     * @param passport
     * @return User - EmptyUser
     */
    public User findByPassport(String passport) {
        User result = User.EMPTY_USER;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }

    /**
     * Поиск аккаунта по реквизиту и паспорту
     *
     * @param passport  ~
     * @param requisite ~
     * @return Account - EmptyAccount
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = Account.EMPTY_ACCOUNT;
        User user = findByPassport(passport);
        if (!user.equals(User.EMPTY_USER)) {
            List<Account> temp = users.get(user);
            for (int c = 0; c < temp.size(); c++) {
                if (temp.get(c).getRequisite().equals(requisite)) {
                    result = users.get(user).get(c);
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Перевод денег между пользователями и их счетами
     *
     * @param srcPassport   - паспорт  пользователя с которого списывают
     * @param srcRequisite  - реквизиты пользователя ^
     * @param destPassport  - паспорт пользователя, которому начисляют
     * @param destRequisite реквизиты ^
     * @param amount        - сумма
     * @return результат операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (!src.equals(Account.EMPTY_ACCOUNT) && !dest.equals(Account.EMPTY_ACCOUNT) && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            result = true;
        }
        return result;
    }
}