// scripts.js

// Modal logic
window.onload = function() {
    const modal = document.getElementById('alertModal');
    const closeBtn = document.querySelector('.close');

    // Muestra el modal al cargar la página
    modal.style.display = 'flex';

    // Cuando el usuario hace clic en la "x", se cierra el modal
    closeBtn.onclick = function() {
        modal.style.display = 'none';
    };

    // Si el usuario hace clic fuera del modal, se cierra
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = 'none';
        }
    };
};
