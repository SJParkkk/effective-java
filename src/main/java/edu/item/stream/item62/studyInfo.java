package edu.item.stream.item62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class studyInfo {
    private String team;
    private int itemNum;
    private static class compoundKey{
        private String team;
        private int itemNum;

        public compoundKey(String team, int itemNum) {
            this.team = team;
            this.itemNum = itemNum;
        }
        public studyInfo compound(){
            return new studyInfo(this);
        }
    }
    private studyInfo(compoundKey compoundKey){
        team = compoundKey.team;
        itemNum = compoundKey.itemNum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> itemList = new ArrayList<>(List.of(60,61,62));
        Iterator<Integer> i = itemList.iterator();

        studyInfo student1 = new studyInfo.compoundKey("B팀",i.next()).compound();
        studyInfo student2 = new studyInfo.compoundKey("A팀",i.next()).compound();
        studyInfo student3 = new studyInfo.compoundKey("B팀",i.next()).compound();

        System.out.println("student1: " + student1.team + "아이템 " + student1.itemNum);
        System.out.println("student2: " + student2.team + "아이템 " + student2.itemNum);
        System.out.println("student3: " + student3.team + "아이템 " + student3.itemNum);
    }
}

