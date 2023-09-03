package Lift;

class Lift {
    private int currentfloor;
    public int minfloor;
    public int maxfloor;
    private static int number = 1;
    
    public Lift (int minfloor, int maxfloor) throws IllegalAccessException{
        if (minfloor >= maxfloor){
            throw new IllegalAccessException("Диапазон этажей " + minfloor + "-" + maxfloor +" не возможен! ");
        }
        this.minfloor = minfloor;
        this.maxfloor = maxfloor;
        this.currentfloor = minfloor;
        int id = number++;
        System.out.printf(
            "Создан лифт %d (диапазон %d-%d этажей).%n Текущий этаж %d.%n",
             id, minfloor, maxfloor, currentfloor);
    }

    public Lift (int maxfloor) throws IllegalAccessException{
        if (minfloor >= maxfloor){
            throw new IllegalAccessException("Диапазон этажей " + minfloor + "-" + maxfloor +" не возможен! ");
        }
        this.minfloor = 1;
        this.maxfloor = maxfloor;
        this.currentfloor = minfloor;
        int id = number++;
        System.out.printf(
            "Создан лифт %d (диапазон %d-%d этажей).%n Текущий этаж %d.%n",
             id, minfloor, maxfloor, currentfloor);
    }

    public void move(int floor) throws IllegalAccessException{
        if (floor <minfloor || floor> maxfloor){
            throw new IllegalAccessException("Этаж " +floor+ " отсутствует");
        }
        if (floor > currentfloor) {
            this.currentfloor = floor;
            System.out.printf("Лифт поднялся на %d этаж.%n",currentfloor );
        }
        if (floor < currentfloor) {
            this.currentfloor = floor;
            System.out.printf("Лифт спустился на %d этаж.%n",currentfloor );
        }
    }
    public String toString(){
        return String.format("[%d, %d] -> %d",this.minfloor , this.maxfloor, this.currentfloor);
    }
}

