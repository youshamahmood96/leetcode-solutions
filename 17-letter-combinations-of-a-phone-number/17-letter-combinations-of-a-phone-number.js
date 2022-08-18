/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    let res = []
    const obj = {
        2: ["a", "b", "c"],
        3: ["d", "e", "f"],
        4: ["g", "h", "i"],
        5: ["j", "k", "l"],
        6: ["m", "n", "o"],
        7: ["p", "q", "r", "s"],
        8: ["t", "u", "v"],
        9: ["w", "x", "y", "z"],
    }
    const map = new Map(Object.entries(obj));
    const one = () => {
        const arr1 = map.get(digits[0]);
        for(let i=0;i<arr1.length;i++) res.push(arr1[i])
    }
    const two = () => {
        const arr1 = map.get(digits[0])
        for(let i=0;i<arr1.length;i++){
            const arr2 = map.get(digits[1])
            for(let j=0;j<arr2.length;j++){
                res.push(`${arr1[i]}${arr2[j]}`)
            }
        }
    }
    const three = () => {
        const arr1 = map.get(digits[0])
        for(let i=0;i<arr1.length;i++){
            const arr2 = map.get(digits[1])
            for(let j=0;j<arr2.length;j++){
                const arr3 = map.get(digits[2])
                for(let k=0;k<arr3.length;k++){
                    res.push(`${arr1[i]}${arr2[j]}${arr3[k]}`)
                }
            }
        }
    }
    const four = () => {
        const arr1 = map.get(digits[0])
        for(let i=0;i<arr1.length;i++){
            const arr2 = map.get(digits[1])
            for(let j=0;j<arr2.length;j++){
                const arr3 = map.get(digits[2])
                for(let k=0;k<arr3.length;k++){
                    const arr4 = map.get(digits[3])
                    for(let l=0;l<arr4.length;l++){
                        res.push(`${arr1[i]}${arr2[j]}${arr3[k]}${arr4[l]}`)
                    }
                }
            }
        }
    }
    switch(digits.length){
        case 1:
            one();
            break
        case 2:
            two();
            break
        case 3:
            three();
            break
        case 4:
            four();
            break
        default:
            break;
    }
    return res
};