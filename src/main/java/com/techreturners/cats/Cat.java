package com.techreturners.cats;

import java.util.Random;

interface Cat {
    String getSetting();
    boolean isAsleep();
    void goToSleep();
    void wakeUp();
    String eat();
    int getAverageHeight();
}

abstract class AbstractCat implements Cat {
    protected String settings;
    protected boolean isAsleep = false;
    protected String eatReaction;
    protected int averageHeight;

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

    public String eat() {
        return eatReaction;
    }

    public int getAverageHeight() {
        return averageHeight;
    }
}

class DomesticCat extends AbstractCat {
    public DomesticCat() {
        settings = "domestic";
        eatReaction = "Purrrrrrr";
        averageHeight = 23;
    }

    public String eat() {
        Random rand = new Random();
        if (rand.nextFloat() > .5) {
            eatReaction = "It will do I suppose";
        }
        return eatReaction;
    }
}

class LionCat extends AbstractCat {
    public LionCat() {
        settings = "wild";
        eatReaction = "Roar!!!!";
        averageHeight = 1100;
    }
}

class CheetahCat extends AbstractCat {
    public CheetahCat() {
        settings = "wild";
        eatReaction = "Zzzzzzz";
        averageHeight = 900;
    }
}