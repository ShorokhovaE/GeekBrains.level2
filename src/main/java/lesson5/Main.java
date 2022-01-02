package lesson5;

import javax.sound.midi.Track;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        method1();
        method2();

    }

    public static void method1() {
        final int SIZE = 10000000;

        float[] arr = new float[SIZE];

        for (int i=0; i< arr.length; i++) {
            arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время выполнения метода: " + (System.currentTimeMillis() - startTime) + " ms.");
    }



    public static void method2(){
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;

        float[] arr = new float[SIZE];

        for (int i=0; i< arr.length; i++) {
            arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();

        float[] leftHalf = new float[HALF];
        float[] rightHalf = new float[HALF];

        System.arraycopy(arr, 0, leftHalf, 0, HALF);
        System.arraycopy(arr, HALF, rightHalf, 0, HALF);


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0, j = HALF; i < rightHalf.length; i++, j++) {
                rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });

        t1.start();
        t2.start();


        float[] finallyArray = new float[SIZE];
        System.arraycopy(leftHalf, 0, finallyArray, 0, HALF);
        System.arraycopy(rightHalf, 0, finallyArray, HALF, HALF);


        System.out.println("Время выполнения метода: " + (System.currentTimeMillis() - startTime) + " ms.");

    }
}
