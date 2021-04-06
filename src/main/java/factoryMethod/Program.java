package factoryMethod;

public class Program {
    public static void main(String[] args) {

//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeJavaCode();
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();

//        Developer developer = new CppDeveloper();
//        developer.writeCode();


        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is uncnown speciality  ");
        }

    }


}
