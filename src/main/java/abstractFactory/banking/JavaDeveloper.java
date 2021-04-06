package abstractFactory.banking;

import abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("java developer writes java code");

    }
}
