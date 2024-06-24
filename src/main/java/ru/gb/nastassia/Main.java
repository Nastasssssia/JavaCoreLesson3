package ru.gb.nastassia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[]args){

        // Создание сотрудников
        Employee emp1 = new Employee(1,"Alice", "2001-05-20","Recruiting",700);
        Employee emp2 = new Employee(2,"Bob", "2000-08-15","IT",2000);
        Employee emp3 = new Employee(3,"Julia", "2004-05-11","Recruiting",650);
        Employee emp4 = new Employee(4,"Ivan", "1998-08-23","IT",2500);

        // Сравнение сотрудников по дате рождения
        Comparator<Employee> comparator = Employee.birthDateComparator();
        int result = comparator.compare(emp1, emp2);
        if(result > 0){
            System.out.println(emp1.getName() + " младше " + emp2.getName());
        } else {
            System.out.println(emp1.getName() + " старше " + emp2.getName());
        }

        // Создание списков подчиненных для менеджеров
        List<Employee> subordinatesHR = new ArrayList<>();
        List<Employee> subordinatesIT = new ArrayList<>();

        // Создание менеджеров и добавление подчиненных
        Manager manager = new Manager(1,"Charlie", "1994-05-9","ManagerIT",8000,subordinatesIT);
        Manager manager1 = new Manager(2,"Nastya", "1996-09-19","ManagerHR",8000,subordinatesHR);
        manager.addSubordinate(emp1);
        manager.addSubordinate(emp2);

        manager1.addSubordinate(emp3);
        manager1.addSubordinate(emp4);

        // Вывод списка подчиненных менеджера
        System.out.println("Subordinates of " + manager1.getName() + ":");
        for (Employee subordinate : manager1.getSubordinates()) {
            System.out.println(subordinate);
        }

        // Создание массива сотрудников, включающего всех сотрудников и менеджеров
        Employee[] employees = {emp1, emp2, emp3, emp4, manager,manager1};


        // Повышаем зарплату всем сотрудникам, кроме руководителя
        Manager.increaseSalary(employees, 100);

        // Выводим информацию о всех сотрудниках
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

