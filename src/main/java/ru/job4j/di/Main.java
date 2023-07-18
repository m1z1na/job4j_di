package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);
        context.reg(StartUI.ConsoleInput.class);

        StartUI ui = context.get(StartUI.class);
        StartUI.ConsoleInput consoleInput = context.get(StartUI.ConsoleInput.class);

        consoleInput.askStr("Do your know who is creator?");
        ui.add("It is Petr Arsentev");
        ui.print();

     }
}