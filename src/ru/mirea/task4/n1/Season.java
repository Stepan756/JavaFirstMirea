package ru.mirea.task4.n1;

public enum Season {
    WINTER(-5.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8.0) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    // Базовый метод — переопределяется в каждой константе
    public String getDescription() {
        return "Холодное время года";
    }
}