/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let res = new Array(numRows).fill([]);
    for(let i=1;i<=numRows;i++){
        let temp = new Array(i).fill(0);
        temp[0] = 1
        temp[temp.length-1] = 1;
        for(let j=1;j<temp.length-1;j++){
            temp[j] = res[i-1][j-1] + res[i-1][j]
        }
        res[i] = temp
    }
    res.shift()
    return res
};