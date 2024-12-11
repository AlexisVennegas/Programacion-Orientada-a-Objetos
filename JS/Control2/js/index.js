
function validarInput(input) {
    if(input.value == "") {
        input.style = "border: 1px solid red"
        alert("introduce un texto")
        return(true)
    }
    else input.style = "border: 1px solid black"
    return(false)
}

function concatenarText(input, event) {
    event.preventDefault()
    // si esta vacio
    if(validarInput(input)) return

    let parrafo = document.getElementById("textoResult");    
    let result = ""

    result += input.value
    parrafo.innerHTML += " " + result
}