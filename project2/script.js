let str = [
  "法院或警察機關辦案，不會收取當事⼈現⾦、亦不會要求匯款；法院或警察機關不會監管當事⼈帳⼾；法院不會⽤傳真⽅式，將傳喚書送給當事⼈，⼀定會以掛號信函送達；公家機關絕對不會以電話、電話錄音或以簡訊通知⽤⼾轉帳，或要打電話與某單位聯繫。<br>國稅局正確退稅⽅法會以當事⼈申報時所填寫之⾦融帳號匯入或以退稅⽀票掛號郵寄⾄申報退稅之住址，即便退稅⽀票掛號信無⼈收件，郵局也會張貼郵件招領通知，最後才會退回國稅局，絕無所謂持提款卡⾄提款機辦理退稅之⽅法。<br>接獲陌⽣來電告知涉入刑案或收到疑為政府機關公文書，應小⼼求證，先詢問對⽅單位、職稱、姓名等，掛斷電話後再向該單位求證。<br>檢警調等單位處理司法案件，如有必要將以通知書通知涉案⼈到案說明或⾄指定機關繳交款項。⺠眾若有疑慮應及時撥打「110」通報警⽅派員處理，或撥打「165」反詐騙諮詢電話諮詢。",
  "千萬不要聽信任何⼈（包含賣家或銀⾏⼈員）以「解除ATM設定」、「誤刷條碼」、「誤設訂單」、「重複扣款」、「⾄ATM操作資料整理」、「開啟網路購物的個資啟⽤權限」、「超商購My Card點數卡、比特幣」為游去ATM修正設定或是到超商購買遊戲點數，這絕對是詐騙！若有疑慮請撥165專線查證，勿聽信來電電話。<br>⾃動提款機沒有取消約定扣帳功能，千萬不要依照電話指⽰操作⾃動提款機。<br>養成查證習慣，勿聽信不明來電指⽰。若有莫名的來電，請掛斷來電撥打銀⾏客服電話查證，或撥165專線查證，勿聽信來電電話。<br>不要點選來路不明郵件，並請安裝防毒軟體，避免歹徒盜錄⽤⼾交易資料。要慎選買家，選擇較安全的付費⽅式（如當⾯交易或貨到付款）。<br> 習慣於網路購物交易的⺠眾，0200、0800、0900、0204起頭之電話都是虛擬碼，只能單⽅聽電話，無法撥出，亦不會顯⽰號碼於被害⼈⼿機上。",
  "財政部⾦融局或其他相關單位，不會要求⽤⼾持⾦融卡，依其指⽰操作去更改⾦融卡密碼。更改⾦融卡密碼只要⾃⾏持⾦融卡⾄提款機前，請按照提款機指⽰步驟，依序操作更改即可。<br>ATM只能提款、存款及轉帳，沒有退款、解除分期設定或⾝分驗證等的功能，請存⼾與保 ⼾務必留意，並切勿聽信歹徒電話指⽰到ATM操作任何功能，或將個⼈資料、⾦融卡密碼 及存摺密碼告訴歹徒，以免遭受詐騙。<br> 銀⾏簡訊內容中皆不會留存任何電話號碼，銀⾏客⼾服務電話皆註記於⾦融卡、信⽤卡或 存摺背⾯；接獲簡訊，請勿依該顯⽰號碼回覆電話，若有任何疑問，請先撥打銀⾏客服電 話與客服⼈員聯絡求證，或撥打警⽅防制詐騙專線（直撥165）加以確認，以免成為歹徒詐 騙之對象。",
  "隨著現代科技的進步造就社會繁榮，⺠眾⽣活品質也開始提升，尤其在網路技術⽇新 ⽉異的推波助瀾下，更是以無時差、無國界的形 式傳播資訊。雖然網路讓⺠眾⽣活更加 便利，卻也被有⼼⼈⼠利⽤成為犯罪途徑。近來發⽣中央研究院學術界⼈⼠及影星等重⼤ 詐騙案件，便是因為詐騙集團利⽤網路或其他途徑不法取得⺠眾個資後，利⽤假檢警及操 作ATM解除分期付款等⽅式進⾏詐騙。此外也有藉由網路拍賣購物等模式騙取⺠眾財 產，⺠眾因⽽在不知情的情況下受騙，詐騙⼿法可說是層出不窮。 另今年警察機關查獲⾺勝集團不法吸⾦⾼達數⼗億之多，主要亦是利⽤⼈們想快速獲 利並致富的⼼理，塑造出跨國專業投資機構的假象，以操作外匯⽅式獲取超⾼利潤為誘因 吸引眾多⺠眾前來投資所致。綜上所述，詐欺犯罪不僅危害到社會⼤眾的財產，⽽且還衍 ⽣出許多社會問題，像是⼈與⼈之間彼此不信任、道德淪喪、價值觀偏差等，影響層⾯不容忽視。",
];
let str2 = [
  "假冒機構公務員或警察機構詐財⼿法及預防策略",
  "冒拍賣賣家詐騙預防策略",
  "假冒銀⾏詐騙預防策略",
  "詐欺案件概況分析",
];
function changeText(val) {
  var contentElement = document.getElementById("content");
  contentElement.innerHTML = str[val];
  var title3Element = document.getElementById("title3");
  title3Element.innerText = str2[val];
}
//側邊欄有許多文字 按下可更改主要內容為已儲存的文字
function changeContent(text, text2) {
  var contentElement = document.getElementById("content");
  contentElement.textContent = text;
  var title3Element = document.getElementById("title3");
  title3Element.innerText = "犯案類型»" + text2;
}
//如果你想要多個按鈕在滑鼠移動到上面時更換顏色，為每個按鈕添加相應的事件監聽器
var buttons = document.querySelectorAll(".button");
buttons.forEach(function (button) {
  button.addEventListener("mouseenter", function () {
    button.style.backgroundColor = '#ADD8E6';
  });
  button.addEventListener("mouseleave", function () {
    button.style.backgroundColor = "white";
  });
});
//照片依指定的時間更換與循環，也可讓使用者往前往一張或後一張做瀏覽
let slideIndex = 0;
const slides = document.getElementsByClassName("slide");
function showSlide(n) {
  slideIndex = (n + slides.length) % slides.length;
  for (let i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  slides[slideIndex].style.display = "block";
}
function changeSlide(n) {
  showSlide(slideIndex + n);
}
setInterval(() => {
  changeSlide(1);
}, 5000);
showSlide(slideIndex);