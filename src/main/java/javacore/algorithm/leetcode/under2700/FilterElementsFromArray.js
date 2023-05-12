/*
 * LeetCode 2634. Filter Elements from Array
 */
 
 /**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let number = [];
    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i], i, arr)) {
            number.push(arr[i]);
        }
    }
    return number;
};