//如果你想要多個按鈕在滑鼠移動到上面時更換顏色，為每個按鈕添加相應的事件監聽器
var buttons = document.querySelectorAll("button");
buttons.forEach(function (button) {
  button.addEventListener("mouseenter", function () {
    button.style.backgroundColor = '#ADD8E6';
  });
  button.addEventListener("mouseleave", function () {
    button.style.backgroundColor = "white";
  });
});
//超連結URL
function redirectToPage(url) {
  window.location.href = url;
}