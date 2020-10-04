package es.upm.miw.iwvg_devops.practice;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return this.numerator > this.denominator;
    }

    public boolean isEquivalent(Fraction candidate) {
        return (this.numerator * candidate.getDenominator()) == (this.denominator * candidate.getNumerator());
    }

    public Fraction add(Fraction addend) {
        int commonDenominator = commonDenominator(this.denominator, addend.getDenominator());

       commonDenominator =  (this.denominator * addend.getDenominator()) / commonDenominator;

       int newNumerator = (this.numerator) * (commonDenominator/this.denominator) + (addend.getNumerator()) * (commonDenominator/addend.getDenominator());

       return lowest(commonDenominator, newNumerator);
    }

    public Fraction multiply(Fraction factor) {
        return new Fraction(this.numerator * factor.getNumerator(),this.denominator * factor.getDenominator());
    }

    public Fraction divide(Fraction divisor) {
        return new Fraction(this.numerator * divisor.getDenominator() , this.denominator * divisor.getNumerator());
    }

    private Fraction lowest(int denominator, int numerator) {
        int common = commonDenominator(numerator, denominator);

        denominator = denominator / common;
        numerator = numerator / common;

        return new Fraction(numerator, denominator);
    }

    private int commonDenominator(int denominator1, int denominator2) {
        if (denominator1 == 0) return denominator2;
        return commonDenominator(denominator2 % denominator1, denominator1);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}