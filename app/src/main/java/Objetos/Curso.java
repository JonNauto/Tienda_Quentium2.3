package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Curso {

    private int id;
    private String[] curso ={"usd","clp"};
    private int [] precios = {120,58000,};
    private String[] curso2 ={"usd","clp"};
    private int [] precios2 = {110,48000,};
    private String[] curso3 ={"usd","clp"};
    private int [] precios3 = {100,45000,};
    private String[] curso4 ={"usd","clp"};
    private int [] precios4 = {90,35000,};

    private int cupos;

    public Curso()
    {


    }

    public Curso(int id, String[] curso, int[] precios, String[] curso2, int[] precios2, String[] curso3, int[] precios3, String[] curso4, int[] precios4, int cupos) {
        this.id = id;
        this.curso = curso;
        this.precios = precios;
        this.curso2 = curso2;
        this.precios2 = precios2;
        this.curso3 = curso3;
        this.precios3 = precios3;
        this.curso4 = curso4;
        this.precios4 = precios4;
        this.cupos = cupos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCurso() {
        return curso;
    }

    public void setCurso(String[] curso) {
        this.curso = curso;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public String[] getCurso2() {
        return curso2;
    }

    public void setCurso2(String[] curso2) {
        this.curso2 = curso2;
    }

    public int[] getPrecios2() {
        return precios2;
    }

    public void setPrecios2(int[] precios2) {
        this.precios2 = precios2;
    }

    public String[] getCurso3() {
        return curso3;
    }

    public void setCurso3(String[] curso3) {
        this.curso3 = curso3;
    }

    public int[] getPrecios3() {
        return precios3;
    }

    public void setPrecios3(int[] precios3) {
        this.precios3 = precios3;
    }

    public String[] getCurso4() {
        return curso4;
    }

    public void setCurso4(String[] curso4) {
        this.curso4 = curso4;
    }

    public int[] getPrecios4() {
        return precios4;
    }

    public void setPrecios4(int[] precios4) {
        this.precios4 = precios4;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso1 = (Curso) o;
        return id == curso1.id && cupos == curso1.cupos && Arrays.equals(curso, curso1.curso) && Arrays.equals(precios, curso1.precios) && Arrays.equals(curso2, curso1.curso2) && Arrays.equals(precios2, curso1.precios2) && Arrays.equals(curso3, curso1.curso3) && Arrays.equals(precios3, curso1.precios3) && Arrays.equals(curso4, curso1.curso4) && Arrays.equals(precios4, curso1.precios4);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, cupos);
        result = 31 * result + Arrays.hashCode(curso);
        result = 31 * result + Arrays.hashCode(precios);
        result = 31 * result + Arrays.hashCode(curso2);
        result = 31 * result + Arrays.hashCode(precios2);
        result = 31 * result + Arrays.hashCode(curso3);
        result = 31 * result + Arrays.hashCode(precios3);
        result = 31 * result + Arrays.hashCode(curso4);
        result = 31 * result + Arrays.hashCode(precios4);
        return result;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", curso=" + Arrays.toString(curso) +
                ", precios=" + Arrays.toString(precios) +
                ", curso2=" + Arrays.toString(curso2) +
                ", precios2=" + Arrays.toString(precios2) +
                ", curso3=" + Arrays.toString(curso3) +
                ", precios3=" + Arrays.toString(precios3) +
                ", curso4=" + Arrays.toString(curso4) +
                ", precios4=" + Arrays.toString(precios4) +
                ", cupos=" + cupos +
                '}';
    }
}
