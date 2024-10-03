//ريم احمد الحربي 444003905
//----------------------------------------------------------------------------------------------

// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in arr[]

            static int search(int array[], int r, int w)

            {

                        for (int i = 0; i < r; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (array[i] == w)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] array = { 3, 4, 1, 7, 5 };

                        int r = array.length;

                        int w = 4;

                        int index = search(array, r, w);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------