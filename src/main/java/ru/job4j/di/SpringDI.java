package ru.job4j.di;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
     /*   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(StartUI.ConsoleInput.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        StartUI.ConsoleInput consoleInput = context.getBean(StartUI.ConsoleInput.class);
        consoleInput.askStr("Do your know who is creator?");
        ui.add("Petr Arsentev");
        ui.print();*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.askStr("Do your know who is creator?");
        ui.add("Petr Arsentev");
        ui.print();
    }
}