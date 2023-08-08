const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});
rl.question("输入字符串，中间空格隔开: ", (str) => {
    rl.close();
    let arr = str.split(' ')
     return arr[arr.length - 1].split('').length
});
