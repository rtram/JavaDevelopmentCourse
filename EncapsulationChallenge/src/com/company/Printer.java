package com.company;

public class Printer {

    private int tonerLevel = 100;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel < 0 && tonerLevel <= 100) {
            this.tonerLevel =tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = (pages / 2) + (pages % 2);
        if (this.isDuplex) {
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return this.pagePrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
