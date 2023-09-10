const buttons = document.querySelectorAll("button");
buttons.forEach(function (button) {
  button.addEventListener("mouseenter", function () {
    button.style.backgroundColor = '#ADD8E6';
  });
  button.addEventListener("mouseleave", function () {
    button.style.backgroundColor = 'white';
  });
});