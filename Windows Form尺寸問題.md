# Windows Form 高 DPI 支援與字體模糊問題解決方案
## 介紹
本文介紹了在 Windows Forms 應用程式中處理高 DPI 螢幕下的字體模糊問題，並提供了一段 C# 程式碼示例，以確保應用程式在不同 DPI 設定下正常運作。
## 問題背景
許多早期的 Windows Forms 應用程式並未考慮到高 DPI 螢幕的存在，導致在這些高解析度螢幕上顯示的內容模糊。這是因為在早期的作業系統中，螢幕解析度主要是 96 DPI，而現代高 DPI 螢幕可以達到 120、144 或 192 DPI。這種差異會影響應用程式介面的大小和字體的清晰度。
## 解決方案
為了解決高 DPI 螢幕下的字體模糊問題，我們可以使用以下步驟來優化 Windows Forms 應用程式。
1. **啟用 DPI 感知：** 確保應用程式能夠正確識別和適應不同的 DPI 設定。在較新的 Windows 版本中，可以使用 DPI 感知技術來處理這個問題。
2. **使用 DPI 虛擬化：** 當應用程式未明確聲明其支援的 DPI 時，Windows 使用 DPI 虛擬化來自動縮放應用程式介面。這意味著應用程式會以 96 DPI 渲染，然後根據實際 DPI 進行縮放。然而，這可能導致模糊的顯示效果。
3. **程式碼示例：** 以下是一個示範 C# 程式碼段，演示如何在應用程式入口點啟用 DPI 感知以解決字體模糊問題。
> |名稱|說明|
> |:-:|:-:|
> |DPI|越大 DPI 的螢幕，可以使用更多像素來顯示一張圖|
> |pt|全形文字的 72 pt = 1 inch |
## 如何讓 C# 設計出來的視窗字體不會模糊
如果作業系統版本大於等於 Windows Vista（版本號 >= 6），啟用 DPI 感知
```cs
 [STAThread]
 static void Main()
 {
    if (Environment.OSVersion.Version.Major >= 6)
        SetProcessDPIAware();
    Application.EnableVisualStyles();
    Application.SetCompatibleTextRenderingDefault(false);
    Application.Run(new Form1());
 }
 [System.Runtime.InteropServices.DllImport("user32.dll")]
 public static extern bool SetProcessDPIAware();
 ```
