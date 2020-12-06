package com.techreturners.cats;

interface Cat {
    boolean isAsleep();
    void goToSleep();
    void wakeUp();
    String getSetting();
    int getAverageHeight();
    String eat();
}

class DomesticCat implements Cat {
    private boolean isAsleep = false;
    private String settings = "domestic";
    private String eatReaction = "Purrrrrrr";
    private Integer averageHeight = 23;

    public boolean isAsleep() {
        return isAsleep;
    }

    public void goToSleep() {
        isAsleep = true;
    }

    public void wakeUp() {
        isAsleep = false;
    }

    public String getSetting() {
        return settings;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String eat() {
        return eatReaction;
    }
}

abstract class WildCat implements Cat {
    abstract public int getAverageHeight();
    abstract public String eat();

    private String settings = "wild";
    private boolean isAsleep = false;

    public String getSetting() {
        return settings;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public void goToSleep() {
        isAsleep = true;
    }

    public void wakeUp() {
        isAsleep = false;
    }
}

class LionCat extends WildCat {
    private int averageHeight = 1100;
    private String eatReaction = "Roar!!!!";

    public String eat() {
        return eatReaction;
    }

    public int getAverageHeight() {
        return averageHeight;
    }
}

class CheetahCat extends WildCat {
    private int averageHeight = 900;
    private String eatReaction = "Zzzzzzz";

    public String eat() {
        return eatReaction;
    }

    public int getAverageHeight() {
        return averageHeight;
    }
}