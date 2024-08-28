package org.example;

public class StringToReverse {
    private String stringToReverse;

    public StringToReverse(String stringToReverse) {
        this.stringToReverse = stringToReverse;
    }


    public String getStringToReverse() {

        return stringToReverse;
    }

    public void setStringToReverse(String stringToReverse) {

        this.stringToReverse = stringToReverse;
    }

    public String reverse() {
        return new StringBuilder(stringToReverse).reverse().toString();
    }

}
