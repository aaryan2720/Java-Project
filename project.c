#include <stdio.h>

void sortBinaryArray(int arr[], int n) {
    int count0 = 0;
    
    // Count the number of 0s in the array
    for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            count0++;
        }
    }
    
    // Fill the array with 0s based on the count
    for (int i = 0; i < count0; i++) {
        arr[i] = 0;
    }
    
    // Fill the rest of the array with 1s
    for (int i = count0; i < n; i++) {
        arr[i] = 1;
    }
}

int main() {
    int n;
    
    // Get the size of the array from the user
    printf("Enter the size of the binary array: ");
    scanf("%d", &n);
    
    int arr[n];
    
    // Get the elements of the array from the user
    printf("Enter the elements (0 or 1) of the binary array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        
        // Validate the input to ensure only 0s and 1s are entered
        if (arr[i] != 0 && arr[i] != 1) {
            printf("Invalid input! Please enter only 0s and 1s.\n");
            i--; // Go back to re-enter the invalid element
        }
    }
    
    // Sort the binary array
    sortBinaryArray(arr, n);
    
    // Output the sorted array
    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    
    return 0;
}