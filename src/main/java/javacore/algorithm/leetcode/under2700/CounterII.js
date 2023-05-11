/*
 * LeetCode 2665. Counter II
 */

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    var counter = init;
        var increment = function() {
        counter ++;
        return counter;
    }
  
    var decrement = function() {
        counter--;
        return counter;
    }
    var reset = function() {
        counter = init;
        return counter;
    }
    return({ increment: increment, decrement: decrement, reset: reset });
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */