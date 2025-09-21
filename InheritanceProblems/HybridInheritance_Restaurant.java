
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}

public class HybridInheritance_Restaurant {
    public static void main(String[] args) {
        Chef c = new Chef("Bob", 101);
        c.performDuties();
        Waiter w = new Waiter("Sam", 102);
        w.performDuties();
    }
}
