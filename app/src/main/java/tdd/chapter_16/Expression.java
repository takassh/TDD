package tdd.chapter_16;

interface Expression {
    Expression times(int multiplier);
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
