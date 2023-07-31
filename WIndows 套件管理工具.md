# Scoop安裝操作
> * 命令行操作：這使得**在 Windows Terminal 操作**進行軟件的安裝、更新和卸載變得更加方便。
> * 自動化安裝：可以自動下載、安裝並配置軟件，無需用戶進行繁瑣的手動步驟。
> * 版本控制：允許用戶安裝特定版本的軟件，這對於需要固定特定版本的應用程序或套件來說非常有用。
> * 輕量級：相比於其他一些套件管理工具，不需要大量系統資源。
> * 支援社區維護：社區中的開發者可以貢獻並更新新的套件。
> * 不需要系統管理員權限：使得它在受限制的環境下也可以使用。
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
> | 1 |scoop status|檢查版本更新||
> | 2 |scoop update|更新||
> | 3 |scoop uninstall (應用程式名)|卸載||

