# Scoop安裝操作
> 在 Windows Terminal 操作
## 安裝Scoop
> |   | 主控台 | 作用 | 補充 |
> |:-:|:-:|:-:|:-:|
> | 1 |Set-ExecutionPolicy RemoteSigned -scope CurrentUser|||
> | 2 |Invoke-Expression (New-Object System.Net.WebClient).DownloadString('https://get.scoop.sh')|||
## 安裝軟件
>https://scoop.sh/
> |   | 主控台 | 作用 | 補充 |
> |:-:|:-:|:-:|:-:|
> | 1 |scoop search (應用程式名)|搜尋所有可用的軟件|如果找不到:No matches found.|
> | 2 |scoop bucket add extras|加入bucket||
> | 3 |scoop install extras/(應用程式名)|安裝||
## 其他
> |   | 主控台 | 作用 | 補充 |
> |:-:|:-:|:-:|:-:|
> | 1 |scoop update (應用程式名)|更新||
> | 2 |scoop uninstall (應用程式名)|卸載||

