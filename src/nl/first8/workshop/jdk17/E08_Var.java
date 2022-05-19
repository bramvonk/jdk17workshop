package nl.first8.workshop.jdk17;

public class E08_Var {
    private static class GenericInterfaceDrivenDependencyInjectionAspect {
        public void doIt() {
            System.out.println("This aspect is about the injection of dependencies, and does it via an interface, and is very generic");
        }
    }

    public static void main(String[] args) {
        // TODO wow, do we have to write this stuff 3 times? Or could we... get away with only telling java that it is a VARiable?
        GenericInterfaceDrivenDependencyInjectionAspect genericInterfaceDrivenDependencyInjectionAspect = new GenericInterfaceDrivenDependencyInjectionAspect();

        genericInterfaceDrivenDependencyInjectionAspect.doIt();
    }
}
