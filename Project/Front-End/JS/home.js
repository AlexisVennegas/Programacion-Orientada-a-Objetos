let currentSlide = 0;
const slides = document.querySelectorAll('.slide');
const modal = document.getElementById('modal');
const nextBtn = document.getElementById('nextBtn');

nextBtn.addEventListener('click', () => {
    slides[currentSlide].classList.remove('active');
    currentSlide++;

    if (currentSlide < slides.length) {
        slides[currentSlide].classList.add('active');
    } else {
        modal.classList.add('hidden'); // Oculta el modal al final
    }
});



document.getElementById('goToSignUp').addEventListener('click', function() {
    document.getElementById('signInScreen').classList.remove('active');
    document.getElementById('signUpScreen').classList.add('active');
});

document.getElementById('goToSignIn').addEventListener('click', function() {
    document.getElementById('signUpScreen').classList.remove('active');
    document.getElementById('signInScreen').classList.add('active');
});