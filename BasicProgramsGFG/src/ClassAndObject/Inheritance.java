package ClassAndObject;

class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 10000;
}

class Inheritance extends Engineer{
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println(E1.salary);
        System.out.println(E1.benefits);
        
        Inheritance in1 = new Inheritance();
        System.out.println(in1.salary);
        System.out.println(E1.benefits);
    }
}