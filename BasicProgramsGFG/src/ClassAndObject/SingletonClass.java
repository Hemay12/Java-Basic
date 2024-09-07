package ClassAndObject;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
    	System.out.println("Singleton instance created.");
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass(); // Create the instance if not already created
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton class!");
    }
    
    public void displayName() {
    	System.out.println("NAMe is name");
    }

    public static void main(String[] args) {
    	SingletonClass singletonObject = SingletonClass.getInstance();

        singletonObject.showMessage();  // Output: Hello from the Singleton class!
        singletonObject.displayName();
    }
}

