public class Users {

    private String fio ;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Users(String fio, String position, String email, String telephone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя пользователя: " + fio + "; Должность: " + position + "; E-mail: " + email +
                "; Телефон: " + telephone + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    public static void main(String[] args) {
        Users[] userArray = new Users[5];
        userArray[0] = new Users("Солдатов Михаил Евгеньевич", "Директор", "dir@comcom.com", "+7 (909) 788-15-14", 100000, 54);
        userArray[1] = new Users("Козак Петр Валерьевич", "Заместитель директора", "zamdir@comcom.com", "+7 (916) 616-22-11", 100000, 49);
        userArray[2] = new Users("Троцкая Анфиса Степановна", "Бухгалтер", "buh@comcom.com", "+7 (919) 413-1820", 80000, 50);
        userArray[3] = new Users("Бухтеев Семен Владимирович", "Рабочий", "work1@comcom.com", "+7 (903) 500-92-64", 60000, 39);
        userArray[4] = new Users("Васильев Давид Андреевич", "Рабочий", "work2@comcom.com", "+7 (919) 715-6221", 70000, 41);

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].age > 40) {
                userArray[i].info();
            };
        }
    }
}
