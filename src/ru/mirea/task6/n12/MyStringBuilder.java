package ru.mirea.task6.n12;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStringBuilder {
    private StringBuilder sb = new StringBuilder();
    private Deque<Command> history = new ArrayDeque<>();

    public MyStringBuilder append(String s) {
        history.push(new Command() {
            @Override public void execute() { sb.append(s); }
            @Override public void undo()    { sb.delete(sb.length() - s.length(), sb.length()); }
        });
        history.peek().execute();
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        String deleted = sb.substring(start, end);
        history.push(new Command() {
            @Override public void execute() { sb.delete(start, end); }
            @Override public void undo()    { sb.insert(start, deleted); }
        });
        history.peek().execute();
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().undo();
        } else {
            System.out.println("Нечего отменять.");
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("Привет").append(", ").append("мир!");
        System.out.println("После append: " + msb);

        msb.undo();
        System.out.println("После undo: " + msb);

        msb.undo();
        System.out.println("После undo: " + msb);

        msb.undo();
        System.out.println("После undo: " + msb);

        msb.undo();   // нечего отменять
    }
}