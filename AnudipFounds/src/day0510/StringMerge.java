package day0510;

//•array1={"a","b","c","d","e"};
//•array2={"1","2"}
//generate third array using above two array.

// OUTPUT : array3={"a","1","b","2","c","d","e"}
public class StringMerge {
	public static void main(String[] args) {
		String[] arr1={"a","b","c","d","e"};
		String[] arr2={"1","2"};
		int len1 = arr1.length;
	    int len2 = arr2.length;
	    int len3 = len1 + len2;	    
	    String[] arr3 = new String[len3];
		int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
        while (i < len1) {
            arr3[k++] = arr1[i++];
        }
        while (j < len2) {
            arr3[k++] = arr2[j++];
        }
        for (int x = 0; x < len3; x++) {
            System.out.print(arr3[x] +" ,");
        }
    }
}
