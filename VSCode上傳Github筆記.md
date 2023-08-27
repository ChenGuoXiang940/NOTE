# github上傳筆記
這份教學將教你如何將程式碼上傳至GitHub，讓你可以輕鬆管理你的程式專案和筆記。
## 1.於GitHub建立Repository(儲存庫)
首先，在GitHub上建立一個新的儲存庫（Repository），用來存放你的程式碼和筆記。
## 2.於本機執行以下指令
在你的本機環境中，執行以下步驟來將程式碼上傳至GitHub。
|   | 主控台輸入程式 | 作用 |
|--:|:----------:|:----------------:|
| 1 |echo "# name" >> README.md|在這個name檔案中添加你的筆記和說明|
| 2 |git init|初始化本機此程式碼所在資料夾|
| 3 |git add README.md|上傳要關注的檔案|
| 4 |git commit -m "first commit"|建立版本訊息為first commit|
| 5 |git branch -M main|建立一個名為"main"的主要分支|
| 6 |git remote add origin https://github.com/chen199940/name.git|在本地數據庫上，加入遠端數據庫|
| 7 |git push -u origin main|上傳檔案|
## 3.還要上傳檔案的話
如果你需要再次上傳變更或更新你的程式碼和筆記，只需執行以下步驟：
|   | 主控台輸入程式 | 作用 |
|--:|:----------:|:----------------:|
| 1 |git add README.md|上傳要關注的檔案|
| 2 |git commit -m "first commit"|建立版本訊息為first commit|
| 3 |git push -u origin main|上傳檔案|
## 4.還要上傳檔案的話，其他上傳方法
除了上述的方法外，你還可以使用以下方式來上傳變更：
|   | SOURCE CONTROL | 作用 |
|--:|:----------:|:----------------:|
| 1 |在REPOSITORIES下按打勾| |
| 2 |寫完commit後再按Commit打勾| |
