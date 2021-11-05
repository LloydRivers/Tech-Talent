const button = document.getElementById("button");
const popup = document.querySelector(".popup ")
button.addEventListener("click", function(){
     popup.style.display = "flex"
})

popup.addEventListener("click", function(){
    popup.style.display = "none"
})