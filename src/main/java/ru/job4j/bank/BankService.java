package ru.job4j.bank;

import java.util.*;

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
	Optional<User> optionalUser = findOptionalUserByPassport(passport);
	optionalUser.ifPresent(user -> users.get(user).add(account));
    }

    /**
     * Поиск пользователя по паспорту, посредством работы с результатом findOptionalUserByPassort
     * По сути просто обработчик результата
     *
     * @param passport - ключ
     * @return User - null
     */
    public User findUserByPassport(String passport) {
	return findOptionalUserByPassport(passport).orElse(null);
    }

    /**
     * Для лучшего масштабирования создаём отдельный метод для Optional
     * Тут мы находим Optional<User> по пасспорту
     *
     * @param passport - ключ
     * @return optional
     */
    private Optional<User> findOptionalUserByPassport(String passport) {
	return users.keySet().stream().filter(x -> x.getPassport().equals(passport)).findFirst();
    }

    /**
     * Обработка результатов findOptionalAccountByPassportAndRequisite
     *
     * @param passport  ~
     * @param requisite ~
     * @return Account - null
     */
    public Account findAccountByPassportAndRequisite(String passport, String requisite) {
	return findOptionalAccountByPassportAndRequisite(passport, requisite).orElse(null);
    }

    /**
     * Аналогично findOptionalPassport пытаемся сделать приватные методы, которые будут сейфово делать грязную работать через Optional
     *
     * @param passport  ключ
     * @param requisite ключ
     * @return optional
     */
    private Optional<Account> findOptionalAccountByPassportAndRequisite(String passport, String requisite) {
	Optional<User> optionalUser = findOptionalUserByPassport(passport);
	return optionalUser.isPresent() ? users.get(optionalUser.get()).stream().filter(x -> x.equals(new Account(requisite, -1))).findFirst() : Optional.empty();
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
	Optional<Account> srcOptionalAccount = findOptionalAccountByPassportAndRequisite(srcPassport, srcRequisite);
	Optional<Account> destOptionalAccount = findOptionalAccountByPassportAndRequisite(destPassport, destRequisite);
	boolean isAccountsExist = srcOptionalAccount.isPresent() && destOptionalAccount.isPresent();
	if (isAccountsExist && srcOptionalAccount.get().getBalance() >= amount) {
	    srcOptionalAccount.get().setBalance(srcOptionalAccount.get().getBalance() - amount);
	    destOptionalAccount.get().setBalance(destOptionalAccount.get().getBalance() + amount);
	    result = true;
	}
	return result;
    }
}