
public class CountingSort {

    public static void main(String[] args) {
        int nilai1 = 2, nilai2 = 2, nilai3 = 4, nilai4 = 7, nilai5 = 1, nilai6 = 7;
        int array[] = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};

        int Sort[] = new int[8];

        for (int i = 0; i < array.length; i++) {
            Sort[array[i]]++;
        }

        for (int i = 1; i < Sort.length; i++) {
            Sort[i] += Sort[i - 1];

        }

        int Output[] = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            Output[Sort[array[i]] - 1] = array[i];
            Sort[array[i]]--;
        }
        
        System.out.println("Array sebelum diurutkan: ");
        System.out.println(nilai1 + " " + nilai2 + " " + nilai3 + " " + nilai4 + " " + nilai5 + " " + nilai6);

        System.out.println("Array setelah diurutkan: ");
        for (int i = 0; i < Output.length; i++) {
            System.out.print(Output[i] + " ");
        }
    }

}
