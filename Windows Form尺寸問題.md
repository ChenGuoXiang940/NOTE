# Windows Form尺寸問題
> ## 原因說明
> 程式有分為 DPI 感知與非 DPI 感知的應用程式，端看當初程式中是否有加入此功能，在早期的作業系統下螢幕還沒這麼高級，
> 大多為 96 DPI，導致許多程式就沒考慮到現在的高 DPI 螢幕例如現在的 120、144、192 等，因此大部分舊應用程式都為非感知 DPI 的類型。
> 到後來 Microsoft 發展出 DPI Virtualization，此技術運作模式大概是這樣的，當應用程式沒有先聲明它能支援多少 DPI 時，
> Windows 會先將它放進沙盒裡，在這裡面沙盒內是先將應用程式渲染成 96 DPI 解析度下的畫面，然後看實際上的解析度多少再進行縮放，
> 也因為如此，非感知 DPI 的應用程式在高 DPI 的螢幕下會出現模糊的情況。
> |名稱|說明|
> |:-:|:-:|
> |DPI|越大 DPI 的螢幕，可以使用更多像素來顯示一張圖|
> |pt|全形文字的 72 pt = 1 inch |
> ## 如何讓 C# 設計出來的視窗字體不會模糊
>> ```cs
>> [STAThread]
>> static void Main()
>> {
>>    if (Environment.OSVersion.Version.Major >= 6)
>>        SetProcessDPIAware();
>>    Application.EnableVisualStyles();
>>    Application.SetCompatibleTextRenderingDefault(false);
>>    Application.Run(new Form1());
>> }
>> [System.Runtime.InteropServices.DllImport("user32.dll")]
>> public static extern bool SetProcessDPIAware();
>> ```
