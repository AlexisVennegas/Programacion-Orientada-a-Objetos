const API_KEY = 'fa8cc5a11744ba3f5bb41b8ec275a7ce'; // Usa tu API Key
const CITY = 'Madrid';

async function fetchWeather() {
    try {
        const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${CITY}&appid=${API_KEY}&units=metric&lang=es`);
        if (!res.ok) throw new Error(`Error en la solicitud: ${res.status} - ${res.statusText}`);
        const data = await res.json();
        // Actualizar los elementos con la información del clima actual
        document.getElementById("temperature").innerText = `${data.main.temp}°C`;
        document.getElementById("humidity").innerText = `${data.main.humidity}%`;
        document.getElementById("pressure").innerText = `${data.main.pressure} hPa`;
    } catch (error) {
        console.error('Error:', error.message);
    }
}

async function fetchForecast() {
    try {
        const res = await fetch(`https://api.openweathermap.org/data/2.5/forecast?q=${CITY}&appid=${API_KEY}&units=metric&lang=es`);
        if (!res.ok) throw new Error(`Error en la solicitud: ${res.status} - ${res.statusText}`);
        const data = await res.json();
        const forecastContainer = document.getElementById("forecast");
        forecastContainer.innerHTML = ""; // Limpiar el contenedor antes de agregar la nueva información

        for (let i = 0; i < 5; i++) {
            const day = data.list[i * 8]; // Cada 8 elementos corresponde a 24 horas
            forecastContainer.innerHTML += `
                <div class="forecast-item">
                    <h4>${new Date(day.dt_txt).toLocaleDateString()}</h4>
                    <p>${day.main.temp}°C</p>
                    <p>${day.weather[0].description}</p>
                </div>`;
        }
    } catch (error) {
        console.error('Error:', error.message);
    }
}

function createChart() {
    const ctx = document.getElementById('weatherChart').getContext('2d');
    new Chart(ctx, {
        type: 'line',
        data: {
            labels: ['Lun', 'Mar', 'Mié', 'Jue', 'Vie'],
            datasets: [{
                label: 'Temperatura (°C)',
                data: [20, 22, 19, 21, 23], // Ejemplo de datos, puedes reemplazarlos por los datos reales
                borderColor: 'red',
                backgroundColor: 'rgba(255,0,0,0.2)',
                fill: true
            }]
        },
    });
}

// Llamadas a las funciones
fetchWeather();
fetchForecast();
createChart();
