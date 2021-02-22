package edu.item.stream.item45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Info{
    private String name;
    private Integer age;

    public Info(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class DemoFlatmap {
    public static void main(String[] args) {
        List<Info> oldMembers = new ArrayList<>();
        oldMembers.add(new Info("Park", 26));
        oldMembers.add(new Info("Lee", 45));
        oldMembers.add(new Info("Yoon", 30));

        List<Info> newMember = new ArrayList();
        newMember.add(new Info("Han", 34));
        newMember.add(new Info("Kim", 27));
        newMember.add(new Info("Yoo", 70));

        List<List<Info>> allMember = new ArrayList();
        allMember.add(newMember);
        allMember.add(oldMembers);
        allMember.stream().flatMap(infos -> infos.stream())
                .filter(info -> info.getAge() > 30)
                .forEach(s-> System.out.println(s.getName()));
    }
}
