function mostrarNombre(){
    // para que no recargue la pagina
    let nombre = document.getElementById("input").value;
    let text =  document.getElementById("nombre");
    text.innerHTML = nombre.toUpperCase()
}
