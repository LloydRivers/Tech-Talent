let inputfullName = document.getElementById("fullName")
let spanFullName = document.getElementById("errorFullName");
let inputEmail = document.getElementById("email");
let spanEmail = document.getElementById("errorEmail");
let inputMobile = document.getElementById("mobile");
let spanMobile = document.getElementById("errorMobile");
let button = document.getElementById("submit");
let form = document.getElementById("webForm");

form.addEventListener("submit", function(e){
e.preventDefault();
if(inputfullName.value <1) {
  spanFullName.style.display = "block"
} 
if(inputEmail.value <1) {
  spanEmail.style.display = "block"
} 
if(inputMobile.value <1) {
  spanMobile.style.display = "block"
} 
let radios = document.querySelectorAll("input[type='radio']:checked");
if(radios.length == 0){
  console.log(radios.length)
  let radio = document.querySelector(".labelsAndInputs .error");
  radio.style.display = "block";
} 

})





