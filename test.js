const { read } = require("fs");
const rl = require("readline");
const readline = rl.createInterface({
    input:process.stdin,
    output:process.stdout
})

readline.on('line',(line,str)=>{
    console.log(line,str)
    readline.close()
})