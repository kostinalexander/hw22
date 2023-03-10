
public class Hogwartc {
    private String students;
    private int magic;
    private int transgressiya;

    public Hogwartc(String students, int magic, int transgressiya) {
        this.students = students;
        this.magic = magic;
        this.transgressiya = transgressiya;
    }

    @Override
    public String toString() {
        return "Hogwartc{" +
                "students='" + students + '\'' +
                ", magic=" + magic +
                ", transgressiya=" + transgressiya +
                '}';
    }

    public String getStudents() {
        return students;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgressiya() {
        return transgressiya;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgressiya(int transgressiya) {
        this.transgressiya = transgressiya;
    }
}





