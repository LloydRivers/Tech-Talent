const button = document.getElementById("button");
const popup = document.querySelector(".popup")
const hero = document.querySelector(".hero")
const about = document.querySelector(".about")
const batches = document.querySelector(".batches")
const contact = document.querySelector(".contact")
const homeBtn = document.querySelector('.homebtn')
const batchesBtn = document.querySelector('.batchesbtn')
const aboutBtn = document.querySelector('.aboutbtn')
const contactBtn = document.querySelector('.contactbtn')
const goToContact = document.querySelector('.goToContact')
const goToContact1 = document.querySelector('.goToContact1')
const goToContact2 = document.querySelector('.goToContact2  ')

goToContact.addEventListener("click", function(){
    hero.classList.add('hide')
    about.classList.add('hide')
    batches.classList.add('hide')
    contact.classList.remove('hide')
})
goToContact1.addEventListener("click", function(){
    hero.classList.add('hide')
    about.classList.add('hide')
    batches.classList.add('hide')
    contact.classList.remove('hide')
})
goToContact2.addEventListener("click", function(){
    hero.classList.add('hide')
    about.classList.add('hide')
    batches.classList.add('hide')
    contact.classList.remove('hide')
})

button.addEventListener("click", function(){
    
     popup.style.display = "flex"
})

popup.addEventListener("click", function(){
    popup.style.display = "none"
})

homeBtn.addEventListener('click', function() {
    hero.classList.remove('hide')
    about.classList.add('hide')
    batches.classList.add('hide')
    contact.classList.add('hide')
})
batchesBtn.addEventListener('click', function() {
    hero.classList.add('hide')
    about.classList.add('hide')
    batches.classList.remove('hide')
    contact.classList.add('hide')
})
aboutBtn.addEventListener('click', function() {
    hero.classList.add('hide')
    about.classList.remove('hide')
    batches.classList.add('hide')
    contact.classList.add('hide')
})
contactBtn.addEventListener('click', function() {
    hero.classList.add('hide')
    about.classList.add('hide')
    batches.classList.add('hide')
    contact.classList.remove('hide')
})
