package geekbrains.homework;

public class Main {

    public static void main(String[] args) {
        Employee[] arrEmployee = new Employee[5];
        arrEmployee[0] = new Employee("Иванов Иван Иванович", "менеджер по продажам", "ivanov777@mail.ru", "89775565766", 50000, 35);
        arrEmployee[1] = new Employee("Ломов Сергей Сергеевич", "менеджер по снабжению", "lom.s@mail.ru", "89060606634", 45000, 43);
        arrEmployee[2] = new Employee("Балясникова Наталья Александровна", "рекрутер", "natali333@mail.ru", "89098585343", 40000, 40);
        arrEmployee[3] = new Employee("Вакарова Алена Викторовна", "секретарь", "vak_al@mail.ru", "89772023443", 40000, 31);
        arrEmployee[4] = new Employee("Волкова Галина Ивановна", "бухгалтер", "galina_123@mail.ru", "89994765312", 45000, 44);

        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i].age >= 40) {
                arrEmployee[i].info();
            }
        }
    }
}
