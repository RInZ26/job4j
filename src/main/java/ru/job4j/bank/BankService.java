package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

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
	User user = findByPassport(passport);
	if (user != null) {
	    users.get(user).add(account);
	}
    }

    /**
     * Поиск пользователя по паспорту
     *
     * @param passport - ключ
     * @return User - null
     */
    public User findByPassport(String passport) {
	List<User> temp = users.keySet().stream().filter(o -> o.getPassport().equals(passport)).collect(Collectors.toList());
	return temp.size() != 0 ? temp.get(0) : null;
    }

    /**
     * Поиск аккаунта по реквизиту и паспорту (максимально по-идиотские без Optional)
     *
     * @param passport  ~
     * @param requisite ~
     * @return Account - null
     */
    public Account findByRequisite(String passport, String requisite) {
	User user = findByPassport(passport);
	List<Account> valueOfMap = user == null ? null
		: users.get(user);
	List<Account> result = valueOfMap == null ? null : valueOfMap.stream().filter(account -> account.getRequisite().equals(requisite)).collect(Collectors.toList());
	return result != null && result.size() != 0 ? result.get(0) : null;
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
	if (src != null && dest != null && src.getBalance() >= amount) {
	    src.setBalance(src.getBalance() - amount);
	    dest.setBalance(dest.getBalance() + amount);
	    result = true;
	}
	return result;
    }
}