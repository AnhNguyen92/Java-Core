/*
 * LeetCode 2666. Allow One Function Call
 */

/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    var called = false;
    return function(...args){
        if (called) {
            return;
        }
        called = true;
        return fn.apply(this, args);
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */