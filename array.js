function sortArrayDescending(arr) {
    var len = arr.length;
    for (var i = 0; i < len; i++) {
        for (var j = i + 1; j < len; j++) {
            if (arr[i] < arr[j]) {
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

var originalArray = [8, 3, 5, 1, 9, 2];
sortArrayDescending(originalArray);
var result = originalArray.join(', ');

console.log("Original Array:", originalArray.join(', '));
console.log("Sorted Array (Descending):", result);
