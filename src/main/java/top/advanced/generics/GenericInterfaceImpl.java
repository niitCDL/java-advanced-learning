package top.advanced.generics;

public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
