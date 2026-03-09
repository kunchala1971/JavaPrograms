class StaticTest
{
    public static void main(String args[])
    {
        Person ramesh=new Person(100,"Ramesh","Java","KKCC");
        Person ramu=new Person(101,"Rajesh","Python","CCKK");
        ramesh.display();
        ramu.display();
        Person.showName(ramesh);
        Person.showName(ramu);
    }
}
class Person  {
    int code;
    String name;
    String course;
    static String brand;
    public Person(int code, String name, String course,String brand) {
        this.code = code;
        this.name = name;
        this.course = course;
        this.brand=brand;
    }
    public static void showName(Person per)
    {
        System.out.println(per.code + " " + per.name + " " + per.course + " " + brand);
    }
    public void display() {
        System.out.println("Code: " + code + ", Name: " + name + ", Course: " + course);
    }
}