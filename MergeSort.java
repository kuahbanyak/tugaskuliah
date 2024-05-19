// System.out.println("Nama: MUHAMMAD ALWI AZIZ");
//         System.out.println("NIM: 049634497");
public class MergeSort {
    public static void mergeSort(int array[] , int low , int high){
        if (high <= low) return;

        int mid = (high + low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = array[low + i];
        }

        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = array[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for(int i = low; i < high + 1; i++){
            if(leftIndex < leftArray.length && rightIndex < rightArray.length){
                if(leftArray[leftIndex] < rightArray[rightIndex]){
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if(leftIndex < leftArray.length){
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if(rightIndex < rightArray.length){
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int nilai1 = 12, nilai2 = 11, nilai3 = 13, nilai4 = 5, nilai5 = 6, nilai6 = 7;
        int array[] = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};

        System.out.println("Array sebelum diurutkan: ");
        System.out.println(nilai1 + " " + nilai2 + " " + nilai3 + " " + nilai4 + " " + nilai5 + " " + nilai6);

        mergeSort(array, 0, array.length - 1);
        System.out.println("Array setelah diurutkan: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
