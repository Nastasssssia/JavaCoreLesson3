package ru.gb.nastassia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee  {
    // Поля класса
    private int id;
    private String name;
    final String birthDateString;
    private String department;
    private double salary;

    /**
     * Конструктор с параметрами.
     * @param id Идентификатор сотрудника.
     * @param name Имя сотрудника.
     * @param birthDateString Дата рождения сотрудника в формате "yyyy-MM-dd".
     * @param department Отдел, в котором работает сотрудник.
     * @param salary Зарплата сотрудника.
     */
    public Employee(int id, String name, String birthDateString, String department, double salary) {
        this.id = id;
        this.name = name;
        this.birthDateString = birthDateString;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Возвращает идентификатор сотрудника.
     *
     * @return идентификатор сотрудника.
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает имя сотрудника.
     *
     * @return имя сотрудника.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает отдел, в котором работает сотрудник.
     *
     * @return отдел сотрудника.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Возвращает строку с датой рождения сотрудника.
     *
     * @return строка с датой рождения.
     */
    public String getBirthDateString(){
        return birthDateString;
    }

    /**
     * Возвращает зарплату сотрудника.
     *
     * @return зарплата сотрудника.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Устанавливает отдел, в котором работает сотрудник.
     *
     * @param department новый отдел сотрудника.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Устанавливает зарплату сотрудника.
     *
     * @param salary новая зарплата сотрудника.
     */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Возвращает объект LocalDate, представляющий дату рождения сотрудника.
     *
     * @return дата рождения сотрудника.
     */
    public LocalDate getBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(birthDateString, formatter);
    }


    /**
     * Возвращает компаратор для сравнения сотрудников по дате рождения.
     *
     * @return компаратор для сравнения сотрудников по дате рождения.
     */
    public static Comparator<Employee> birthDateComparator() {
        return Comparator.comparing(Employee::getBirthDate);
    }

    /**
     * Возвращает строковое представление объекта Employee.
     *
     * @return строковое представление объекта Employee.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDateString=" + birthDateString +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

}