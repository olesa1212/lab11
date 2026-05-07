void main() {
    Student[] arr = new Student[3];
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    for(int i = 0; i < arr.length; i++){
        System.out.println("Введите ФИО:");
        String fio = scan1.nextLine();
        System.out.println("Введите год поступления:");
        int date = scan2.nextInt();
        System.out.println("Введите возраст:");
        int age = scan2.nextInt();
        System.out.println("Введите телефон:");
        String tel = scan1.nextLine();
        System.out.println("Введите курс:");
        String k = scan1.nextLine();
        System.out.println("Введите факультет:");
        String fac = scan1.nextLine();
        arr[i] = new Student(age, fio, tel, k, fac, date);
    }
    System.out.println();
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i].fio + " " + arr[i].getAge());
    }
    System.out.println("\nВведите общий факультет:");
    String a = scan1.nextLine();
    for(int i = 0; i < arr.length; i++){
        if(a.equals(arr[i].fac)) {
            System.out.println(arr[i].fio);
        }
    }
    System.out.println("\nВведите минимальный год:");
    int b = scan2.nextInt();
    for(int i = 0; i < arr.length; i++){
        if(b <= arr[i].getDate()) {
            System.out.println(arr[i].fio);
        }
    }
}
class Person{
    private int age;
    public String fio;
    public String tel;
    Person(int age, String fio, String tel){
        this.age = age;
        this.fio = fio;
        this.tel = tel;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
}
class Student extends Person{
    public String k;
    public String fac;
    private int date;
    Student(int age, String fio, String tel, String k, String fac, int date){
        super(age, fio, tel);
        this.k = k;
        this.fac = fac;
        this.date = date;
    }
    void setDate(int date){
        this.date = date;
    }
    int getDate(){
        return this.date;
    }
}
