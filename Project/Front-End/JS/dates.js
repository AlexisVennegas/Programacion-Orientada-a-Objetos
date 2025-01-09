function openTab(event, tabName) {
    // Oculta todas las pestañas
    const tabContents = document.querySelectorAll('.tab-content');
    tabContents.forEach(content => content.style.display = 'none');

    // Quita la clase 'active' de todos los botones
    const tabButtons = document.querySelectorAll('.tab-btn');
    tabButtons.forEach(button => button.classList.remove('active'));

    // Muestra el contenido de la pestaña seleccionada y marca el botón como activo
    document.getElementById(tabName).style.display = 'block';
    event.currentTarget.classList.add('active');
}

// Mostrar la pestaña de quemas activas por defecto al cargar la página
document.getElementById('activeBurns').style.display = 'block';
