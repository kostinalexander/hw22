public class Slizerin extends Hogwartc {
    private int cunning;// хитрость
    private int determenation;//решительность
    private int ambition; // амбициозны
    private int resourcefulness; // находчивы
    private int thirstPower; // жажда власти

    public Slizerin(String students, int magic, int transgressiya, int cunning, int determenation, int ambition, int resourcefulness, int thirstPower) {
        super(students, magic, transgressiya);
        this.cunning = cunning;
        this.determenation = determenation;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determenation=" + determenation +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermenation() {
        return determenation;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermenation(int determenation) {
        this.determenation = determenation;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    public void slizerinStudents(Slizerin[] slizerins) {
        System.out.println("Количество студентов слизерина = " + slizerins.length);
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println(" Имя студента = " + slizerin.getStudents() + " Магия студента = " + slizerin.getMagic()
                    + " Дальность трансгрессии = " + slizerin.getTransgressiya() + " Хитрость студента = " + slizerin.getCunning()
                    + " Решительность студента  = " + slizerin.getDetermenation() + " Амбициозность студента = " + slizerin.getAmbition() +
                    "Находчивость студента" + slizerin.getResourcefulness() + "Жажда власти студента" + slizerin.getThirstPower());
        }
    }

    public void bestBallSlizerin(Slizerin[] slizerins) {
        int max = Integer.MIN_VALUE;
        Slizerin result = null;
        for (int i = 0; i < slizerins.length; i++) {
            int maxBall = slizerins[i].getMagic() + slizerins[i].getAmbition() + slizerins[i].getCunning()
                    + slizerins[i].getResourcefulness() + slizerins[i].getTransgressiya() + slizerins[i].getThirstPower() + slizerins[i].getResourcefulness();
            if (maxBall > max) {
                max = maxBall;
                result = slizerins[i];
            }
        }
        System.out.println(result.getStudents() + " колличество баллов " + max);
    }

    public void battleSlizerin(Slizerin draco, Slizerin grack) {
        if (draco.getTransgressiya() > grack.getTransgressiya()) {
            System.out.println("у " + draco.getStudents() + " трансгреесия больше чем у " + grack.getStudents());
        } else {
            System.out.println("у " + draco.getStudents() + " трансгреесия меньше чем у " + grack.getStudents());
        }
        if (draco.getMagic() > grack.getMagic()) {
            System.out.println("у " + draco.getStudents() + " сила магии больше чем у " + grack.getStudents());
        } else {
            System.out.println("у " + draco.getStudents() + " сила магии меньше чем у " + grack.getStudents());
        }
    }


}