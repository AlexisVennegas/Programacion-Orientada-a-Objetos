// Crear el mapa y centrarlo en una ubicación específica
var map = L.map('map').setView([40.65, -4.70], 10); // Coordenadas de Ávila

// Agregar capa de mapa base de OpenStreetMap
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '© OpenStreetMap contributors'
}).addTo(map);

// Agregar marcador en un área de riesgo
L.marker([40.66, -4.72]).addTo(map)
    .bindPopup('🔥 Zona de alto riesgo de incendios')
    .openPopup();

// Agregar un polígono para representar un área peligrosa
L.polygon([
    [40.66, -4.75],
    [40.68, -4.74],
    [40.67, -4.70]
], {
    color: 'red',
    fillColor: '#f03',
    fillOpacity: 0.5
}).addTo(map).bindPopup("🔥 Zona de peligro");




 // Función para obtener la ubicación del usuario
 document.getElementById('locationButton').addEventListener('click', function () {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function (position) {
            var lat = position.coords.latitude;
            var lng = position.coords.longitude;

            // Agregar marcador en la ubicación del usuario
            L.marker([lat, lng]).addTo(map)
                .bindPopup("📍 Estás aquí")
                .openPopup();

            // Centrar el mapa en la ubicación
            map.setView([lat, lng], 12);
        }, function (error) {
            // Manejar errores
        });
    } else {
        alert("Geolocalización no soportada en este navegador.");
    }
});