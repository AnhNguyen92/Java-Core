/*
 * LeetCode 2677. Chunk Array
 */
 
/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function(arr, size) {
    // manual
    let chunked = [];
    for (let i = 0; i < arr.length; i += size) {
        chunked.push(arr.slice(i, i + size));
    }
    return chunked;
    // use lib
    // return _.chunk(arr, size);
};