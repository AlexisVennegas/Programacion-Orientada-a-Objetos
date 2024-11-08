
function toUpperCasePropioElemento(elemento) {
    console.log(elemento)
    elemento.value = elemento.value.toUpperCase();
}



let elemento = document.getElementById("texto");
elemento.addEventListener("keyup", (event) => toUpperCasePropioElemento(event.target)); 