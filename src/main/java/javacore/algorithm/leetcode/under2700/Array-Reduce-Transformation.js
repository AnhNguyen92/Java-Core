/*
 * LeetCode 2626. Array Reduce Transformation
 */

/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var rest = init;
    for (let i = 0; i < nums.length; i++) {
        rest =  fn(rest, nums[i]);
    }
    return rest;
};