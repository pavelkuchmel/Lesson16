import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int string;
    private int column;
    private int[][] array;

    public Matrix(){}

    public Matrix(int[][] array){
        this.array = array;
    }

    public Matrix(int string, int column){
        this.string = string;
        this.column = column;
        this.setArray(this.string, this.column);
        this.fillArray();
    }

    @Override
    public String toString() {
        return "Matrix: " +
                "\nКоличество строк: " + string +
                "\nКоличество столбцов: " + column +
                "\nМассив: " + toStringMatrix(array);
    }

    public String toStringMatrix(int[][] array){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                arr.add(array[i][j]);
            }
        }
        return arr.toString();
    }

    public int getString() { return string; }

    public void setString(int string) { this.string = string; }

    public int getColumn() { return column; }

    public void setColumn(int column) { this.column = column; }

    public int[][] getArray() { return array; }

    protected void setArray(int string, int column) {
        this.array = new int[string][column];
    }

    protected void fillArray(){
        Random rdm = new Random();
        for (int i = 0; i < this.array.length; i++){
            for (int j = 0; j < this.array[i].length; j++){
                this.array[i][j] = rdm.nextInt(8)+1;
            }
        }
    }

    public void showArray(){
        for (int i = 0; i < this.array.length; i++){
            for (int j = 0; j < this.array[i].length; j++){
                System.out.print(this.array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean comprasion(Matrix m2){
        boolean check = false;
        if (this.array.length == m2.array.length){
            for (int i = 0; i < this.array.length; i++){
                if (this.array[i].length == m2.array[i].length) check = true;
                else return check;
            }
        }
        return check;
    }
    public int[][] sum(Matrix m2){
        if (comprasion(m2)){
            int[][] arrayReturn = new int[string][];
            for (int i = 0; i < this.array.length; i++){
                arrayReturn[i] = new int[this.array[i].length];
            }
            for (int i = 0; i < this.array.length; i++){
                for (int j = 0; j < this.array[i].length; j++){
                    arrayReturn[i][j] = this.array[i][j] + m2.array[i][j];
                }
            }
            return arrayReturn;
        }
        return null;
    }
    public int[][] mult(int number){
            int[][] arrayReturn = new int[string][column];
            for (int i = 0; i < this.array.length; i++){
                for (int j = 0; j < this.array[i].length; j++){
                    arrayReturn[i][j] = this.array[i][j] * number;
                }
            }
            return arrayReturn;
    }
}
