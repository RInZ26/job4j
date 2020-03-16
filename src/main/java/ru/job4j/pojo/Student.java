package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс меодель данных - студент
 *
 * @author RinZ26
 */
public class Student {
    /**
     * ФИО
     */
    private String fullName;
    /**
     * Название / id группы
     */
    private String groupId;
    /**
     * Дата поступления
     */
    Date receiptDate;

    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    public String getGroupId() {
	return groupId;
    }

    public void setGroupId(String groupId) {
	this.groupId = groupId;
    }

    public Date getReceiptDate() {
	return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
	this.receiptDate = receiptDate;
    }


}
