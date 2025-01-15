class Employee {
private String fullName;
private String position;
private String email;
private String phone;
private int salary;
private int age;

public Employee(String fullName, String position, String email, String phone, int salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
}

public void printInfo() {
    System.out.println("Full Name: " + fullName + " Position: " + position + " Email: " + email + " Phone: " + phone + " Salary: " + salary + " Age: " + age);
}

public int getAge() {
    return age;
}

public static void main(String[] args) {
    Employee[] employees = new Employee[5];

    employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 45);
    employees[2] = new Employee("Sidorov Sid", "Analyst", "sidorov@mailbox.com", "892312314", 50000, 41);
    employees[3] = new Employee("Kuznetsov Kuz", "Developer", "kuznetsov@mailbox.com", "892312315", 60000, 28);
    employees[4] = new Employee("Smirnov Smir", "Designer", "smirnov@mailbox.com", "892312316", 35000, 50);

    for (Employee employee : employees) {
        if (employee.getAge() > 40) {
            employee.printInfo();
        }
    }
}
}