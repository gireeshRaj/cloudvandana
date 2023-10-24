// Define an array to be sorted
let array = [5, 2, 9, 1, 5, 6];

// Display the original array
console.log("Original Array: " + array);

// Define a function to sort the array in descending order
function descendingBubbleSort(arr) {
    const length = arr.length;

    // Outer loop to iterate through the entire array
    for (let i = 0; i < length - 1; i++) {
        // Inner loop to perform comparisons and swaps
        for (let j = 0; j < length - 1 - i; j++) {
            // Compare adjacent elements
            if (arr[j] < arr[j + 1]) {
                // Swap the elements if they are in the wrong order
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Call the sorting function
descendingBubbleSort(array);

// Display the sorted array
console.log("Sorted Array (Descending): " + array);
