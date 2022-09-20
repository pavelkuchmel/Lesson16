public class Matrix {
    int string;
    int column;
    int[][] array;

    public Matrix(){}

    public Matrix(int string, int column, int[][] array){
        this.string = string;
        this.column = column;
        this.array = array;
    }
    public boolean comprasion(Matrix m1){
        boolean check = false;
        if (this.array.length == m1.array.length){
            for (int i = 0; i < this.array[i].length; i++){
                if (this.array[i].length == m1.array.length) check = true;
                else return check;
            }
        }
        return check;
    }
    public int[][] sum(Matrix m1){
        int[][] arrayReturn = new int[this.array.length][];
        if (comprasion(m1)){
            for (int i = 0; i < this.array.length; i++){
                arrayReturn[i] = new int[this.array[i].length];
            }
            for (int i = 0; i < this.array.length; i++){
                for (int j = 0; j < this.array[i].length; j++){
                    arrayReturn[i][j] = this.array[i][j] + m1.array[i][j];
                }
            }
        }
        return null;
    }
}
