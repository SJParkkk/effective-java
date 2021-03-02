package edu.item.stream.item50;

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end){
        if (start.compareTo(end)>0)
            try {
                throw new IllegalAccessException(
                        start +"가" + end + "보다 늦다.");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        this.start = start;
        this.end = end;
    }

    public Date start(){
            return start;
    }
    public Date end(){
        return end;
    }
}

class Item50{
    public void test() {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        start.setTime(78);
    }

    public static void main(String[] args) {
        Item50 main = new Item50();
        main.test();
    }

}

