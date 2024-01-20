# <p align="center">VSCode筆記</p>
Visual Studio Code（簡稱 VSCode）是一款功能強大且廣泛使用的程式碼編輯器，它提供了許多方便的功能和快速鍵，讓程式開發變得更加高效，以下是一些常用的快速鍵和撰寫程式技巧。
## <p align="center">鍵盤快速鍵</p>
<table align="center">
	<tr>
		<th></th>
		<th>按鍵</th>
		<th>名稱</th>
		<th>功能</th>
	</tr>
	<tr>
		<td>1</td>
		<td>Ctrl+S</td>
		<td>儲存全部檔案</td>
		<td>快速保存你正在編輯的所有檔案。Live Sever 刷新網頁</td>
	</tr>
	<tr>
		<td>2</td>
		<td>Ctrl+Alt+N</td>
		<td>執行</td>
		<td>執行你的程式</td>
	</tr>
	<tr>
		<td>3</td>
		<td>Ctrl+Alt+M</td>
		<td>停止執行</td>
		<td>如果你正在執行程式並想要停止執行</td>
	</tr>
	<tr>
		<td>4</td>
		<td>Ctrl+J</td>
		<td>隱藏/顯示面板</td>
		<td>有主控台的地方</td>
	</tr>
	<tr>
		<td>5</td>
		<td>Ctrl+Shift+P</td>
		<td>命令</td>
		<td>打開命令面板。可執行各種命令，如：編輯器設置、擴充功能</td>
	</tr>
</table>

## <p align="center">程式碼範本</p>
在 VSCode 中，你可以使用程式碼範本（Snippet）功能來加速你的程式碼編寫過程。這對於經常使用相似程式碼片段的開發人員特別有用。
### <p align="center">1.使用步驟</p>
1. 按鍵 `Ctrl+Shift+P`： 使用這個快速鍵來打開命令面板。
2. 搜尋 `Configure User Snippets`： 在命令面板中，輸入並選擇 "Configure User Snippets" 選項。這將帶你到程式碼範本的配置頁面。
3. 點擊 `(語言).json`： 在配置頁面中，你會看到各種程式語言的選項。選擇你想要設置範本的語言，然後點擊進入相應的 .json 配置檔案。
通過編輯這個 .json 檔案，你可以定義你自己的程式碼範本。
### <p align="center">2.程式定義</p>
這些範本可以是常見的程式碼片段，可以在撰寫程式時快速輸入。這個功能極大地提高了你的開發效率，讓你能夠更專注於解決問題而不是重複編寫相似的程式碼。
```
"C++ Program Template": {
		"prefix": "cpp",
		"body": [
		  "#include<iostream>",
		  "using namespace std;",
		  "int main() {",
		  "    ios_base::sync_with_stdio(false);",
		  "    ",
		  "    return 0;",
		  "}"
		],
		"description": ""
	  }
```
1. `description` ： 在這個例子中，你會輸入 "cpp"，然後按 `Tab` 來插入程式碼片段。
2. `body` ： 定義程式碼片段的內容。在這個例子中，程式碼片段是一個基本的 C++ 程式範本。
3. `description` ： 這個描述會在自動完成下拉選單中顯示。
## <p align="center">主控台</p>
請注意，滑鼠右鍵是貼上，但按下 Ctrl+V 會是 `^V`
