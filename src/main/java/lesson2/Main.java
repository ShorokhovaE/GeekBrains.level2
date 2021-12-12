package lesson2;

public class Main {

    public static void main(String[] args) {
        String[][] str = {
                {"1", "6", "1","1"},
                {"1", "1", "1","1"},
                {"1", "1", "79","1"},
                {"1", "1", "1","1"}
        };

        try {
            arrayInt(str);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }

        System.out.println("Конец");
        }




    public static void arrayInt(String[][] str) throws MyArraySizeException {

        if (str.length != 4 ) {
            throw new MyArraySizeException("Длина массива должна быть равна 4");
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i].length != 4){
                throw new MyArraySizeException("Длина массива должна быть равна 4");
            }
        }

        int x = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                try {
                    x += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "][" + j +"]");
                }
            }
        }
        System.out.println("Сумма всех элементов массива равна: " + x);
    }

}
