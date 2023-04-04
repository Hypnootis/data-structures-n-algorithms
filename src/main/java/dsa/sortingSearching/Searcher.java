package dsa.sortingSearching;

public class Searcher {

   public boolean iterativeSeqSearch(int[] array, int number) {
        boolean found = false;
        int index = 0;

        while (!found && index < array.length) {
            if (array[index] == number) {
                found = true;
            }
            index++;
        }

       return found;
   } 

   public boolean recursiveSeqSearch(int[] array, int number) {

    // boolean found = recursiveSeqSearch(array, number, 0, array.length - 1);

    //return found;
    return recursiveSeqSearch(array, number, 0, array.length - 1);
   }

   private boolean recursiveSeqSearch(int[] array, int number, int first, int last) {
       
        boolean found = false;

        if (first > last) {
            found = false;
        } else {
            if (array[first] == number) {
                found = true;
            } else {
                found = recursiveSeqSearch(array, number, first + 1, last);
            }
        }

        return found;
   }
}
