
/*
 * 2704. To Be Or Not To Be
 */

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    function toBe(compare) {
        if (val === compare) {
            return true;
        }
        throw new Error('Not Equal');
    }
    return {
        toBe: toBe,
        notToBe: notToBe
    };

    function notToBe(compare) {
        if (val !== compare) {
            return true;
        }
        throw new Error('Equal');
    }

};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */