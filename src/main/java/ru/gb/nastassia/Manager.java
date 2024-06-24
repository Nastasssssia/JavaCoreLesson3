package ru.gb.nastassia;

import java.util.List;

/**
 * Класс, представляющий менеджера, который является расширением класса Employee.
 */
public class Manager extends Employee{
    // Поле для хранения списка подчиненных сотрудников
    private List<Employee> subordinates;

    /**
     * Конструктор с параметрами.
     *
     * @param id Идентификатор менеджера.
     * @param name Имя менеджера.
     * @param birthDateString Дата рождения менеджера в формате "yyyy-MM-dd".
     * @param department Отдел, в котором работает менеджер.
     * @param salary Зарплата менеджера.
     * @param subordinates Список подчиненных сотрудников.
     */
    public Manager(int id, String name, String birthDateString, String department, double salary, List<Employee> subordinates) {
        super(id, name, birthDateString, department, salary);
        this.subordinates = subordinates;
    }

    /**
     * Метод для добавления подчиненного сотрудника.
     *
     * @param employee Подчиненный сотрудник, которого нужно добавить.
     */

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    /**
     * Метод для получения списка подчиненных сотрудников.
     *
     * @return Список подчиненных сотрудников.
     */
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    /**
     * Статический метод для повышения зарплаты всем сотрудникам, кроме менеджеров.
     *
     * @param employees Массив сотрудников.
     * @param increaseAmount Сумма повышения зарплаты.
     */
    public static void increaseSalary(Employee[] employees, double increaseAmount) {
        for (Employee emp : employees) {
            if (emp != null && !(emp instanceof Manager)) {
                emp.setSalary(emp.getSalary() + increaseAmount);
            }
        }
    }

}
