package ru.mirea.task6.n13;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private StringBuilder sb = new StringBuilder();
    private List<Observer> observers = new ArrayList<>();

    // === Подписка ===

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.onUpdate(sb.toString());
        }
    }

    // === Делегирование методов StringBuilder ===

    public ObservableStringBuilder append(String s) {
        sb.append(s);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder append(char c) {
        sb.append(c);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder append(int i) {
        sb.append(i);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder insert(int offset, String s) {
        sb.insert(offset, s);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        sb.delete(start, end);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder deleteCharAt(int index) {
        sb.deleteCharAt(index);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder reverse() {
        sb.reverse();
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder replace(int start, int end, String s) {
        sb.replace(start, end, s);
        notifyObservers();
        return this;
    }

    public int length() {
        return sb.length();   // ← не меняет состояние, оповещать не надо
    }

    public char charAt(int index) {
        return sb.charAt(index);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}