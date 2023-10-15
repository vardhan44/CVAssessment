function reverseString(string){
    const words = string.split(' ');
    const reversedWords = words.map(reverseWord);
    const reversedString = reversedWords.join(' ');
    return reversedString;
}

function reverseWord(word){
    return word.split('').reverse().join('')
}
const prompt = require("prompt-sync")({sigint:true});
let inputString = prompt('Enter the sentence : ');
if(inputString){
    const reversedString = reverseString(inputString);
    console.log(reversedString);
}else{
    console.log("Please enter the input")
}
