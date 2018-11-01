package designPatterns.behavioral.strategy.third;

public enum Context  {
    ADD {
        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    },SUBTRACT {
        @Override
        public int calculate(int num1, int num2) {
            return num1 - num2;
        }
    },
        MULTIPLY{
            @Override
            public int calculate(int num1, int num2) {
                return num1*num2;
        }
    };

    public abstract int calculate(int num1, int num2);
}
