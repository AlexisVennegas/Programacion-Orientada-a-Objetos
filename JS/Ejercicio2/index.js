
function traducMorse(str){
  const morse = {
    'A': '.-', 'B': '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.', 'H': '....', 'I': '..', 'J': '.---', 'K': '-.-', 'L': '.-..', 'M': '--', 'N': '-.', 'O': '---', 'P': '.--.', 'Q': '--.-', 'R': '.-.', 'S': '...', 'T': '-', 'U': '..-', 'V': '...-', 'W': '.--', 'X': '-..-', 'Y': '-.--', 'Z': '--..',
    '0': '-----', '1': '.----', '2': '..---', '3': '...--', '4': '....-', '5': '.....', '6': '-....', '7': '--...', '8': '---..', '9': '----.',
  }
    let result = '';
    for(let i = 0; i < str.length; i++){
      if(str[i] === ' '){
        result += ' ';
      } else {
        for(let key in morse){
          if(morse[key] === str[i]){
            result += key;
          }
        }
      }
    }

return result;
}

let result = '';
for(let i = 0; i < str.length; i++){
if(str[i] === ' '){
  result += ' ';
} else {
  result += morse[str[i]];
}
return result;

}}

decodeMorse = function(morseCode){
  let arrayLetters = morseCode.split(' ')
  for(let i = 0; i < arrayLetters.length; i++){
    console.log(traducMorse(arrayLetters[i]))
  }
  
}
console.log(decodeMorse('.... . -.--   .--- ..- -.. .'))
