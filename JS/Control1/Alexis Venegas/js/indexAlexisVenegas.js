// necesito esto para que se vea bien jeje
const display = document.querySelector('#display');
document.body.style.zoom = "100%";

function addNumber(number) {

    if(display.value === '0') {
        display.value = '';
    }
    display.value += number;
}

function clearDisplay() {
    display.value = '';
}

function addOperator(operator) {
    display.value += operator;
}

function checkErrores(displayValue, result){
    return (displayValue === 'Infinity' || displayValue.includes('..') || displayValue.includes('Error al calcular') || isNaN(result));
}

function result() {
    let array = display.value.split('');
    let result = 0;

    if(array[0] === '-') {
        //unimos le primero y e segundo elemento del array
        array[0] = array[0] + array[1];
        array.splice(1, 1) ;
    }
    if(array[0] === '+') {
        //quitarle el primer elemento al array
        array.shift();
    }
    if(array.includes('+')) {
        let numbers = display.value.split('+');
        if(numbers[0] === '') numbers.shift();
        result = parseFloat(numbers[0]) + parseFloat(numbers[1]);
    }
    if(array.includes('-')) {
        let numbers = display.value.split('-');
        result = parseFloat(numbers[0]) - parseFloat(numbers[1]);
    }
    if(array.includes("/")){
        let numbers = display.value.split('/');
        result = parseFloat(numbers[0]) / parseFloat(numbers[1]);
    }
    if(array.includes("*") || array.includes("x")){
        let numbers = display.value.split('*');
        result = parseFloat(numbers[0]) * parseFloat(numbers[1]);
    }
    
    if(checkErrores(display.value, result)) display.value = 'Error al calcular';
    else{
        ft_saveHistory(result);     
        display.value = result;
    }
}

//guardado de memoria
function saveMemory() {
    let alert = document.querySelector('.alert');

   
    console.log(display.value);
    if(!parseInt(display.value, 10) || display.value.includes('+') || display.value.includes('-') || display.value.includes('*') || display.value.includes('/') || display.value == 'Error al calcular' || display.value == 'Infinity' || display.value.includes("..")) {
        alert.innerHTML = 'Error al guardar memoria';
        alert.classList.add('alert_error');
    return;
    }
    
    localStorage.setItem('memory', display.value);
    if(localStorage.getItem('memory')){
        alert.innerHTML = 'Memoria guardada';
        if(alert.classList.contains('alert_error')) {
            alert.classList.remove('alert_error');
        }
        alert.classList.add('alert_block');
    }
}
// recuperar memoria
function recupMemory() {

   if(!localStorage.getItem('memory')) {
    let alert = document.querySelector('.alert');
    
    alert.innerHTML = 'No hay memoria guardada';
    alert.classList.add('alert_error');
    return}

    if (display.value == '0' && localStorage.getItem('memory')) {
        display.value = '';
    }
    let valorRecuperado = localStorage.getItem('memory');
    display.value += parseFloat(valorRecuperado)
}


function ft_saveHistory(result){
    //no remplazar el valor de la memoria sino agregarlo
    let history = localStorage.getItem('history');
    if(history){
        history += ',' + result;
    }
    else{
        history = result;
    }
    localStorage.setItem('history', history);
   
}

function getHistory(){
    let historial = localStorage.getItem('history')
    let array = historial.split(",")
    let alert = document.querySelector(".alert")

    alert.classList.add("alert_list")
    for(let i = 0; i < array.length; i++){
        alert.innerHTML += `<p>${array[i]}</p>`

        console.log(array[i])
    }
   

}