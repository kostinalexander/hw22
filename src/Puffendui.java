public class Puffendui extends Hogwartc {
    private int diligence; // трудолюбие
    private int faith; // вера
    private int honesty; // честность


    public Puffendui(String students, int magic, int transgressiya, int diligence, int faith, int honesty) {
        super(students, magic, transgressiya);
        this.diligence = diligence;
        this.faith = faith;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffendui{" +
                "diligence=" + diligence +
                ", faith=" + faith +
                ", honesty=" + honesty +
                '}';
    }

    public int getDiligence() {
        return diligence;
    }

    public int getFaith() {
        return faith;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void puffenduiStudents(Puffendui[] puffenduis) {
        System.out.println("Количество студентов Пуффендуя = " + puffenduis.length);
        for (int i = 0; i < puffenduis.length; i++) {
            Puffendui puffendui = puffenduis[i];
            System.out.println(" Имя студента = " + puffendui.getStudents() + " Магия студента = " + puffendui.getMagic()
                    + " Дальность трансгрессии = " + puffendui.getTransgressiya() + " Трудолюбие студента = " + puffendui.getDiligence()
                    + " Вера студента  = " + puffendui.getFaith() + " Честность студента = " + puffendui.getHonesty());
        }
    }

    public void bestBallPuffendui(Puffendui[] puffenduis) {
        int max = Integer.MIN_VALUE;
        Puffendui result = null;
        for (int i = 0; i < puffenduis.length; i++) {
            int maxBall = puffenduis[i].getDiligence() + puffenduis[i].getHonesty() + puffenduis[i].getFaith()
                    + puffenduis[i].getMagic() + puffenduis[i].getTransgressiya();
            if (maxBall > max) {
                max = maxBall;
                result = puffenduis[i];
            }
        }
        System.out.println(result.getStudents() + " колличество баллов " + max);
    }

    public void battlePuffendui(Puffendui zacharia, Puffendui justin) {
        if (zacharia.getTransgressiya() > justin.getTransgressiya()) {
            System.out.println("у " + zacharia.getStudents() + " трансгреесия больше чем у " + justin.getStudents());
        } else {
            System.out.println("у " + zacharia.getStudents() + " трансгреесия меньше чем у " + justin.getStudents());
        }
        if (zacharia.getMagic() > justin.getMagic()) {
            System.out.println("у " + zacharia.getStudents() + " сила магии больше чем у " + justin.getStudents());
        } else {
            System.out.println("у " + zacharia.getStudents() + " сила магии меньше чем у " + justin.getStudents());
        }
    }

}

