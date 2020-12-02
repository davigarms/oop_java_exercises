package com.techreturners.cats;

 interface Cat {
     boolean isAsleep();
     void goToSleep();
     void wakeUp();
     String getSetting();
     int getAverageHeight();
}

 class DomesticCat implements Cat {

    private boolean isAsleep = false;
    String settings = "domestic";
    Integer averageHeight = 23;

    public boolean isAsleep(){
        return isAsleep;
    }

    public void goToSleep(){
        isAsleep = true;
    }

    public void wakeUp(){
        isAsleep = false;
    }

    public String getSetting(){
        return settings;
    }

    public int getAverageHeight(){
        return averageHeight;
    }
}

abstract class WildCat implements Cat {
    abstract public int getAverageHeight();
}

class LionCat extends WildCat {

    int averageHeight = 1100;
    String settings = "wild";
    boolean isAsleep = false;

    public boolean isAsleep(){
        return isAsleep;
    }

    public int getAverageHeight(){
        return averageHeight;
    }

    public String getSetting(){
        return settings;
    }

    public void goToSleep(){
        isAsleep = true;
    }

    public void wakeUp(){
        isAsleep = false;
    }
}

/*class Cheetah extends WildCat {

}*/