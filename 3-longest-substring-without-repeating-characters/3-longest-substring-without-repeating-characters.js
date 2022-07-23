/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let set = new Set()
    let i = 0;
    let j = 0;
    let res = 0;
    while(j<s.length){
        if(set.has(s[j])){
            set.delete(s[i])
            i++
        }
        else{
            set.add(s[j])
            res = Math.max(res,set.size)
            j++
        }
    }
    return res
};