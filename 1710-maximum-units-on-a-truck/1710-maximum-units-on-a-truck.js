/**
 * @param {number[][]} boxTypes
 * @param {number} truckSize
 * @return {number}
 */
var maximumUnits = function(boxTypes, truckSize) {
    boxTypes.sort((a,b)=>(b[1]-a[1]))
    let res = 0
    let currSize = 0
    for(let i=0;i<boxTypes.length;i++){
        if(currSize===truckSize){
            break;
        }
        let temp = Math.min(truckSize-currSize,boxTypes[i][0])
        res += temp*boxTypes[i][1]
        currSize+=temp
    }
    return res
};