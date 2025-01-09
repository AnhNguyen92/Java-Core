
/*
 * 2724. Sort By
 */

/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.sort(function(a, b){return fn(a) - fn(b)});
};