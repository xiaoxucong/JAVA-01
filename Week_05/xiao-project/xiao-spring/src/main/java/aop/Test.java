package aop;

public class Test {
	
	
    public static void main(String[] args) throws Exception {
        Dog dog = (Dog)new AopProxy().createProxy(new DogA());
        dog.eat();
    }
}
