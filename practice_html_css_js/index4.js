const ul = document.querySelector('ul');
const text = document.querySelector('textarea');
const btn = document.querySelector('button');

btn.onclick = function() {
    if (text.value == '') {
        alert('您沒有輸入內容!');
        return false;
    }else {
        let li = document.createElement('li');
        li.innerHTML = text.value + "<a href='javascript:;'>刪除</a>";
        ul.insertBefore(li,ul.children[0]);
        let as = document.querySelectorAll('a');
        for (let i = 0;i < as.length;i++) {
            as[i].onclick = function() {
                ul.removeChild(this.parentNode);
            }
        }
        return true;
    }
}