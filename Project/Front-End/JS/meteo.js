const apiKey = 'c06050680754e90014aa1a8dbd6fd92a';
const parrafoUbicacion = document.querySelector('.name-ubication');
const PrimerNumeroTemperatura = document.querySelector('.arrow-first');
const SegundoNumeroTemperatura = document.querySelector('.arrow-second');
const imagenClima = document.querySelector('.weather-icon-img');
const pression = document.querySelector('.pressure');
const humidity = document.querySelector('.humidity');
const sensacion = document.querySelector('.feels-like');


function getUserLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
            (position) => {
                const latitude = position.coords.latitude;
                const longitude = position.coords.longitude;

                // console.log("Ubicación del usuario:", { latitude, longitude });

                // Llamar a la API con la ubicación obtenida
                fetchWeather(latitude, longitude);
                advancedTemp(latitude, longitude);
            },
            (error) => {
                console.error("Error al obtener la ubicación:", error.message);
            }
        );
    } else {
        console.error("Geolocalización no es soportada por este navegador.");
    }
}

function fetchWeather(latitude, longitude) {
    const apiUrl = `https://api.openweathermap.org/data/2.5/weather?lat=${latitude}&lon=${longitude}&appid=${apiKey}&units=metric&lang=es`;

    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error(`Error enconst parrafoUbicacion = document.getElementsByClassName('name-ubication'); la solicitud: ${response.status} - ${response.statusText}`);
            }
            return response.json();
        })
        .then(data => {
            console.log('Clima actual:', data);
           parrafoUbicacion.innerHTML = data.name + ", " + data.sys.country;

            console.log('Temperatura:', data.main.temp, '°C');
            
            let temperatura = data.main.temp;
            let temperaturaString = temperatura.toString();
            let temperaturaArray = temperaturaString.split("");
            PrimerNumeroTemperatura.innerHTML = temperaturaArray[0] + temperaturaArray[1];
            SegundoNumeroTemperatura.innerHTML = "." + temperaturaArray[3];
            pression.innerHTML = data.main.pressure + " hPa";
            humidity.innerHTML = data.main.humidity + "%";
            sensacion.innerHTML = data.main.feels_like + "°C";
            console.log('Descripción:', data.weather[0].description);
            if (data.weather[0].main === "Clouds") {
                imagenClima.src = "../Assets/nublado.png";
            }
            else if (data.weather[0].main === "Rain") {
                imagenClima.src = "../Assets/lluvia.png";
            }
            else if (data.weather[0].main === "Clear") {
                imagenClima.src = "../Assets/sol.png";
            }
        })
        .catch(error => {
            console.error('Error:', error.message);
        });
}

// Llamar a la función para obtener la ubicación del usuario y luego hacer la solicitud
getUserLocation();




function advancedTemp(latitude, longitude){

    const apiUrl = `https://api.openweathermap.org/data/2.5/forecast?lat=${latitude}&lon=${longitude}&appid=${apiKey}&units=metric&lang=es`;

    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error(`Error en la solicitud: ${response.status} - ${response.statusText}`);
            }
            return response.json();
        })
        .then(data => {
            console.log('Pronóstico del clima:', data);

            // Obtener temperaturas y horas (cada 3 horas)
            const labels = data.list.map(entry => {
                let date = new Date(entry.dt * 1000);
                return date.getHours() + ":00"; // Extrae solo la hora
            });

            const temperatures = data.list.map(entry => entry.main.temp);

            // Crear gráfico
            createChart(labels, temperatures);
        })
        .catch(error => {
            console.error('Error:', error.message);
        });
}

function createChart(labels, temperatures) {
    const ctx = document.getElementById('weatherChart').getContext('2d');

    new Chart(ctx, {
        type: 'line',
        data: {
            labels: labels,
            datasets: [{
                label: 'Temperatura (°C)',
                data: temperatures,
                borderColor: 'white',  // Color de la línea
                backgroundColor: 'rgba(0, 0, 0, 0)', // Fondo transparente
                borderWidth: 2,
                pointBackgroundColor: 'red', // Color de los puntos en la línea
            }]
        },
        options: {
            plugins: {
                legend: { labels: { color: 'white' } } // Color del texto de la leyenda
            },
            scales: {
                x: { 
                    title: { display: true, text: 'Hora del día', color: 'white' },
                    ticks: { color: 'white' } // Color de las etiquetas del eje X
                },
                y: { 
                    title: { display: true, text: 'Temperatura (°C)', color: 'white' },
                    ticks: { color: 'white' }, // Color de las etiquetas del eje Y
                    beginAtZero: false
                }
            }
        }
    });
}
