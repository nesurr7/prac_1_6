package classes;

import java.util.Date;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
	    Date time = new Date();// Класс - время
	    //привожу до int'a , возвращаю кол-во милли-секунд с 1970
        Random random1 = new Random((int)time.getTime());
        int lenOfArray1 = random1.nextInt(20)+3;//Вернется значение числа от 3 до 23
        int[] Array1 = new int[lenOfArray1];
        for (int i=0;i<lenOfArray1;i++)
        {
            Array1[i]=random1.nextInt(32)+1;//от 1 до 33
        }
        System.out.println("Массив №1(Созданный классом Random) до сортировки:"+Arrays.toString(Array1));
        Arrays.sort(Array1);
        System.out.println("                       Массив №1 после сортировки:"+Arrays.toString(Array1));


        ///////////////////////////

        int lenOfArray2 = ((int)(Math.random()*1000)%15)+3;//не больше 15 элементов
        int[] Array2 = new int[lenOfArray2];
        for (int i=0;i<lenOfArray2;i++)
        {
            Array2[i]=(int)(Math.random()*1000)%25;//не больше 25
        }
        System.out.println("\nМассив №2(Созданный методом Math.random) до сортировки:"+Arrays.toString(Array2));
        Arrays.sort(Array2);
        System.out.println("                       Массив №2 после сортировки:"+Arrays.toString(Array2));
    }
}
