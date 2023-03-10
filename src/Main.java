public class Main {
    public static void main(String[] args) {
        Griffindor griffindor = new Griffindor("Студенты гриффиндор", 0, 0, 0, 0, 0);
        Griffindor garry = new Griffindor("Garri Potter", 9, 2, 15, 24, 5);
        Griffindor germiona = new Griffindor("Germiona Granger", 8, 4, 11, 22, 3);
        Griffindor ron = new Griffindor("Ron Yizli", 5, 4, 11, 3, 12);
        Griffindor[] griffindors = {garry, ron, germiona
        };
        griffindor.griffindorStudents(griffindors);
        System.out.print("Лучший гриффиндоровец - ");
        griffindor.bestBallGriffindor(griffindors);
        griffindor.battleGriffidnor(garry, ron);

        Puffendui puffendui = new Puffendui("Студенты пуффендуя", 0, 0, 0, 0, 0);
        Puffendui zakhariya = new Puffendui("Zakhariya Smitt", 12, 6, 15, 53, 5);
        Puffendui sedrick = new Puffendui("Sendrick Diggory", 11, 42, 3, 1, 4);
        Puffendui justin = new Puffendui("Justin Fin-Chelli", 15, 21, 4, 4, 6);
        Puffendui[] puffenduis = {zakhariya, sedrick, justin};
        puffendui.puffenduiStudents(puffenduis);
        System.out.print("Лучший в Пуффиндее = ");
        puffendui.bestBallPuffendui(puffenduis);
        puffendui.battlePuffendui(justin, sedrick);


        Slizerin slizerin = new Slizerin("Студенты слизерина", 0, 0, 0, 0, 0, 0, 0);
        Slizerin malfoi = new Slizerin("Draco malfoi", 12, 24, 3, 13, 42, 5, 50);
        Slizerin grakcham = new Slizerin("Grackham Monteg", 10, 5, 16, 11, 24, 31, 10);
        Slizerin gregory = new Slizerin("Gragory Goil", 8, 12, 41, 4, 13, 12, 21);
        Slizerin[] slizerins = {malfoi, grakcham, gregory};
        slizerin.slizerinStudents(slizerins);
        System.out.print("Лучший в слизерине = ");
        slizerin.bestBallSlizerin(slizerins);
        slizerin.battleSlizerin(grakcham, malfoi);

        Kogtevran kogtevran = new Kogtevran("Студенты когтеврана", 0, 0, 0, 0, 0);
        Kogtevran chzow = new Kogtevran("Chzow Chang", 11, 2, 31, 22, 1);
        Kogtevran padma = new Kogtevran("Padma Patil", 8, 11, 19, 21, 9);
        Kogtevran markus = new Kogtevran("Markus Melbi", 19, 2, 13, 15, 29);
        Kogtevran[] kogtevrans = {chzow, padma, markus};
        kogtevran.kogtevranStudents(kogtevrans);
        kogtevran.kogtevranMaxBall(kogtevrans);
        kogtevran.battleKogtevran(chzow, padma);

    }

}





























//            new Griffindor("Garri Potter", 9,2,15,24,5),
//          new Griffindor("Germiona Granger", 8,4,11,22,3),
//        new Griffindor("Ron Yizli", 5,4,11,3,12),