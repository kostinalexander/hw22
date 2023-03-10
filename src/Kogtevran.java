public class Kogtevran extends Hogwartc {
    private int intelegince;// ум
    private int mind; // мудрость
    private int creativity; // творчество

    public Kogtevran(String students, int magic, int transgressiya, int intelegince, int mind, int creativity) {
        super(students, magic, transgressiya);
        this.intelegince = intelegince;
        this.mind = mind;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "intelegince=" + intelegince +
                ", mind=" + mind +
                ", creativity=" + creativity +
                '}';
    }

    public int getIntelegince() {
        return intelegince;
    }

    public void setIntelegince(int intelegince) {
        this.intelegince = intelegince;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void kogtevranStudents(Kogtevran[] kogtevrans) {
        System.out.println("Количество студентов Когтеврана = " + kogtevrans.length);
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println(" Имя студента = " + kogtevran.getStudents() + " Магия студента = " + kogtevran.getMagic()
                    + " Дальность трансгрессии = " + kogtevran.getTransgressiya() + " Ум студента = " + kogtevran.getIntelegince()
                    + " Мудрость студента  = " + kogtevran.getMind() + " Творчество студента = " + kogtevran.getCreativity());
        }
    }

    public void kogtevranMaxBall(Kogtevran[] kogtevrans) {
        int max = Integer.MIN_VALUE;
        Kogtevran result = null;
        for (int i = 0; i < kogtevrans.length; i++) {
            int maxBall = kogtevrans[i].getIntelegince() + kogtevrans[i].getMind() + kogtevrans[i].getCreativity()
                    + kogtevrans[i].getMagic() + kogtevrans[i].getTransgressiya();
            if (maxBall > max) {
                max = maxBall;
                result = kogtevrans[i];
            }
        }
        System.out.println(result.getStudents() + " колличество баллов " + max);
    }

    public void battleKogtevran(Kogtevran a, Kogtevran b) {
        if (a.getTransgressiya() > b.getTransgressiya()) {
            System.out.println("у " + a.getStudents() + " трансгреесия больше чем у " + b.getStudents());
        } else {
            System.out.println("у " + a.getStudents() + " трансгреесия меньше чем у " + b.getStudents());
        }
        if (a.getMagic() > b.getMagic()) {
            System.out.println("у " + a.getStudents() + " сила магии больше чем у " + b.getStudents());
        } else {
            System.out.println("у " + a.getStudents() + " сила магии меньше чем у " + b.getStudents());
        }
    }
}

