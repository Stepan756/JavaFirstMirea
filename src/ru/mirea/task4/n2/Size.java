package ru.mirea.task4.n2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34) {
        @Override
        public String getDescription() {
            return "Взрослый размер";
        }
    },
    S(36) {
        @Override
        public String getDescription() {
            return "Взрослый размер";
        }
    },
    M(38) {
        @Override
        public String getDescription() {
            return "Взрослый размер";
        }
    },
    L(40) {
        @Override
        public String getDescription() {
            return "Взрослый размер";
        }
    };

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}