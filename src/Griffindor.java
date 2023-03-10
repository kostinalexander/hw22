public class Griffindor extends Hogwartc {
    private int nobility; // благородство
    private int honor; // честь
    private int courage; // храбрость


    public Griffindor(String students, int magic, int transgressiya, int nobility, int honor, int courage) {
        super(students, magic, transgressiya);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;

    }

    @Override
    public String toString() {
        return "Griffindor{" +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;

    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void griffindorStudents(Griffindor[] griffindors) {
        System.out.println("Количество студентов Гриффиндора = " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println(" Имя студента = " + griffindor.getStudents() + " Магия студента = " + griffindor.getMagic()
                    + " Дальность трансгрессии = " + griffindor.getTransgressiya() + " Благородство студента = " + griffindor.getNobility()
                    + " Честь студента  = " + griffindor.getHonor() + " Храбрость студента = " + griffindor.getCourage());
        }
    }

    public void bestBallGriffindor(Griffindor[] griffindors) {
        int max = Integer.MIN_VALUE;
        Griffindor result = null;
        for (int i = 0; i < griffindors.length; i++) {
            int maxBall = griffindors[i].getCourage() + griffindors[i].getNobility() + griffindors[i].getHonor()
                    + griffindors[i].getMagic() + griffindors[i].getTransgressiya();
            if (maxBall > max) {
                max = maxBall;
                result = griffindors[i];
            }
        }
        System.out.println(result.getStudents() + " колличество баллов " + max);
    }

    public void battleGriffidnor(Griffindor garry, Griffindor ron) {
        if (garry.getTransgressiya() > ron.getTransgressiya()) {
            System.out.println("у " + garry.getStudents() + " трансгреесия больше чем у " + ron.getStudents());
        } else {
            System.out.println("у " + garry.getStudents() + " трансгреесия меньше чем у " + ron.getStudents());
        }
        if (garry.getMagic() > ron.getMagic()) {
            System.out.println("у " + garry.getStudents() + " сила магии больше чем у " + ron.getStudents());
        } else {
            System.out.println("у " + garry.getStudents() + " сила магии меньше чем у " + ron.getStudents());
        }
    }


}