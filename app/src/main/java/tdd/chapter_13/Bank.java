package tdd.chapter_13;

class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
