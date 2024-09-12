package com.example;

import java.util.List;

public class LionAlex extends Lion{
    private static final String alexPlaceOfLiving = "Нью-Йоркский зоопарк";
    private static final List<String> alexFriends = List.of("Марти", "Глория", "Мелмон");
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public String getPlaceOfLiving() {
        return alexPlaceOfLiving;
    }

    public List<String> getFriends() {
        return alexFriends;
    }
}
