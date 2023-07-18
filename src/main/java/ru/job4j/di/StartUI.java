package ru.job4j.di;


import java.util.Scanner;

public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public class ConsoleInput {

        private Scanner scanner = new Scanner(System.in);

        public String askStr(String question) {
            System.out.print(question);
            return scanner.nextLine();
        }
    }
}
